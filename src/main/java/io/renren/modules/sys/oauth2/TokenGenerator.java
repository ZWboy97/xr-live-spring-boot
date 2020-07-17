/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.sys.oauth2;

import io.renren.common.exception.RRException;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * 生成token
 *
 * @author Mark sunlightcs@gmail.com
 */
public class TokenGenerator {

    public static String generateValue() {
        return generateValue(UUID.randomUUID().toString());
    }
    // 作为最终生成16进制串的字典
    private static final char[] hexCode = "0123456789abcdef".toCharArray();

    /**
     * 将数组转换成16进制的字符串
     * @param data
     * @return
     */
    public static String toHexString(byte[] data) {
        if(data == null) {
            return null;
        }
        StringBuilder r = new StringBuilder(data.length*2); // 四位对应一个16进制字符
        for ( byte b : data) {
            r.append(hexCode[(b >> 4) & 0xF]); // 取高四位：先右移，然后位与取低四位
            r.append(hexCode[(b & 0xF)]); // 取低四位：直接位与取低四位
        }
        return r.toString();
    }

    public static String generateValue(String param) {
        try {
            // 摘要算法，这里采用MD5算法
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(param.getBytes()); // 输入的串
            byte[] messageDigest = algorithm.digest(); //生成摘要
            return toHexString(messageDigest);
        } catch (Exception e) {
            throw new RRException("生成Token失败", e);
        }
    }
}

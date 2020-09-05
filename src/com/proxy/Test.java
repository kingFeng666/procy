package com.proxy;

/**
 * @ClassName: Test
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 05 22:28
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        taobao taobao = new taobao();
        float pricce =taobao.shell(1);
        System.out.println(pricce);
    }
}

package com.proxy;

/**
 * @ClassName: taobao
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 05 22:15
 * @Version 1.0
 */
public class taobao implements usb {
    private usb usb =new usbFactory();
    @Override
    public float shell(int count) {
       float price= usb.shell(1);
       price=price+25;
        return price;
    }
}

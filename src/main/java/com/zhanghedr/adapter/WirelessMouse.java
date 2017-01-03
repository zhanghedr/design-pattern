package com.zhanghedr.adapter;

/**
 * Wireless Mouse with USB receiver
 *
 * @author hzhang
 */
public class WirelessMouse {

    private Usb usb;

    public WirelessMouse(Usb usb) {
        this.usb = usb;
    }

    public void plugin() {
        usb.pluginUsb();
    }

}

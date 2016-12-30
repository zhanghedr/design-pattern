package com.zhanghedr.adapter;

/**
 * Need to use wireless mouse with USB receiver for 2016 MacBook Pro, So we need
 * a port adapter to connect USB to TypeC.
 * 
 * @author hzhang
 *
 */
public class App {

    public static void main(String[] args) {
        WirelessMouse mac = new WirelessMouse(new PortAdapter(new TypecImpl()));
        mac.plugin();
    }

}

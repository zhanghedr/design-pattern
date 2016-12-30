package com.zhanghedr.adapter;

/**
 * USB to TypeC for 2016 MacBook Pro
 * 
 * @author hzhang
 *
 */
public class PortAdapter implements Usb {

    private Typec typec;

    public PortAdapter(Typec typec) {
        this.typec = typec;
    }

    @Override
    public void pluginUsb() {
        typec.pluginTypec();
    }

}

package com.lsj.bridge;

public class AdvancedRemoteControl extends DefaultRemoteControl{

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote : mute");
        device.setVolume(0);
    }
}

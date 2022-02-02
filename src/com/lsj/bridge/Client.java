package com.lsj.bridge;

public class Client {
    public static void main(String[] args) {
        test(new Radio());
        test(new Tv());
    }

    public static void test(Device device) {
        System.out.println("Test with Default Remote");
        DefaultRemoteControl defaultRemoteControl = new DefaultRemoteControl(device);

        defaultRemoteControl.power();
        device.printStatus();

        System.out.println("Test with Advanced Remote");
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(device);

        advancedRemoteControl.power();
        advancedRemoteControl.mute();
        device.printStatus();
    }
}

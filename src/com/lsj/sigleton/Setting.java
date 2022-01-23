package com.lsj.sigleton;

public class Setting {
//    private static Setting instance;

    private Setting() {}

    private static class SettingHolder {
        private static final Setting INSTANCE = new Setting();
    }

    //멀티 쓰래드환경에서 안전하지 않음.
//    public static Setting getInstance() {
//        if(instance == null) {
//            instance = new Setting();
//        }
//        return instance;
//    }

    public static Setting getInstance() {
        return SettingHolder.INSTANCE;
    }
}

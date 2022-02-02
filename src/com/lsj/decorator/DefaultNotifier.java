package com.lsj.decorator;

public class DefaultNotifier implements Notifier {

    @Override
    public void sendMessage(String message) {
        System.out.println("메시지를 전송 합니다. 내용은 "+ message);
    }
}

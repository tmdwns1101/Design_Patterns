package com.lsj.decorator;

public class FaceBookNotifier extends NotifierDecorator {

    public FaceBookNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("FaceBook에 알림 메시지 전송, 전송 내용 : "+message);
    }
}

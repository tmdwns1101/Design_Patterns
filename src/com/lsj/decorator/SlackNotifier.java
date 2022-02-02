package com.lsj.decorator;

public class SlackNotifier extends NotifierDecorator{
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("Slack 에 메시지를 전송, 전송 내용 "+message);
    }
}

package com.lsj.decorator;


/*
* 모든 데코레이터들은 Notifier 타입이므로, 데코레이터 클래스들이 서로 참조 변수로 이용할 수 있다.
* */
public abstract class NotifierDecorator implements Notifier {

    /*wrappee 에 해당하는 참조 변수*/
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message);
    }
}

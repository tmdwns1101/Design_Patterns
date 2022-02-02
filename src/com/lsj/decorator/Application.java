package com.lsj.decorator;

public class Application {

    private static boolean isEnabledFaceBook = true;

    private static boolean isEnabledSlack = true;

    public static void main(String[] args) {
        Notifier notifier = new DefaultNotifier();

        if(isEnabledFaceBook && isEnabledSlack) {
            notifier =  new SlackNotifier(new FaceBookNotifier(notifier));
        } else if(isEnabledFaceBook) {
            notifier = new FaceBookNotifier(notifier);
        } else {
            notifier = new SlackNotifier(notifier);
        }

        notifier.sendMessage("Hello");
    }
}

package java_test.DesignPattern.BehavioralPatterns.Mediator;

import java.util.Date;

public class ChatRoom {
    public static void sendMessage(User user,String message){
        System.out.println(
                new Date() +
                " [ "+ user.getName() + " ]:" + message
        );
    }
}

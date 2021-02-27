package whitford.tweetclient;

public class SmsTweeter implements Tweeter {
    public void send(String msg) {
        System.out.println("Sending... " +  msg);
    }
}
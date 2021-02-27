package whitford.tweetclient;

public class TinyUrlShortener implements Shortener {
    public String shorten(String s) {
        return s.substring(0, 140);
    }

}

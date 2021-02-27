package whitford.tweetclient;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class TweetClient {
    private TextField textField = new TextField();

    private final Shortener shortener;
    private final Tweeter tweeter;

    @Inject
    public TweetClient(Shortener shortener, Tweeter tweeter) {
        this.shortener = shortener;
        this.tweeter = tweeter;
    }

    public void postButtonClicked() {
            String text = textField.getText();
            if (text.length() > 140) {
                text = shortener.shorten(text);
            }
            if (text.length() <= 140) {
                tweeter.send(text);
                textField.clear();
            }
    }
}

package whitford.tweetclient;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class TweetClient {

    private final Shortener shortener;
    private final Tweeter tweeter;
    private final TextField textField;

    @Inject
    public TweetClient(Shortener shortener, Tweeter tweeter, TextField textField) {
        this.shortener = shortener;
        this.tweeter = tweeter;
        this.textField = textField;
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

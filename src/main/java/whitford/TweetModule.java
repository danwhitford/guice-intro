package whitford;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import whitford.tweetclient.*;

public class TweetModule extends AbstractModule {
    protected void configure() {
        bind(TweetClient.class);
        bind(Tweeter.class).to(SmsTweeter.class);
        bind(TextField.class).to(UiTextField.class);
    }

    @Provides
    Shortener provideShortener() {
        return new TinyUrlShortener();
    }
}

package whitford;

import com.google.inject.Guice;
import com.google.inject.Injector;

import whitford.tweetclient.*;

public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new TweetModule());        
        TweetClient client = injector.getInstance(TweetClient.class);
        client.postButtonClicked();
    }
}

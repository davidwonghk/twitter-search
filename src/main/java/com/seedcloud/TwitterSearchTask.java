package com.seedcloud;

import twitter4j.*;
import twitter4j.api.*;

import java.lang.Runnable;
import java.util.Date;
import java.util.List;

/**
 * Runnable to searches the twitter API for a term at 
 * regular intervals and stores the results.
 */
public class TwitterSearchTask implements Runnable {
    
    private final Twitter twitter = new TwitterFactory().getInstance();
    private String keyword;
    

    public void run() {
        try { 
            searchTwiter(this.keyword); 
        } catch( TwitterException te) {
            te.printStackTrace();
        }
    }

    
    private void searchTwiter(String keyword) throws TwitterException {
        Query query = new Query(keyword);
        QueryResult result;
        do {
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
            }
        } while ((query = result.nextQuery()) != null);
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

}

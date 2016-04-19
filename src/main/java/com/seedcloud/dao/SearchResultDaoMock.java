package com.seedcloud.dao;

import java.util.Date;
import twitter4j.Status;

public class SearchResultDaoMock implements SearchResultDao {
    @Override
    public void insert(Date searchTime, Status tweet) {
        System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText()); }
}
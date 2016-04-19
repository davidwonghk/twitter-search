package com.seedcloud.dao;

import java.util.Date;
import twitter4j.Status;

/**
 * Data Access Object to store the search result from Twitter API
 */
public interface SearchResultDao {
    void insert(Date searchTime, Status tweet);
}
package com.seedcloud.dao;

import java.util.Date;
import twitter4j.Status;

public interface SearchResultDao {
    void insert(Date searchTime, Status tweet);
}
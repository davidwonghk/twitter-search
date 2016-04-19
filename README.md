# Twitter Search

## How to run
- under src/resources, edit the twitter4j.properties for authentication of the Twitter API
- under src/resources, edit applicationContext.xml for the cron job time (eg. per hour) and the search keyword (eg. testing)
- install Maven3 and run "mvn test"


## TODO
- There is a known issue of "rate limit exceed"
- The DAO is now a mock
- Username is not in the search criteria at this moment 

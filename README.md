java-match-webapp
=================

Java REST based Match Web App for 2013 Microsoft SDE Technical Exercise

To start, open command line and type

	mvn jetty:run


Microsoft SDE Technical Exercise
--------------------------------

ASP.NET MVC – C#, HTML, JavaScript, CSS

Let’s have:

- Match model class with the following properties: HomeTeamName (string), AwayTeamName (string), HomeScore (int), AwayScore (int), KickoffUtc (DateTime)

- MatchRepository class with this method: public Collection<Match> GetMatches(DateTime dateUtc)

Write an ASP.NET MVC app that can serve this URL: http://<baseurl>/matches/2013/9/5

The controller:
- Should only accept GET requests
- Uses the MatchRepository class to get matches (use a stub match repository class for this exercise, returning a collection of 1-2 matches per day for three consecutive days for easy testing, otherwise return an empty collection)

The view: 
- Displays a list of matches for the selected date as in the picture below (does not need to be pixel perfect).  
- Hyperlink the “earlier” / “later” text (does not need to be AJAX). E.g. when you browse http://<baseurl>/matches/2013/9/5, the “earlier” / “later” text will link to http://<baseurl>/matches/2013/9/4 and http://<baseurl>/matches/2013/9/6  
- Has a “Highlight” button at the bottom that uses JavaScript to turn all the even rows’ background to a different colour using a predefined CSS class (not inline).  

SQL
---
- Design data tables for the above example.
- Write the SQL query that would be used to fetch the match objects in the GetMatches method.
java-match-webapp
=================

Java REST based Match Web App made in Java 7 for the 2.5 Servlet specification that can be deployed in Apache Tomcat 7.0 (or higher) application server.  

Application Backend uses Maven 3 Open Source Apache dependency and build manager and Spring MVC 3.2 Open Source Java application framework, and Frontend uses HTML5 and JQuery 1.7.
 
A database schema was created describing a simple DB implementation for storing and retrieving matches data.
  
  /java-match-webapp/src/main/resources/schema.sql
 
Developed in 4h using Eclipse Open Source IDE for 2013 Microsoft SDE Technical Exercise, and tested in IE10, Chrome 30 and Firefox 24 on a computer running Windows 8 OS.


### Running the webapp

To start the webapp on http://localhost:8080/ setup Java 7 SDK and Maven 3, checkout the source code and type the following on the webapp root folder using the command-line:

	mvn jetty:run

Alternatively, start the webapp on http://localhost:8080/matches/ by uploading the matches.war to a running Tomcat 7+ web server.


Technical Exercise Description
------------------------------

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
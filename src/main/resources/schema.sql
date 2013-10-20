-- This is a simple DB schema for the test exercise created using MySQL dialect 
-- (changes should be minimal for other SQL dialects like MS SQL Server or Oracle). 
-- A better schema would have the teams stored in a separate table to avoid duplication.

Create Table Matches (
	match_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	HomeTeamName VARCHAR(255) NOT NULL,
	AwayTeamName VARCHAR(255) NOT NULL,
	HomeScore INT NOT NULL,
	AwayScore INT NOT NULL, 
	KickoffUtc DATETIME NOT NULL
);


insert into matches (HomeTeamName, AwayTeamName, HomeScore, AwayScore, KickoffUtc) values ('Home1','Away1',1,0,'2013-10-19 15:00');

insert into matches (HomeTeamName, AwayTeamName, HomeScore, AwayScore, KickoffUtc) values ('Home2','Away1',0,0,'2013-10-20 16:00');

insert into matches (HomeTeamName, AwayTeamName, HomeScore, AwayScore, KickoffUtc) values ('Home1','Away2',1,2,'2013-10-21 17:00');

-- Some queries to find matches for a given date
select * from matches where KickoffUtc between '2013-10-18' and '2013-10-19';
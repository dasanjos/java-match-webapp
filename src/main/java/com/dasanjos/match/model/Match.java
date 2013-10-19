package com.dasanjos.match.model;

import org.joda.time.DateTime;

public class Match {

	private String HomeTeamName;
	private String AwayTeamName;
	private int HomeScore;
	private int AwayScore;
	private DateTime KickoffUtc;

	public String getHomeTeamName() {
		return HomeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		HomeTeamName = homeTeamName;
	}

	public String getAwayTeamName() {
		return AwayTeamName;
	}

	public void setAwayTeamName(String awayTeamName) {
		AwayTeamName = awayTeamName;
	}

	public int getHomeScore() {
		return HomeScore;
	}

	public void setHomeScore(int homeScore) {
		HomeScore = homeScore;
	}

	public int getAwayScore() {
		return AwayScore;
	}

	public void setAwayScore(int awayScore) {
		AwayScore = awayScore;
	}

	public DateTime getKickoffUtc() {
		return KickoffUtc;
	}

	public void setKickoffUtc(DateTime kickoffUtc) {
		KickoffUtc = kickoffUtc;
	}
}

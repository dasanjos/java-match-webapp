package com.dasanjos.match.model;

import java.util.Date;

public class Match {

	private String HomeTeamName;
	private String AwayTeamName;
	private int HomeScore;
	private int AwayScore;
	private Date KickoffUtc;

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

	public Date getKickoffUtc() {
		return KickoffUtc;
	}

	public void setKickoffUtc(Date kickoffUtc) {
		KickoffUtc = kickoffUtc;
	}
}

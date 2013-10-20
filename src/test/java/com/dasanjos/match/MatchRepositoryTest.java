package com.dasanjos.match;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dasanjos.match.model.Match;

public class MatchRepositoryTest {

	private MatchRepository matchRepository;
	private DateTime today;

	@Before
	public void setup() {
		matchRepository = new MatchRepository();
		today = new DateTime();
	}

	@Test
	public void randomMatchScoresBetweenZeroAndNine() {
		Match match = matchRepository.randomMatch(today);
		assertTrue(0 <= match.getAwayScore() && match.getAwayScore() <= 9);
		assertTrue(0 <= match.getHomeScore() && match.getHomeScore() <= 9);
	}

	@Test
	public void randomMatchTeamNamesAreDifferent() {
		Match match = matchRepository.randomMatch(today);
		assertFalse(match.getAwayTeamName().equals(match.getHomeTeamName()));
	}

	@Test
	public void getMatchesReturnEmptyListBeforeYesterday() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(today
				.minus(Period.days(2)));
		assertNotNull(matches);
		assertTrue(matches.isEmpty());
	}

	@Test
	public void getMatchesReturnMatchesYesterday() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(today
				.minus(Period.days(1)));
		assertNotNull(matches);
		assertFalse(matches.isEmpty());
		assertTrue(1 <= matches.size() && matches.size() <= 2);
	}

	@Test
	public void getMatchesReturnMatchesToday() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(today);
		assertNotNull(matches);
		assertFalse(matches.isEmpty());
		assertTrue(1 <= matches.size() && matches.size() <= 2);
	}

	@Test
	public void getMatchesReturnMatchesTomorrow() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(today
				.plus(Period.days(1)));
		assertNotNull(matches);
		assertFalse(matches.isEmpty());
		assertTrue(1 <= matches.size() && matches.size() <= 2);
	}

	@Test
	public void getMatchesReturnEmptyListAfterTomorrow() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(today
				.plus(Period.days(2)));
		assertNotNull(matches);
		assertTrue(matches.isEmpty());
	}

}

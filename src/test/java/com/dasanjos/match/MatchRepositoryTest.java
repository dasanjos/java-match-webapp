package com.dasanjos.match;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.dasanjos.match.model.Match;

public class MatchRepositoryTest {

	private MatchRepository matchRepository;

	@Before
	public void setup() {
		matchRepository = new MatchRepository();
	}

	@Test
	public void randomMatchScoresBetweenZeroAndNine() {
		Match match = matchRepository.randomMatch(new Date());
		assertTrue(0 <= match.getAwayScore() && match.getAwayScore() <= 9);
		assertTrue(0 <= match.getHomeScore() && match.getHomeScore() <= 9);
	}

	@Test
	public void randomMatchTeamNamesAreDifferent() {
		Match match = matchRepository.randomMatch(new Date());
		assertFalse(match.getAwayTeamName().equals(match.getHomeTeamName()));
	}

	@Test
	public void getMatchesReturnEmptyListBeforeYesterday() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(new Date());
		assertNotNull(matches);
		assertTrue(matches.isEmpty());
	}

	@Test
	public void getMatchesReturnMatchesYesterday() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(new Date());
		assertNotNull(matches);
		assertFalse(matches.isEmpty());
		assertTrue(1 <= matches.size() && matches.size() <= 2);
	}

	@Test
	public void getMatchesReturnMatchesToday() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(new Date());
		assertNotNull(matches);
		assertFalse(matches.isEmpty());
		assertTrue(1 <= matches.size() && matches.size() <= 2);
	}

	@Test
	public void getMatchesReturnMatchesTomorrow() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(new Date());
		assertNotNull(matches);
		assertFalse(matches.isEmpty());
		assertTrue(1 <= matches.size() && matches.size() <= 2);
	}

	@Test
	public void getMatchesReturnEmptyListAfterTomorrow() throws Exception {
		Collection<Match> matches = matchRepository.getMatches(new Date());
		assertNotNull(matches);
		assertTrue(matches.isEmpty());
	}

}

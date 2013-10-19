package com.dasanjos.match.controller;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dasanjos.match.MatchRepository;

@Controller
public class Matches {

	private MatchRepository repository = new MatchRepository();

	@RequestMapping("/")
	public ModelAndView list() {
		return new ModelAndView("index", "matches",
				repository.getMatches(new DateTime()));
	}

	@RequestMapping(value = "/matches")
	public ModelAndView matches() {
		
		return new ModelAndView("index", "matches",
				repository.getMatches(new DateTime()));
	}

	@RequestMapping(value = "/matches/{year}/{month}/{day}", method = RequestMethod.GET)
	public ModelAndView matches(@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("day") int day) {

		return new ModelAndView("index", "matches",
				repository.getMatches(new DateTime(year, month, day, 12, 0)));
	}

}
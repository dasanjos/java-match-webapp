package com.dasanjos.match;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

import com.dasanjos.match.model.Match;

/**
 * Stub class that returns 1-2 matches per day for 3 consecutive days or empty
 * Collection otherwise. Match values are created randomly, using list of world
 * capital cities from Wikipedia: http://en.wikipedia.org/wiki/
 * List_of_national_capitals_in_alphabetical_order
 * 
 * @author Daniel
 * 
 */
public class MatchRepository {

	private static String[] WORLD_CAPITALS = { "Abu Dhabi", "Abuja", "Accra",
			"Adamstown", "Addis Ababa", "Algiers", "Alofi", "Amman",
			"Amsterdam", "Andorra la Vella", "Ankara", "Antananarivo", "Apia",
			"Ashgabat", "Asmara", "Astana", "Asuncion", "Athens", "Avarua",
			"Baghdad", "Baku", "Bamako", "Bandar Seri Begawan", "Bangkok",
			"Bangui", "Banjul", "Basse-Terre", "Basseterre", "Beijing",
			"Beirut", "Belgrade", "Belgrade", "Belmopan", "Berlin", "Berne",
			"Bishkek", "Bissau", "Bogota", "Brasilia", "Bratislava",
			"Brazzaville", "Bridgetown", "Brussels", "Bucharest", "Budapest",
			"Buenos Aires", "Bujumbura", "Cairo", "Canberra", "Caracas",
			"Castries", "Cayenne", "Charlotte Amalie", "Chisinau",
			"Cockburn Town", "Colombo", "Conakry", "Copenhagen", "Dakar",
			"Damascus", "Dhaka", "Diego Garcia", "Dili", "Djibouti", "Dodoma",
			"Doha", "Douglas, Isle of Man", "Dublin", "Dushanbe",
			"East Jerusalem", "El-Aaiun", "Flying Fish Cove", "Fort-de-France",
			"Freetown", "Funafuti", "Gaborone", "George Town", "Georgetown",
			"Gibraltar", "Grytviken", "Guatemala City", "Gustavia", "Hagatna",
			"Hamilton", "Hanoi", "Harare", "Havana", "Helsinki", "Hong Kong",
			"Honiara", "Islamabad", "Jakarta", "Jamestown", "Jerusalem",
			"Juba", "Kabul", "Kampala", "Kathmandu", "Khartoum", "Kiev",
			"Kigali", "Kingston", "Kingston", "Kingstown", "Kinshasa",
			"Kuala Lumpur", "Kuwait City", "Libreville", "Lilongwe", "Lima",
			"Lisbon", "Ljubljana", "Lome", "London", "Longyearbyen", "Luanda",
			"Lusaka", "Luxembourg", "Macao", "Madrid", "Majuro", "Malabo",
			"Male", "Mamoudzou", "Managua", "Manama", "Manila", "Maputo",
			"Mariehamn", "Marigot", "Maseru", "Mata Utu", "Mbabane",
			"Melekeok", "Mexico City", "Minsk", "Mogadishu", "Monaco",
			"Monrovia", "Montevideo", "Moroni", "Moscow", "Muscat",
			"N'Djamena", "Nairobi", "Nassau", "Nay Pyi Taw", "New Delhi",
			"Niamey", "Nicosia", "Nouakchott", "Noumea", "Nuku'alofa", "Nuuk",
			"Oranjestad", "Oslo", "Ottawa", "Ouagadougou", "Pago Pago",
			"Palikir", "Panama City", "Papeete", "Paramaribo", "Paris",
			"Philipsburg", "Phnom Penh", "Plymouth", "Podgorica", "Port Louis",
			"Port Moresby", "Port of Spain", "Port Vila", "Port-au-Prince",
			"Port-aux-Francais", "Porto-Novo", "Prague", "Praia", "Pretoria",
			"Pristina", "Pyongyang", "Quito", "Rabat", "Reykjavik", "Riga",
			"Riyadh", "Road Town", "Rome", "Roseau", "Saint Helier",
			"Saint-Denis", "Saint-Pierre", "Saipan", "San Jose", "San Juan",
			"San Marino", "San Salvador", "Sanaa", "Santiago", "Santo Domingo",
			"Sao Tome", "Sarajevo", "Seoul", "Singapur", "Skopje", "Sofia",
			"St Peter Port", "St. George's", "St. John's", "Stanley",
			"Stockholm", "Sucre", "Suva", "Taipei", "Tallinn", "Tarawa",
			"Tashkent", "Tbilisi", "Tegucigalpa", "Tehran", "The Valley",
			"Thimphu", "Tirana", "Tokyo", "Torshavn", "Tripolis", "Tunis",
			"Ulan Bator", "Vaduz", "Valletta", "Vatican City", "Victoria",
			"Vienna", "Vientiane", "Vilnius", "Warsaw", "Washington",
			"Wellington", "West Island", "Willemstad", "Willemstad",
			"Windhoek", "Yamoussoukro", "Yaounde", "Yaren", "Yerevan", "Zagreb" };

	public Collection<Match> getMatches(Date dateUtc) {
		Collection<Match> result = new ArrayList<>();
		// Check if dateUtc is today, yesterday or tomorrow
		if (true) {
			int matches = new Random().nextInt(2);
			for (int i = 0; i <= matches; i++) {
				result.add(randomMatch(new Date()));
			}
		}
		return result;
	}

	protected Match randomMatch(Date date) {
		Match match = new Match();
		Random random = new Random();
		int awayIndex = random.nextInt(WORLD_CAPITALS.length);
		match.setAwayTeamName(WORLD_CAPITALS[awayIndex]);
		int homeIndex;
		do {
			homeIndex = random.nextInt(WORLD_CAPITALS.length);
		} while (homeIndex == awayIndex);
		match.setHomeTeamName(WORLD_CAPITALS[homeIndex]);
		match.setAwayScore(random.nextInt(10));
		match.setHomeScore(random.nextInt(10));
		match.setKickoffUtc(date);
		return match;
	}
}

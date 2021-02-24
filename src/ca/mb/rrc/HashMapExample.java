package ca.mb.rrc;

import java.util.HashMap;

/**
 * Class creates an HashMap of <String, String>
 * Has method to iterate and print the HashMap elements
 * Has method to add element into HashMap
 * Has method to remove element from HashMap
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class HashMapExample {
	
	HashMap<String, String> countryMap = new HashMap<String, String>();
	
	public void loopThroughAllContryMap() {
		
		System.out.println("List of countries begins:");
		
		countryMap.forEach( (k,v) -> {
			
			System.out.println("Id: "+k+" Name: "+v);
			
		});
		
		System.out.println("List of countries ends.------------");
		
	}// End of loopThroughAllContryMap()
	
	public void removeCountryFromCountryMap(String countryId) {
		
		countryMap.remove(countryId);
				
	}// End of removeCountryFromCountryMap()
	
	public void addCountryIntoCountryMap(String countryId, String countryName) {
		
		countryMap.put(countryId, countryName);
		
	}// End of addCountryIntoCountryMap()

}// End of class

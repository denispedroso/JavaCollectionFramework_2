package ca.mb.rrc;

/**
 * This is to address the Java Collection Framework assignment 2
 * from ADEV-1001 Programming (Java 2)
 * 
 * It creates and instance of HashMapExample class
 * call HashMapExample method to add elements into HashMap
 * call HashMapExample method to remove elements from HashMap
 * call HashMapExample method to loop through all elements from HashMap
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class HashMapExampleTest {

	public static void main(String[] args) {
		HashMapExample hashMapExample = new HashMapExample();

		hashMapExample.addCountryIntoCountryMap("US", "United States");
		hashMapExample.addCountryIntoCountryMap("CAN", "Canada");
		hashMapExample.addCountryIntoCountryMap("UK", "United Kingdom");
		hashMapExample.addCountryIntoCountryMap("FRC", "France");
		hashMapExample.addCountryIntoCountryMap("IT", "Italy");
		
		hashMapExample.loopThroughAllContryMap();
		
		hashMapExample.removeCountryFromCountryMap("FRC");
		
		hashMapExample.addCountryIntoCountryMap("SP", "Spain");
		
		hashMapExample.loopThroughAllContryMap();
		
	} // End of main
}// End of class

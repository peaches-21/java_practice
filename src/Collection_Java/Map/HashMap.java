public class HashMap {
    /*
     A HashMap stores items in key/value pairs, where each key maps to a specific value.
     It is part of the java.util package and implements the Map interface.
     Instead of accessing elements by an index (like with ArrayList), 
     you use a key to retrieve its associated value.
     A HashMap can store many different combinations, such as:
     String keys and Integer values
     String keys and String values
     */

     public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");

    System.out.println(capitalCities);
  }
}

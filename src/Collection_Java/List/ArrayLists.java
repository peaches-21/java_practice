public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
        System.out.println(cars);
    }
}

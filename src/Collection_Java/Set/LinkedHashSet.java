public class LinkedHashSet {
    //Use LinkedHashSet when you want a set that does not allow duplicates, keeps the original insertion order.
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);
  }
}

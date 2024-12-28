public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("blue", "Tesla");
        garage.park(car1);
    }
}
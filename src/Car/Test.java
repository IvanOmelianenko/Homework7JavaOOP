package Car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("electric", "auto", "Tesla", 250, "black");
        car.setEngine("diesel");
        car.setColor("camo");
        car.setMaxSpeed(200);
        System.out.println(car);
    }

}

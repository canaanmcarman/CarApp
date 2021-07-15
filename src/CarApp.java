public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Red");
        car1.setName("Porche");
        car1.setCurrentSpeed(50);
        car1.setEngine("v8");
        car1.setMpg(30);
        car1.setTopSpeed(100);

        Car car2 = new Car();
        car2.setColor("Blue");
        car2.setName("Toyota");
        car2.setCurrentSpeed(45);
        car2.setEngine("v6");
        car2.setMpg(35);
        car2.setTopSpeed(70);


        System.out.println(car1.start());
        System.out.println(car1.accelerate());
        System.out.println(car1.currentSpeed());
        System.out.println(car1.topSpeed());
        System.out.println(car1.stop());
    }
}

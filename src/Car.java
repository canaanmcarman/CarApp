public class Car extends Vehicle {
    public String accelerate() {
        return "The " + getColor() + " " + getName() + " is accelerating!";
    }
    public String stop() {
        return "The " + getColor() + " " + getName() + " is stopping";
    }
    public String topSpeed() {
        return "The " + getColor() + " " + getName() + " is reaching it's top speed of " + getTopSpeed();
    }
    public String start() {
        return "The " + getColor() + " " + getName() + " is starting it's " + getEngine() + " engine";
    }
    public String currentSpeed() {
        return "The " + getColor() + " " + getName() + " is reaching a speed of " + getCurrentSpeed();
    }
}
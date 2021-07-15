public class Vehicle {
    private String name, engine, color;
    private int mpg, topSpeed, currentSpeed;

    public Vehicle() {
        this.name = "";
        this.engine = "";
        this.color = "";
        this.mpg = 0;
        this.topSpeed = 0;
        this.currentSpeed = 0;
    }
    public Vehicle(String name, String engine, String seating, String color, int mpg, int topSpeed, int currentSpeed) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.mpg = mpg;
        this.topSpeed = topSpeed;
        this.currentSpeed = currentSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed() {
        return this.topSpeed;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setEngine (String engine) {
        this.engine = engine;
    }
    public String getEngine () {
        return this.engine;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }


}

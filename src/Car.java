public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        super.service();
        checkEngine();
    }
}

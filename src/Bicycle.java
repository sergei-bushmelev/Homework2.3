public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public static void checkBicycles(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle.check(bicycles[i]);
        }
    }
}
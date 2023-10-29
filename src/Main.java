public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.createC("Toyota");
        Car merc = factory.createC("Mercedes");
        toyota.create();
        merc.create();
    }
}

public interface Car {
    void create();
}

public class Toyota implements Car {
    @Override
    public void create() {
        System.out.println("Toyota is created");
    }
}

public class Mercedes implements Car {
    @Override
    public void create() {
        System.out.println("Mercedes is created");
    }
}

public class Factory {
    public Car createC(String model) {
        switch (model) {
            case "Toyota":
                return new Toyota();
            case "Mercedes":
                return new Mercedes();
            default:
                return null;
        }

    }
}
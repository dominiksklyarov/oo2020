import java.util.ArrayList;
import java.util.List;

class Car {
    private int mass;
    private int lenght;
    private int width;
    public List<Rim> wheels = new ArrayList<>();

    Car(int mass, int lenght, int width) {
        this.mass = mass;
        this.lenght = lenght;
        this.width = width;
    }

    void addWheel(Rim wheel) {
        this.wheels.add(wheel);
    }

    public void list() {
        for (int i = 0; i < wheels.size(); i++) {
            System.out.println("Wheel " + (i + 1) + " " + wheels.get(i).getTire().getType() + " tire on "
                    + wheels.get(i).getSize() + " inch rim");
        }
    }
}

class Rim {
    private int size;
    private Tire tire;

    Rim(int size) {
        this.size = size;
    }

    void addTire(Tire tire) {
        this.tire = tire;
    }

    Tire getTire() {
        return this.tire;
    }

    int getSize() {
        return this.size;
    }
}

class Tire {
    int size;
    String type;

    Tire(int size, String type) {
        this.size = size;
        this.type = type;
    }

    String getType() {
        return this.type;
    }
}

class Main {
    public static void main(String[] args) {
        Car auto = new Car(1900, 4000, 1600);
        for (int i = 0; i < 4; i++) {
            Rim velg = new Rim(17);
            Tire rehv = new Tire(17, "SUMMER");
            velg.addTire(rehv);
            auto.addWheel(velg);
        }
        System.out.println(auto.wheels.size());
        auto.list();
    }
}
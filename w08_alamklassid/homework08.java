class Man {
    private int height;
    private int mass;

    Man(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    void move() {
        System.out.println("Move");
    }

    void jump() {
        System.out.println("Jump");
    }

    void run() {
        System.out.println("Run");
    }
}

class Superman extends Man {
    Superman(int mass, int height) {
        super(mass, height);
    }

    void fly() {
        System.out.println("Fly");
    }
}

class Main {
    public static void main(String[] args) {
        Man klass1 = new Man(90, 190);
        Superman klass2 = new Superman(90, 190);
        klass1.jump();
        klass1.move();
        klass1.run();
        klass2.jump();
        klass2.move();
        klass2.run();
        klass2.fly();
    }
}
interface Roopkulikuline {
    int korgus();

    int pikkus();

    double pindala();
}

class Ruut implements Roopkulikuline {
    private int a;

    Ruut(int a) {
        this.a = a;
    }

    @Override
    public int korgus() {
        return this.a;
    }

    @Override
    public int pikkus() {
        return this.a;
    }

    @Override
    public double pindala() {
        return this.a * this.a;
    }
}

class Ristkulik implements Roopkulikuline {
    private int a;
    private int b;

    Ristkulik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int korgus() {
        return this.b;
    }

    @Override
    public int pikkus() {
        return this.a;
    }

    @Override
    public double pindala() {
        return this.a * this.b;
    }
}

class Main {
    public static void main(String[] args) {
        Ruut kujund1 = new Ruut(5);
        Ristkulik kujund2 = new Ristkulik(5, 10);
        System.out.println("Kujund1: Kõrgus:" + kujund1.korgus() + " Pikkus:" + kujund1.pikkus() + " Pindala: "
                + kujund1.pindala());
        System.out.println("Kujund2: Kõrgus:" + kujund2.korgus() + " Pikkus:" + kujund2.pikkus() + " Pindala: "
                + kujund2.pindala());
    }
}
class Creature {
    public void produceSound() {
        System.out.println("Creature produces sound");
    }
}

class Canine extends Creature {
    public void produceSound() {
        System.out.println("Canine barks");
    }
}

class Feline extends Creature {
    public void produceSound() {
        System.out.println("Feline meows");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Creature c1 = new Canine();
        Creature c2 = new Feline();

        c1.produceSound();
        c2.produceSound();
    }
}

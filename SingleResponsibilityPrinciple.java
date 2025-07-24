class Learner {
    String name;

    Learner(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Learner Name: " + name);
    }
}

class LearnerData {
    void store(Learner learner) {
        System.out.println("Storing learner name: " + learner.name);
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Learner l = new Learner("Dhoohitha");
        l.showInfo();

        LearnerData data = new LearnerData();
        data.store(l);
    }
}

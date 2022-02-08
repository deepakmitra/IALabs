package packageone;

public class mymethods {
    private int roll;
    private String name;

    public mymethods() {
    }

    public mymethods(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "mymethods{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

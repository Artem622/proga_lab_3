package Items;

public enum Time {
    BEFORE("Прежде всего "), NOW("сейчас "), RIGHTHERE("тут же ");

    private final String time;
    Time(String name) {
        this.time = name;
    }
    public String toString() {
        return this.time;
    }
}

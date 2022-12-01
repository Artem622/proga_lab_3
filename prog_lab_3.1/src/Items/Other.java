package Items;

public enum Other {
    DOT(". "), COMMA(", ");
    private final String other;

    Other(String name) {
        this.other = name;
    }


    public String toString() {
        return this.other;
    }
}

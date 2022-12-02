package Items;

public enum How {
    PURELY("чисто "), ALTHOUGH("хотя "), IMPTRCEPTIBLY("тут же незаметно "), STRONGLY("изо всех сил "), TOO("тоже "), GLOOMILY(" мрачно "), HOW("как ");

    private final String how;
    How(String name) {
        this.how = name;
    }

    public String toString() {
        return this.how;
    }
}

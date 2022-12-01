package Items;

public enum Where {
    INDOOR("в дверях "), BYWINDOW("к окну "), UNDERCURTAIN("под занавеску "), ONROOF("на крыше "), FORWHICH("за которой ");

    private final String where;
    Where(String where) {
        this.where = where;
    }
    public String toString() {
        return this.where;
    }
}

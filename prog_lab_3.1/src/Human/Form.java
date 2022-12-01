package Human;

public enum Form {
    HE("он "), SHE("она "), HER("ее "), HIS("его "), ITHE("это он "), MYSELF("сам "), HIM("него "), BHE("Он ");

    private final String form;
    Form (String form) {this.form = form;}
    public String toString() {return this.form;}
}

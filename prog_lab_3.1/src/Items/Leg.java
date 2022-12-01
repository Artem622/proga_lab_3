package Items;

import Human.Size;
public class Leg extends Item {
    public Leg(String name, Size size){
        super(name,size);
    }
    @Override
    public String toString(){
        return "вымытые босые " + this.name;
    }
    @Override
    public int hashCode() {
        return this.hashCode();
    }

    public String BigLeg(){
        return "большие ";
    }
}

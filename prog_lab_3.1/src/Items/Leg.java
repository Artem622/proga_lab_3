package Items;

import Human.Human;
import Human.Size;

import java.util.Objects;

public class Leg extends Item {
    public Leg(String name, Size size){
        super(name,size);
    }
    @Override
    public String toString(){
        return "вымытые босые " + this.name;
    }


    public String BigLeg(){
        return "большие ";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}

package Items;

import Human.Size;
public class Cord extends Item{
    public Cord(String name, Size size){
        super(name,size);
    }
    @Override
    public String toString(){
        return "был спрятан " + this.name;
    }
    @Override
    public  int hashCode(){
        return this.hashCode();
    }
}

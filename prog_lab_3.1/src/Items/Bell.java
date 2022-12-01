package Items;

import Human.Size;
public class Bell extends Item{
    public Bell(String name, Size size){
        super(name,size);
    }
    @Override
    public String toString(){
        return "зазвенел " + this.name;
    }
    @Override
    public  int hashCode(){
        return super.hashCode();
    }
}

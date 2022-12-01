package Items;

import Human.Size;

import java.util.Objects;

public abstract class Item {
    String name;
    Size size;
    Item(String name, Size size){
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Objects.equals(name, item.name) && size == item.size;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

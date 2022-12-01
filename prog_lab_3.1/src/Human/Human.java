package Human;

import java.util.Objects;

public class Human implements PhMove, Move {
    String name;
    Size size;
    Sex sex;

    public Human(String name, Sex sex, Size size) {
        this.name = name;
        this.sex = sex;
        this.size = size;
    }



    @Override
    public  String appeared(){
        return "появилась";
    }

    @Override
    public String saw(){
        return " увидел ";
    }

    @Override
    public String fluttered(){
        return "затрепетал, как пойманная рыбка ";
    }

    @Override
    public String scared(){
        return "испугался ";
    }

    @Override
    public String waited(){
        return "ждал ";
    }

    @Override
    public String knew(){
        return "знал ";
    }

    @Override
    public String WillCome(){
        return "придет ";
    }

    @Override
    public String looked(){
        return "поглядела ";
    }

    @Override
    public String cheated(){
        return "схитрил ";
    }

    @Override
    public String force(){
        return "заставить ";
    }

    @Override
    public String ComeUp(){return "подойти ";}

    @Override
    public String shoved(){
        return "сунул руку ";
    }

    @Override
    public String pulled(){
        return "дернул ";
    }

    @Override
    public String heard(){
        return "услышал ";
    }

    @Override
    public String HeardWom(){
        return "услышала ";
    }

    @Override
    public String named(){return this.name;}

    @Override
    public String toString() {
        return this.size + " " + this.name;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + this.sex.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return Objects.equals(name, human.name) && size == human.size && sex == human.sex;
    }
}

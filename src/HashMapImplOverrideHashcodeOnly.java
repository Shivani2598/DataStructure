import java.util.HashMap;
import java.util.Map;

public class HashMapImplOverrideHashcodeOnly {
    public static void main(String[] args) {

        Human person1 = new Human(1, "a");
        Human person2 = new Human(1, "a");
        Map<Human,String> map=new HashMap<>();
        map.put(person1,"Cse");
        map.put(person2,"it");

        map.forEach((key,value)->
                System.out.println(key.name +" : "+value)

        );

        for(Human person: map.keySet()){
            System.out.println(map.get(person));
        }

    }

}
class Human{
    int id;
    String name;

    Human(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

}


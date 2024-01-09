import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class HashMapImplOverrideOnlyEquals {

    public static void main(String args[]) {
        Person person1 = new Person(1, "a");
        Person person2 = new Person(1, "a");

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(1, "Munna");
        m2.put(2, "Munni");

        Map<Person,String> map=new HashMap<>();
        map.put(person1,"Cse");
        map.put(person2,"it");

        m2.forEach((key,value)->
                System.out.println(key +" : "+value)

        );
        System.out.println("--------------------------------------");
        for(Person person: map.keySet()){
            System.out.println(map.get(person));
        }


    }

}

class Person{
    int id;
    String name;

    Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
        return true;
        if(this!=obj && this.getClass()!=obj.getClass()) return false;
        Person person=(Person) obj;
        return (this.id == person.id && person.name.equals(this.name));
    }

}

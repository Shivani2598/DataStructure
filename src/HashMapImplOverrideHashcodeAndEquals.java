

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Calling{

    int id;
    String name;

    Calling(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || obj.getClass()!=this.getClass()) return false;
        Calling person=(Calling) obj;
        return (person.name.equals(this.name) && person.id==this.id);
    }
    @Override
    public int hashCode()
    {
        return this.id;
    }




}
public class HashMapImplOverrideHashcodeAndEquals {
    public static void main(String args[]){

        Calling person1=new Calling(1,"Person1");
        Calling person2=new Calling(2,"Person2");

        Map<Calling,Integer> map=new HashMap<>();
        map.put(person1,1);
        map.put(person2,2);

        Map<Integer,String> m2=new HashMap<>();
        m2.put(1,"abc");
        m2.put(2,"mno");

        for(Calling person:map.keySet()){
            System.out.println(map.get(person));
        }
        for (Map.Entry<Integer, String> pair : m2.entrySet()) {
            System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue()));
        }
        m2.forEach((key, value) -> System.out.println(key + " : " + value));

    }

}


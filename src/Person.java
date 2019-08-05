
public class Person {

    String name;
    String address;

    /*
    void details(){
        System.out.println("Name of Person : "+name);
        System.out.println("Adrs of Person : "+address);
        System.out.println("_________________________");
    }
    */
    
    static void details(Person p){
        System.out.println("Name of Person : "+p.name);
        System.out.println("Adrs of Person : "+p.address);
        System.out.println("_________________________");
    }
    
    public static void main(String[] args) {

        Person p1=new Person();
        Person p2=new Person();
        
        p1.name="AAA"; p1.address="INDORE";
        p2.name="BBB"; p2.address="DELHI";
        
        Person.details(p1);
        Person.details(p2);
        
    }
}

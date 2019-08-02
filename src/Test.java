
public class Test {
    int a, b;   //non-static (instance)
    static int x, y; //static (class)
    
    public static void main(String[] args) {
        //instatiating the class Test thrice.
        //each instantiation will create an instance(object)
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        
        t1.a=10;        t1.b=20;
        t2.a=30;        t2.b=40;
        t3.a=50;        t3.b=60;
        System.out.println(t1.a+","+t1.b);
        System.out.println(t2.a+","+t2.b);
        System.out.println(t3.a+","+t3.b);
        System.out.println("______________________");
        t1.x=100;
        t2.x=200;
        t3.x=300;
        
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        
        
    }

}

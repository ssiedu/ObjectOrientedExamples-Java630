
public class Test {
    
    int x, y, z;

    void f1(){
        
    }
    public Test(){
        f1();
    }

    public Test(int p, int q){
        this();
        x=p;
        y=q;
    }

    public Test(int a, int b, int c){
        this(a,b);
        z=c;
    }
    
    void show(){
        System.out.println(x+","+y+","+z);
    }
    
    public static void main(String[] args) {
        
        Test t1=new Test(10,20,30);
        t1.show();
    }

}
/*
    some rules for using this keyword
    ------------------------------------
    1) matching constructor must exists.
    2) this must be the first statement of constructor.
    3) we cant call more than one constructor directly.
    4) chaining is allowed.
    5) recursive calls are not allowed.
    6) only a constructor can call another constructor.
        (you cant call them inside a method)
    7) a constructor can call a method.


*/

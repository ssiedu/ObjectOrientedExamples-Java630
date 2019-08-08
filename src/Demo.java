public class Demo {
    
    private int x, y;
    
    public Demo(){
        this(5);
        System.out.println("Zero Args");
    }
    public Demo(int p){
        System.out.println("One Args");
    }
    
    
    public Demo(Demo tmp){
        x=tmp.x;
        y=tmp.y;
    }
    public Demo(int a, int b){
        x=a; 
        y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }
    
    public static void main(String[] args) {

        Demo d=new Demo();
        
    
        /*
        Demo d2=new Demo(30,40);
        Demo d3=new Demo(d2);
        d1.show();
        d2.show();
        d3.show();
        */
    }
}
/*
1) Cons. is a method like body having same name as class.
2) They do not have a return type.
3) They may have an access modifier
4) They may or may not have arguments.
5) They can be overloaded also.
6) They are implicitly called during object creation.
    (matching args)
7) When you do not write any constructor, java internally
   provides a no-arg constructor for you, which is called
   default constructor.
8) Once you write your own constructor, default will lost.
9) They are generally used for initialization purpose.
10) constructor will be invoked once only on an object
    where as you can call a method any times.
11) java do not provide copy constructor but you can write
    your own.
    in place of copy constructor, java has given us a method
    called clone.
12) one constructor can call another constructor explicitly
    using this keyword.
*/

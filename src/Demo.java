public class Demo {
    
    int x;          //instance (non-static)
    static int y;   //class (static)
    
    //static method 
    static void disp(){
        //System.out.println(x);
        System.out.println(y);
    }
    
    //non-static (using instance and class var both)
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    
    
    public static void main(String[] args) {

        Demo d1=new Demo();
        Demo d2=new Demo();
        d1.x=10;
        d2.x=20;
        y=25;
        d2.show();
        
        Demo.disp();
    }
}

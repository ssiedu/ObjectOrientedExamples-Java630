
public class Demo {
    
    int x, y;   //non-static
    
    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println("_______________");
    }
    
    public static void main(String[] args) {

            Demo d1=new Demo();
            Demo d2=new Demo();
            d1.x=10; d1.y=20;
            d2.x=30; d2.y=40;
            d1.display();
            
    }
}


public class Trial {

    private int x, y;

    public Trial(int a, int b){x=a; y=b;}
    
    public void show(){System.out.println(x+","+y);}
    
    public static void main(String args[]) {

        Trial t1;//declaring a reference
        new Trial(10,20);//creating an object but not storing address
        Trial t2=new Trial(30,40);//creating object and storing address to t2
        Trial t3=t2;
        Trial t4=t3;
        t1=t3;
        t1.show();
        t2.show();
        t3.show();
        t4.show();
        
        System.out.println("___________________________");
        t3.x=50;
        t1.show();
        t2.show();
        t3.show();
        t4.show(); 
        System.out.println("___________________________");
        
        
        t3=new Trial(55,65);
        t2=t3;
        t1=new Trial(80,90);
        t1.show();
        t2.show();
        t3.show();
        t4.show(); 
        System.out.println("___________________________");
        t4=t1;
        t1.show();
        t2.show();
        t3.show();
        t4.show(); 
    }
}


public class Test {
    
    int x, y, z;
                            
                   //10    20
    public Test(int p, int q){
        x=p;
        y=q;
    }
                //10      20     30
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

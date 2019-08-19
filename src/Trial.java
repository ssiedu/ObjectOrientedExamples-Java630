public class Trial {

    private int x, y;

    public Trial(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Trial(int x) {
        this.x = x;
    }
  
    
    
    
    public void show()
    {
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("__________________");
    }
    
    public static void main(String args[]) {
        Trial t1=new Trial(10,20);
        Trial t2=new Trial(30,40);
        
        t1.show();
        t2.show();
    
    }
}

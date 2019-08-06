
public class VarargsDemo {

    public static void show(String...s){
        
    }
    public static void add(int...v){
        int sum=0;
        for(int tmp:v){
            sum=sum+tmp;
        }
        System.out.println(sum);
                
    }
    
    public static void main(String[] args) {
        
        show("indore");
        show("indore","bhopal");
        show("indore","bhopal","mumbai");
        
       int x[]={11,12};
       int y[]={1,2,3};
       add(x);
       add(y);
       add(1,2,3,4);
       add(1,2,3,4,5);
       add(1,2,3,4,5,6,7,8,9,10);
        
    }
}

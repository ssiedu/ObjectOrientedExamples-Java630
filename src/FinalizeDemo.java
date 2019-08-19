
public class FinalizeDemo {

    private int data;
    
    public void finalize(){
        System.out.println("Object "+data+" Is About To Destroy ===================>>>>>>>>>>>>>>>>>");
    }
    public FinalizeDemo(int n){
        data=n;
        System.out.println("Object "+data+" Is Created...");
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Program Started....");
        int i=1;
        while(true){
            new FinalizeDemo(i);
            i++;
            Thread.sleep(2000);
            /*
            if(i%50000==0){
                System.gc();
            }
            */
        }
        
        //System.out.println("End of Program");
    }
}

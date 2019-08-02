public class TV {

    private int freq=100;
    
    public void remote(int btn){
        switch(btn){
            case 1:
                freq=100;
                System.out.println("Showing CN");
            break;
            case 2:
                freq=200;
                System.out.println("Showing ZTV");
            break;
            case 3:
                freq=300;
                System.out.println("Showing STV");
            break;
            case '4':
        }
    }
    
    
    public static void main(String args[]){
        
        TV t=new TV();
        t.remote(3);
        
    }
}
/*
    100 CN
    200 ZTV
    300 STV
    400 CNBC
    500 DIS

*/

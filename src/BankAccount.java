public class BankAccount {
    private int ano;
    private String name;
    private int balance;
    private static int totalDeposits;
    
    public static void showAvg(BankAccount p1, BankAccount p2){
        System.out.println("Avg of 2 : "+(p1.balance+p2.balance)/2);
    }                          
    public static void showAvg(BankAccount p1, BankAccount p2, BankAccount p3){
        System.out.println("Avg of 3 : "+(p1.balance+p2.balance+p3.balance)/3);
    }
    public static void showAvg(BankAccount p1, BankAccount p2, BankAccount p3, BankAccount p4){
        System.out.println("Avg of 4 : "+(p1.balance+p2.balance+p3.balance+p4.balance)/4);
    }
    public void showBalance(){
        System.out.println("Balance : "+balance);
    }
    public static void showTotal(){
        System.out.println("Total Deposits : "+totalDeposits);
    }
    public  void deposit(int amount){
        balance=balance+amount;
        totalDeposits=totalDeposits+amount;
    }
    public void showData(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+name);
        System.out.println("Avlbl Balance  : "+balance);
        System.out.println("__________________________________");
    }
    
   
    public  void setData(int a, String b, int c){
        ano=a;
        name=b;
        balance=c;
    }
}

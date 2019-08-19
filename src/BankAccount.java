public class BankAccount {
    private int ano;
    private String name;
    private int balance;
    private static int totalDeposits;

    public BankAccount(int a, String b, int c) {
        this.ano = a;
        this.name = b;
        this.balance = c;
    }

    public BankAccount() {
    }
    
    
    
    
    public static void show(BankAccount...account){
        for(int i=0; i<account.length; i++){
            System.out.println(account[i].ano+","+account[i].name+","+account[i].balance);
        }
    }
    
    //we want this method to accept 0 to n objects of BankAc
    public static void showAvg(BankAccount...v){
        int sum=0;
        int n=v.length;
        
        for(int i=0; i<n; i++){
            sum=sum+v[i].balance;
        }
        
        System.out.println("Avg Bal : "+(sum/n));
        
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

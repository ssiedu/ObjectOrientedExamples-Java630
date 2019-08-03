public class BankAccount {
    private int ano;
    private String name;
    private int balance;
    private static int totalDeposits;

    public void showTotal(){
        System.out.println("Total Deposits : "+totalDeposits);
    }
    public void deposit(int amount){
        balance=balance+amount;
        totalDeposits=totalDeposits+amount;
    }
    public void showData(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+name);
        System.out.println("Avlbl Balance  : "+balance);
        System.out.println("__________________________________");
    }
    
    public void withdraw(int amount){
        if(balance>=amount){
            System.out.println("Withdraw Allowed");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void setData(int a, String b, int c){
        ano=a;
        name=b;
        balance=c;
    }
}

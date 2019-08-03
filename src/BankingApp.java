
public class BankingApp {
    public static void main(String[] args) {
        BankAccount ac1=new BankAccount();
        BankAccount ac2=new BankAccount();
        BankAccount ac3=new BankAccount();
        ac1.setData(111,"AAA",10000);
        ac2.setData(112,"BBB",20000);
        ac3.setData(113,"CCC",30000);
        ac1.showData();
        ac1.deposit(5000);
        ac1.showData();
        ac2.showData();
        ac2.deposit(4000);
        ac2.showData();
        ac1.showTotal();
        ac2.showTotal();
        ac3.showTotal();
        
        /*
        System.out.println("Showing Account Details :");
        System.out.println("__________________________________");
        ac1.showData();
        ac2.showData();
        ac3.showData();
        System.out.println("Account 111 Is Trying To Withdraw 15000");
        System.out.println("______________________________________________");
        ac1.withdraw(15000);
        */
        
    }
}

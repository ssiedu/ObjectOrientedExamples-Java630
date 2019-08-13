
public class Employee {

    private int eno;
    private String ename;

    public boolean equals(Employee tmp){
        if(eno==tmp.eno){
            return true;
        }else{
            return false;
        }
    }
    
    public Employee(int a, String b) {
        eno = a;
        ename = b;
    }

    public void info() {
        System.out.println(eno + "," + ename);
    }

    public static void main(String[] args) {
        Employee e1=new Employee(111,"AAA");
        Employee e2=new Employee(111,"AAA");
        Employee e3=e1;
        e1.info();
        e2.info();
        e3.info();
        boolean r1=(e1==e2);//references
        boolean r2=(e1.equals(e2));//objects
        System.out.println(r1);
        System.out.println(r2);
        
    }
}

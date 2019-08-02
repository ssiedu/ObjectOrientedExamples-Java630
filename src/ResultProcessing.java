
public class ResultProcessing {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setMarks(50, 60, 70);
        
        Student s2=new Student();
        s2.setMarks(10, 20, 30);
        
        System.out.println("Result of Student-1");
        s1.computeTotal();
        //s1.computePercentage();
        System.out.println("Result of Student-2");
        s2.computeTotal();
        //s2.computePercentage();
        
        
    }
}
/*
    operations required on student object
    ---------------------------------------
1) initializing data
2) total calculate
3) percentage calculate
4) grade calculate
*/
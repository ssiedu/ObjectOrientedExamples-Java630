//blueprint of a student object

public class Student {
    private int rno;
    private String name;
    private  int marks1, marks2, marks3;
    
    
    public void setMarks(int a, int b, int c){
        marks1=a; 
        marks2=b;
        marks3=c;
    }
    
    public void computeTotal(){
        int total=marks1+marks2+marks3;
        System.out.println("TOTAL Marks : "+total);
    }
    public void computePercentage(){
        int total=marks1+marks2+marks3;
        System.out.println("PERCENTAGE : "+(total/3));
    }
}

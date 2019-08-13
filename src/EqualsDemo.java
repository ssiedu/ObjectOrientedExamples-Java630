
public class EqualsDemo {

    public static void main(String[] args) {

        String s1=new String("indore");
        String s2=new String("indore");
        String s3=s1;
        System.out.println(s1);
        System.out.println(s2);
        boolean b1=(s1==s3);
        boolean b2=s1.equals(s3);
        System.out.println(b1);
        System.out.println(b2);
        
    }
}

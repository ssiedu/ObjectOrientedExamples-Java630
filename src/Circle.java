//creates the blueprint of an Circle object

public class Circle {
    //data-members (variables for storing values of props)
        private double radius;
        private double area;
        private double circumference;
        private final double PI=3.14;
        
        public void setRadius(double r){
            radius=r;
        }
        public void areaCalculation(){
            area=PI*radius*radius;
            System.out.println("Area of Circle : "+area);
        }
        public void circumferenceCalculation(){
            circumference=2*PI*radius*radius;
            System.out.println("Circumference of Circle : "+circumference);
        }
        
}

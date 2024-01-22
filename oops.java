public class oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColour("blue");
        // System.out.println(p1.colour);
        // p1.setTip(6);
        // System.out.println(p1.tip);
        Student s1=new Student();
        Student s2=new Student("gagan");
        Student s3=new Student(1234);
        // Student s4=new Student("gagan" , 123441);// no construotr exists


    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("construnctor is beign called");
    }
    Student(String name){// parametrised constructor
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }

}

class Pen {
    String colour;
    int tip;

    String getcolour(){
        return this.colour;
    }

    void setColour(String newColour) {//settters and getters concept
        colour = newColour;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}

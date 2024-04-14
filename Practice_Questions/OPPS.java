package Practice_Questions;

class Pen {
    String color;
    String type; // ballpoint or get

    public void write() {
        System.out.println("Write");
    }

    public void color() {
        System.out.println(this.color);
    }

}

class student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println(name + " " + age);
    }

}

public class OPPS {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "ballpoint";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "Gel";
        // pen2.write();

        // pen1.color();
        // pen2.color();

        student s1 = new student();
        s1.name = "Aman";
        s1.age = 24;
        student s2= new student();
        s2.name="pranchal";
        s2.age= 23;


        s1.printInfo(s1.age);
        s2.printInfo(s2.name, s2.age);


    }

}

package Practice_Questions;

class shaped {
    String color;

    public void area()

    {
        System.out.println("displayed area");
    }
}

class triangle extends shaped {
    public void area(int l, int b) {
        System.out.println(1 / 2 * l * b);
    }

    class Equlateraltriangle extends triangle {
        public void area(int l, int b) {
            System.out.println(1 / 2 * l * b);
        }

    }
}

public class Inheritance {
    public static void main(String args[]) {
        triangle t1 = new triangle();
        t1.color = "red";
        System.out.println(t1.color);
    }

}

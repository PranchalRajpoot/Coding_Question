package Practice_Questions;

public class GCD {

    public static void main(String args[])

    {

        int first_num=12;
        int sec_num= 16;
        int i = first_num % sec_num;
        while (i != 0) {
            first_num = sec_num;
            sec_num = i;
            i = first_num%sec_num;
        }
        System.out.println(sec_num);
    }
}
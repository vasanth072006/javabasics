import java.util.Scanner;

class day1{
    public static void main(String args[])
    {
        System.out.println("hello world ");

        int container= 67;
        String word="vasanth";
        System.out.println(container);
        System.out.println(word);

        //exercise three//
        int a=10;
        int b=20;
        int c=30;
        int d= a+b+c;
        System.out.println("a+b");
        System.out.println(a+b);//for adding two variable
        System.out.println(d);//for adding three variable

        //exercise 4- getting value from user (Scanner)//

        //import java.util.Scanner;
        Scanner name= new Scanner(System.in);
        int e= name.nextInt();
        System.out.println(e);


    }
}
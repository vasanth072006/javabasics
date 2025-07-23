import java.util.Scanner;

public class javaex {
    public static void main(String[] args) {
        Scanner hi= new Scanner(System.in);
        String name=hi.nextLine();
        int age=hi.nextInt();          //when the values are getting from input, after the int you should add this line.(hi.nextLine())

        hi.nextLine();

        String address=hi.nextLine();
        System.out.println("My name is "+name);
        System.out.println("Age is: "+age);
        System.out.println("address: "+address);

        Scanner number=new Scanner(System.in);
        int a=number.nextInt();
        int b=number.nextInt();
        int c=number.nextInt();
        int d= a*b*c;
        int e= a+b+c;
        System.out.println(d/e);

        Scanner variable=new Scanner(System.in);
        String name1=variable.nextLine();
        double score=variable.nextDouble();
        variable.nextLine();
        String department=variable.nextLine();

        System.out.println("name: "+name1);
        System.out.println("score: "+score/10+"/10");
        System.out.println("Department: "+department);
        
    }
    
}

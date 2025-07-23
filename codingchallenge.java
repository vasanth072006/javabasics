import java.util.Scanner; 
public class codingchallenge {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int marks=a.nextInt();
        if(marks<35){
            System.out.println("fail");
        }else{
            System.out.println("Congraluations");
        }

        boolean hungry=true;
        boolean icecream=false;

        if( hungry && icecream){
            System.out.println("Don't Eat");
        }else{
            System.out.println("Eat");
        }

        if(hungry || icecream){
            System.out.println("Eat");
        }else{
            System.out.println("Dont eat");
        }

        
    }
    
}

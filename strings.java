public class strings {
    public static void main(String[] args){

        String c="apple";
        String d="apple";     //the first two, the values will be the same so the address of both the variable will be equal.

        String a=new String("orange");      //here "new String" creates same value name but different object, 
        String b=new String("orange");         //gives different address.

        System.out.println(a==b);
        System.out.println(c==d);

        //When we want to compare both the string with the value, use(".equals")\\
        
        String e=new String("banana");
        String f=new String("banana");

        System.out.println(e.equals(f));
        System.out.println(e==f);
        
    }
    
}

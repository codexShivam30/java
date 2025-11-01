import java.util.*;

public class greatest_number{
    public static void main(String[]args){
        System.out.println("Give three input");
        //Taking the input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //Printing the numbers
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        //comparing the three numbers to check which one is greatest
        if(a>b && a>c){
            System.out.println("A is greatest:" + a);
        
        }
        else if (b>c){
            System.out.println("b is greateast:" + b);

        }
        else{
            System.out.println("c is greatest :"+ c);
        }

    }
}
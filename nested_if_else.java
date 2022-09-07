package control_statements;
import java.util.Scanner;
public class nested_if_else {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number : ");
        int n=s.nextInt();
        if(n>0){
            int count = 0;
            for(int i=2;i<n/2;i++){
                if(n%i == 0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(n+ " is a positive integer and a prime Number.");
            }
            else{
                System.out.println(n+ " is a positive integer and not a prime Number.");
            }
        }
        else if (n==0) {
            System.out.println(n+" is also a positive integer but is not a prime.");
        }
        else{
            System.out.println(n+" is a Negative Integer and it will no be a prime.");
        }
    }
}

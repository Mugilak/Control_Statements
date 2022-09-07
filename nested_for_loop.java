package control_statements;
import java.util.Scanner;
public class nested_for_loop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int temp;
        System.out.println("Enter array size");
        int n= s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            }   
        }
        for(int k=0; k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}

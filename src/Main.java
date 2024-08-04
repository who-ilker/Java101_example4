import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("(n^k)");

        System.out.print("The number to be exponentiated (n): ");
        int n = inp.nextInt();
        System.out.print("Number to be exponent (k): ");
        int k = inp.nextInt();
        int result = 1;

        for(int i = 0; i < k; ++i){
            result *= n;
        }
        System.out.print("n^k : "+n);
    }
}
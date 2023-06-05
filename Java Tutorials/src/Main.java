import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of terms of Fibbonacci series to be generated: ");
        int nTerms = in.nextInt();
        int a = 0, b = 1, temp;
        for(int i = 0; i < nTerms; i++){
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;

        }

    }
}
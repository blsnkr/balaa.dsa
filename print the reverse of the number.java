// You are using Java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum=0;
        while(n>0){
            long r = n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.print(sum);
    }
}

   

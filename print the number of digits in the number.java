// You are using Java
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
}

// You are using Java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
       
        switch(a){
            case 29:
            System.out.println("small");
            break;
            case 30:
            System.out.println("medium");
            break;
            case 38:
            System.out.println("large");
            break;
            case 42:
            System.out.println("xlarge");
            break;
            default:
            System.out.println("Invalid");
            break;
        }
            
    }
}

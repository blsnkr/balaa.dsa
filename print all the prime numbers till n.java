// You are using Java
// You are using Java
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       
        int i,j;
       for(j=2;j<=n;j++){
            int fah=1;
        for(i=2;i<j;i++){
            if(j%i==0){
                fah=0;
                
            }
        }
             if(fah==1){
            System.out.print(j+" ");
            
      
    
        }
       
       }
    
    }
}












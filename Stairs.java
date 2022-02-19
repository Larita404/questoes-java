import java.util.Scanner;
 
public class Stairs{
  public static void main(String[] args){ 

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    for(int i = 1; i <= num; i++){
        for(int j = 1; j <= num; j++){
            if(j > num - i)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
  }
}
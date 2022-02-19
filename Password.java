import java.util.Scanner;
 
public class Password{
  public static int containsUpperCase(String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
        if (Character.isUpperCase(string.charAt(i))) {
            count++;
        }
    }
    return count;
  }

  public static int containsLowerCase(String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
        if (Character.isLowerCase(string.charAt(i))) {
            count++;
        }
    }
    return count;
  }

  public static int containsDigit(String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
        if (Character.isDigit(string.charAt(i))) {
            count++;
        }
    }
    return count;
  }

  public static int containsSpecial(String string) {
    int count = 0;
    String specialCharactersString = "!@#$%^&*()-+";
    for (int i = 0; i < string.length(); i++) {
        if(specialCharactersString.contains(Character.toString(string.charAt(i)))){
            count++;
        } 
    }
    return count;
  }


  public static void main(String[] args){ 

    Scanner scan = new Scanner(System.in);
    String password = scan.nextLine();
    int min = 0;
    int count = 0;

    if(containsUpperCase(password) == 0) min++;
    else count = containsUpperCase(password);
    
    if(containsLowerCase(password) == 0) min++;
    else count += containsLowerCase(password) ;
  
    if(containsDigit(password) == 0) min++;
    else count += containsDigit(password) ;
    
    if(containsSpecial(password) == 0) min++;
    else count += containsSpecial(password) ;
    
    if(count < 6){
      if(min < 6 - count) {
        min = 6 - count;
      }
    }

    System.out.println(min);
  }
  
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.print("Please enter your age:");
         int age = 0;
        try(Scanner scanner = new Scanner(System.in)){
            age = scanner.nextInt();
            if(age<0){
                throw new Exception();
            }

        }catch(Exception e){
             System.out.println("please type your age as in positive number format!!");
             return;
        }
 if(age == 18){
            System.out.println("You are 18, you are also allowed to enter the site!!");
        }else if(age > 18){
            System.out.println("You are allowed to enter the site!!");
        }else{
            if(age<10){
                System.out.println("You are too young to enter the site!! You must be 18 or greater.");
                return;
            }
            System.out.println("You are not allowed to enter the site, Sorry!");
        }

    }
}

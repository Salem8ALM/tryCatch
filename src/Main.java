import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Salem";
        String validPassword = "Salamanka420";

        try{
            System.out.println("enter username");
            String userName = scanner.next();

            System.out.println("enter password");
            String password = scanner.next();
            if (!userName.equals(validUsername) || !password.equals(validPassword)) {
                throw new Exception("Invalid credentials");
            }

        }
        catch (Exception e){
            System.out.println("error: " + e.getMessage());

        }
    }

}
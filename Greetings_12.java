import java.util.Scanner;
public class Greetings_12 {
    public static String getGreetingRecipient(){
        Scanner input12 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input12.nextLine();
        input12.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " May the force be with you!");
    }
    
}

import java.util.Scanner;
public class ExpressingGratitude_12 {
    public static String getGreetingRecipient(){
        Scanner input12 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input12.nextLine();
        input12.close();
        return recipientName;

    }

    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(String additionalMessage) {
        System.out.println("Additional Greeting: " + additionalMessage);
    }
    
    public static void main(String[]args){
        sayThankyou();

        String additionalMessage = "continue inspiring others!";
        sayAdditionalGreetings(additionalMessage);
    }
}
    


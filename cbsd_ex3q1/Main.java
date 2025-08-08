import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();
        
        Subscriber subscriber1 = new Subscriber("Display1");
        Subscriber subscriber2 = new Subscriber("Display2");
        

        scoreSource.subscribe(subscriber1);
        scoreSource.subscribe(subscriber2);
        
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine();
            
            if (input.trim().isEmpty()) {
                System.out.println("Program terminated.");
                break;
            }
            
            scoreSource.setScoreLine(input);
        }
        
        scanner.close();
    }
}

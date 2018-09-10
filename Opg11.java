import java.util.Scanner;

public class Opg11 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter Første Tal: ");
        int firstNumber = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter Andet Tal: ");
        int secondNumber = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished
        reader.close();
        System.out.println("Sumet af de to tal er: "+ firstNumber + secondNumber);
    }
}

import java.util.Scanner;
public class Opg8 {
    public static void main(String[] args){


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter Fornavn: ");
        String firstName = reader.next(); // Scans the next token of the input as a String.
        System.out.println("Enter Efternavn: ");
        String lastName = reader.next(); // Scans the next token of the input as a String.
        //once finished
        reader.close();
        System.out.println("Dit navn: " + firstName + " " + lastName);
    }
}

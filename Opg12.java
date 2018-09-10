import java.util.Scanner;

public class Opg12 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter Fornavn: ");
        String firstName = reader.next(); // Scans the next token of the input as a String.
        System.out.println("Enter Efternavn: ");
        String lastName = reader.next(); // Scans the next token of the input as a String.
        //once finished
        reader.close();

        long firstNameCharAmount = firstName.chars().count();
        long lastNameCharAmount = lastName.chars().count();
        long totalCharAmount = firstNameCharAmount + lastNameCharAmount;
        int i = 1;
        while (i <= totalCharAmount){
            System.out.println(i+ ". hej med dig " + firstName + " " + lastName + ".");
            i++;
        }
    }
}

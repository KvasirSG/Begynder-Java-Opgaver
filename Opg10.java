import java.util.Scanner;

public class Opg10 {
    public static void main(String[] args){
        getNumber();
    }
    public static void getNumber(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter hvor mange gange du vil udskrive 'Jeg er blevet bedre til dette': ");
        int number = reader.nextInt(); // Scans the next token of the input as an int.
        reader.close();

        if (number < 1){ //adding failsafe so the program wont crash if you enter a to little number
            System.out.println("Nummeret du har indtastet er for lille. Prøv igen");
            getNumber();
        } else{
            int i = 1;
            while (i <= number){
                System.out.println(i+ ". Jeg er klart blevet bedre til det her");
                i++;
            }
        }

    }
}

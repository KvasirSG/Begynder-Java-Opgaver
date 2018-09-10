import java.util.Scanner;

public class Opg13 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter din alder: ");
        int age = reader.nextInt(); // Scans the next token of the input as an int..
        //once finished
        reader.close();

        if (age>0){
            if (age<=15){
                System.out.println("Pandekager og varmchokolade. Yum!");
            }else if (age <= 16){
                System.out.println("Så kan der drikkes Øl!");
            }else if (age>=18){
                System.out.println("Tid til at tage et kørekort");
            }
        }else{
            System.out.println("Forket input din alder kan ikke være 0 eller mindre");
        }
    }
}

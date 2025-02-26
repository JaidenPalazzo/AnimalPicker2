import java.util.Scanner; 

public class AnimalPicker2{

    private String animal; 
    Scanner scanner = new Scanner(System.in); 


    public AnimalPicker2(){
        System.out.println("Which animal would you like? (cat or dog)"); 
        animal = scanner.nextLine(); 

    }
}
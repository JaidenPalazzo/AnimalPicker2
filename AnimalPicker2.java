import java.util.Scanner; 

public class AnimalPicker2{

    private String animal; 
    Scanner scanner = new Scanner(System.in); 


    public AnimalPicker2(){
        System.out.println("Which animal would you like? (cat or dog)"); 
        animal = scanner.nextLine(); 

        if (animal.equals("cat")){
            System.out.println("CAT ASCII ART HERE"); 
        }

        else {
            System.out.println("DOG ASCII ART HERE"); 
        }

    }
}
package AnimalPicker2;

import java.util.Scanner; 

public class AnimalPicker2{

    private String animal = ""; 
    Scanner scanner = new Scanner(System.in); 


    public AnimalPicker2(){ 

        while(!animal.equals("dog") && !animal.equals("cat")){
            System.out.println("Which animal would you like? (cat or dog)"); 
            animal = scanner.nextLine();

            if(!animal.equals("dog") && !animal.equals("cat")){
                System.out.println("Invalid choice!"); 
            }

        }
        if (animal.equals("cat")){
            System.out.println("CAT ASCII ART HERE"); 
        }

        else if(animal.equals("dog")){
            System.out.println("DOG ASCII ART HERE"); 
        }




    }
    public static void main(String [] args){
        new AnimalPicker2(); 
    }
}
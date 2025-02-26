package AnimalPicker2;

import java.util.Scanner; 

public class AnimalPicker2{

    private String animal = ""; 
    Scanner scanner = new Scanner(System.in); 


    public AnimalPicker2(){ 

        while(!animal.equals("dog") && !animal.equals("cat") && !animal.equals("fish")){
            System.out.println("Which animal would you like? (cat, fish, or dog)"); 
            animal = scanner.nextLine();

            if(!animal.equals("dog") && !animal.equals("cat") && !animal.equals("fish")){
                System.out.println("Invalid choice!"); 
            }

        }
        if (animal.equals("cat")){
            System.out.println(" |\\__/,|   (`\\\n" + //
                                " |_ _  |.--.) )\n" + //
                                " ( T   )     /\n" + //
                                "(((^_(((/(((_/"); 
        }

        else if(animal.equals("dog")){
            System.out.println("         __\n" + //
                                "        /  \\\n" + //
                                "       / ..|\\\n" + //
                                "      (_\\  |_)\n" + //
                                "      /  \\@'\n" + //
                                "     /     \\\n" + //
                                " _  /  `   |\n" + //
                                "\\\\/  \\  | _\\\n" + //
                                " \\   /_ || \\\\_\n" + //
                                "  \\____)|_) \\_)"); 
        }

         else if(animal.equals("fish")){
            System.out.println("      /`·.¸\n" + //
                                "     /¸...¸`:·\n" + //
                                " ¸.·´  ¸   `·.¸.·´)\n" + //
                                ": © ):´;      ¸  {\n" + //
                                " `·.¸ `·  ¸.·´\\`·¸)\n" + //
                                "     `\\\\´´\\¸.·´");
        }


    }
    public static void main(String [] args){
        new AnimalPicker2(); 
    }
}
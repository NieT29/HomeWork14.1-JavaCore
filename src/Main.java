import entities.Pet;
import entities.TYPE;
import service.PetService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Pet(1,"Pet1", "Species1", 1, "Male", "Des1", TYPE.DOG, "Image 1"));
        petList.add(new Pet( 2,"Pet2", "Species2", 2, "Female", "Des2", TYPE.CAT, "Image 2"));
        petList.add(new Pet( 3,"Pet3", "Species3", 3, "Female", "Des3", TYPE.DOG, "Image 3"));
        petList.add(new Pet( 4,"Pet4", "Species4", 4, "Female", "Des4", TYPE.CAT, "Image 4"));
        petList.add(new Pet( 5,"Pet5", "Species5", 5, "Male", "Des5", TYPE.DOG, "Image 5"));
        petList.add(new Pet( 6,"Pet6", "Species6", 2, "Female", "Des6", TYPE.CAT, "Image 6"));
        petList.add(new Pet( 7,"Pet7", "Species7", 3, "Male", "Des7", TYPE.DOG, "Image 7"));
        petList.add(new Pet( 8,"Pet8", "Species8", 1, "Male", "Des8", TYPE.CAT, "Image 8"));
        petList.add(new Pet( 9,"Pet9", "Species9", 2, "Female", "Des9", TYPE.DOG, "Image 9"));
        petList.add(new Pet(10, "pet10", "Species10", 3, "male", "Des10", TYPE.CAT, "iamge 10"));
        PetService petService = new PetService();
        petService.match(petList,scanner);
    }
}

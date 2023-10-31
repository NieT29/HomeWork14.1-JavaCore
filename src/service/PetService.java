package service;

import entities.Pet;
import entities.TYPE;
import utils.Utils;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    Utils utils = new Utils();
    Pet userPet;

    public void inputUserPet(Scanner scanner) {
        System.out.println("Nhập thông tin pet của bạn: ");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giống loài: ");
        String species = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = utils.inputInt(scanner);
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String description = scanner.nextLine();
        System.out.println("Nhập loại DOG/CAT");
        String typeString = scanner.nextLine();
        TYPE type = TYPE.valueOf(typeString.toUpperCase(Locale.ROOT));
        System.out.println("Nhập hình ảnh");
        String image = scanner.nextLine();
        userPet = new Pet(name, species, age, sex, description, type, image);
    }

    public void match(ArrayList<Pet> petList, Scanner scanner) {
        inputUserPet(scanner);
        while (true) {
            System.out.println("Thông tin pet ngẫu nhiên: ");
            Pet randomPet = getRandomPet(petList, userPet);
            printPetInfo(randomPet);
            System.out.print("Bạn có muốn tìm chú pet khác không? (Y/N): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
            } else {
                System.out.println("Kết thúc chương trình.");
                break;
            }
        }

    }

    public Pet getRandomPet(ArrayList<Pet> petList, Pet userPet) {
        Random random = new Random();
        Pet randomPet;
        do {
            randomPet = petList.get(random.nextInt(petList.size()));
        } while (randomPet.getTYPE() != userPet.getTYPE() && randomPet.getSex().equalsIgnoreCase(userPet.getSex()));
        return randomPet;
    }

    public void printPetInfo(Pet pet) {
        System.out.println("ID: " + pet.getId());
        System.out.println("Tên: " + pet.getName());
        System.out.println("Giống loài: " + pet.getSpecies());
        System.out.println("Tuổi: " + pet.getAge());
        System.out.println("Giới tính: " + pet.getSex());
        System.out.println("Mô tả: " + pet.getDescription());
        System.out.println("Hình ảnh: " + pet.getImages());
    }

}

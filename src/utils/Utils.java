package utils;

import java.util.Scanner;

public class Utils {
    public int inputInt(Scanner scanner){
        while (true){
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Lỗi input, vui lòng nhập lại");
            }
        }
    }
}

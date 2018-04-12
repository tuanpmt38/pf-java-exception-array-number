import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arrayNumber = new Integer[100];
        System.out.println(" Element array: ");
        for (int i = 0; i < 100; i++) {
            arrayNumber[i] = random.nextInt(100);
            System.out.println("Random index: " + arrayNumber[i]);
        }
        return arrayNumber;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] number = arrayExample.createRandom();
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + number[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("input.txt"); //считывание
        Scanner scan = new Scanner(input);

        String text = scan.nextLine();
        String[] arrText = text.split(" ");
        int num = Integer.parseInt(arrText[0]);
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(arrText[i + 1]);
        }

        Arrays.sort(arr);

        FileWriter output = new FileWriter("output.txt"); //Запись
        StringBuilder qwe = new StringBuilder();
        for (int value : arr) {
            qwe.append(value).append(' ');
        }
        output.write(qwe.toString());
        output.close();
    }
}

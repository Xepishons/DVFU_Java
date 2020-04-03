import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Short_text_and_few_words {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("input.txt"); //считывание
        Scanner scan = new Scanner(input);

        String text = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        String[] arrWords = new String[num];
        for(int i = 0; i<num;i++) arrWords[i] = scan.nextLine();
        int[] O = new int[num];

        System.out.println(text);
        System.out.println(num);
        for(int i = 0; i<num;i++) System.out.print(arrWords[i]+" ");
        System.out.println();

        for(int i =0; i<num;i++){
            if (text.contains(arrWords[i])) O[i] = 1;
            else O[i] = 0;
        }

        for(int i = 0; i<num;i++) System.out.print(O[i]+" ");
        System.out.println();

        FileWriter output = new FileWriter("output.txt"); //Запись
        StringBuilder qwe = new StringBuilder();
        for (int value : O) {
            qwe.append(value).append(' ');
        }
        output.write(qwe.toString());
        output.close();
    }
}

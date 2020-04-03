import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("input.txt"); //считывание
        Scanner scan = new Scanner(input);

        int num = Integer.parseInt(scan.nextLine());
        if (num > 0) {

            int[] A1 = new int[num];
            int[] A2 = new int[num];
            int[] O = new int[num];
            String[] B;
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();

            if (str1.split(" ").length >= num && str2.split(" ").length >= num) {

                B = str1.split(" ");
                for (int i = 0; i < num; i++) {
                    A1[i] = Integer.parseInt(B[i]);
                }


                B = str2.split(" ");
                for (int i = 0; i < num; i++) {
                    A2[i] = Integer.parseInt(B[i]);
                }


                int k = 0;
                int x = 0;
                int y = 0;
                while (k < num){
                    while(A2[x] != A1[y]) y++;
                    if (A2[x] == A1[y]) {
                        O[k] = y;
                        k++;
                    }
                    x++;
                    y = 0;
                }

                if (k == num) {
                    FileWriter output = new FileWriter("output.txt"); //Запись
                    StringBuilder qwe = new StringBuilder();
                    for (int value : O) {
                        qwe.append(value).append(' ');
                    }
                    output.write(qwe.toString());
                    output.close();
                }
            }
        }
    }
}

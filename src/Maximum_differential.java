import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Maximum_differential {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("input.txt"); //считывание
        Scanner scan = new Scanner(input);

        int out = 0;
        int num = Integer.parseInt(scan.nextLine());
        int[][] map = new int[num][num];
        for (int i = 0; i < num; i++) {
            String[] spl = scan.nextLine().split(" ");
            for (int j = 0; j < num; j++) {
                map[i][j] = Integer.parseInt(spl[j]);
            }
        }

        int[] side = new int[4];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i - 1 >= 0) side[0] = map[i][j] - map[i - 1][j];
                if (i + 1 < num) side[1] = map[i][j] - map[i + 1][j];
                if (j - 1 >= 0) side[2] = map[i][j] - map[i][j - 1];
                if (j + 1 < num) side[3] = map[i][j] - map[i][j + 1];

                for (int k = 0; k < 4; k++) {
                    if (side[k] > out) out = side[k];
                }
            }
        }

        FileWriter output = new FileWriter("output.txt"); //Запись
        output.write(String.valueOf(out));
        output.close();
    }
}

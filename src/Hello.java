import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Ты обязательно изучишь Java и сдашь все задачи на Отлично, " + name.nextLine() + "!");
    }
}
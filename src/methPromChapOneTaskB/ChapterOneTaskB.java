package methPromChapOneTaskB;
import java.util.Scanner;

public class ChapterOneTaskB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reverse stroka = new Reverse();
        System.out.print("Введите текст: ");
        String line = scan.nextLine();
        scan.close();
        System.out.println(stroka.reverse(line));
    }
}

package methodsProgramming;

import java.util.Scanner;

public class Reader {
    private String name;
    private String check;
    Scanner scan = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(Scanner scan) {
            System.out.println("Введите имя");
            System.out.print("-> ");
            while (!scan.hasNextInt()) {
                if (name == null || name.equals(""))
                    System.out.println("Имя не может быть пустым");
                System.out.println("Введите имя");
                System.out.print("-> ");
                scan.next();
            }
            System.out.println("Имя не может содержать числа");
            System.out.println("Введите имя");
            System.out.print("-> ");
            scan.next();
            name = scan.next();
            scan.close();
        }

        @Override
    public String toString() {
        return "Привет, " + getName();
    }
}

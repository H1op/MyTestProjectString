package stroki;

public class StrMethods {
    public static void main(String[] args) {
        String string = "Hello World!";
        String empty = "";
        String newEmptyString = new String();
        String fromChars = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(string + " " + empty + " " + newEmptyString + " " + fromChars);


        if (!fromChars.startsWith("Hello")) {
            System.out.println("None");
        } else {
            System.out.println("Done");}


    }
}

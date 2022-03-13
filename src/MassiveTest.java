public class MassiveTest {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[][] x = new int[2][3];
        String[] strings = new String[3];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        strings[0] = "1";
        System.out.println(strings[0]);
        for(int number:numbers){
            System.out.println(number);
        }
    }
}

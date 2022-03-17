package metProgChapOneTask5;
import java.util.Scanner;

public class MathPart {

int sum, prod;
public int arg0 (Scanner scan) {
    Scanner scanArg = new Scanner(System.in);
    final int i = scanArg.nextInt();
    scanArg.close();
    return i;
}
public int arNum(int i){
    Scanner scanNum = new Scanner(System.in);
    int nums[] = new int[i];
    if(scanNum.findInLine())
    for(int j = 0; j < i-1; j++){
        nums[j] = scanNum.nextInt();
    }
}



}

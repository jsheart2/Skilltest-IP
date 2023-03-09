import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(getSum(10));
        System.out.println(getSum(20));
    }

    public static int getSum(int num){
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (i % 3 == 0 | i % 5 == 0){
                sum+= i;
            }
        }
        return sum;
    }
}

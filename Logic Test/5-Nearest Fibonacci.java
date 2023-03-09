import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int arr[] = {15,1,3};
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        int sum = 21;
        for (int i = 0; i < arr.length; i++)
            sum -= arr[i];

        System.out.println(sum);
    }
}

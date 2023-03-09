import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String a = "RSTUVW";
        char [] word = a.toCharArray();
        int length = word.length/2;
        if (length%2!=0){
            System.out.println(word[length-2]+" "+word[length-1]);
        }
        else {
            System.out.println(word[length]);
        }
    }
}

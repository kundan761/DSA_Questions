import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str){
        StringBuilder rev = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
        sc. close();
    }
}
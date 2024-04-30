import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();

        char temp1[]= str1.toCharArray();
        Arrays.sort(temp1);
        str1 = new String(temp1);
        temp1 = str2.toCharArray();
        Arrays.sort(temp1);
        str2 = new String(temp1);

        if (str1.equals(str2))
            System.out.println("It is an anagram");
        else
            System.out.println("Tis is not an Anagram");
         System.out.println(str1 + " " + str2);
    }

}

package Arrays;

public class Asterisk {
    public static void main(String[] args) {
        String str = "Francis Santhosh";
        for (int i = 0; i < str.length(); i++) {
            str = str.replace(str.charAt(i), '*');
        }
        System.out.print(str);

    }

}

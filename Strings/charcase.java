public class charcase {
    public static void main(String[] args) {
        String str1 = "Francis Santhosh", str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            boolean b1 = Character.isLowerCase(str1.charAt(i));
            if (b1 == true)
                str2 += Character.toUpperCase(str1.charAt(i));
            else
                str2 += Character.toLowerCase(str1.charAt(i));
        }
        System.out.println(str2);

    }
}
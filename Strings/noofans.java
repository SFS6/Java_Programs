public class noofans {
    public static void main(String[] args) {
        String str1 = "f0r6a1n2c0i6s*@#$%";
        int a = 0, n = 0, s = 0;
        System.out.println("String Lemgth:" + str1.length());
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isAlphabetic(str1.charAt(i)))
                a++;
            else if (Character.isDigit(str1.charAt(i)))
                n++;
            else
                s++;
        }
        System.out.println("Alphabets: " + a + "\nDigits:" + n + "\nSpecial Characters:" + s);
    }

}

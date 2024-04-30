public class voco {
    public static void main(String[] args) {
        String str1 = "Francis Santhosh";
        int v = 0, co = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U')
                v++;
            else
                co++;
        }
        System.out.println("Vowels:" + v + "\nConsonants:" + co);
    }

}

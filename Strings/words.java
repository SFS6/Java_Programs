public class words {
    public static void main(String[] args) {
        String str1 = "Francis Santhosh.";
        int wo = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ' || str1.charAt(i) == '.')
                wo++;
        }
        System.out.println("Words:" + wo);
    }

}

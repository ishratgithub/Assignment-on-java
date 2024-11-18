
public class question11 {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String output = removeVowels(input);
        System.out.println("Output: " + output);
    }

    public static String removeVowels(String str) {
        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}


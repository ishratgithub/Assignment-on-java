public class question8 {
        public static void main(String[] args) {
            int vowelCount = 0;
            int consonantCount = 0;
            String str = "I am a SQA Engineer";
            str = str.toLowerCase();
            System.out.println("Character with space: "+str.length());
            int wordsCount = str.split("\\s").length;
            System.out.println("Words: "+wordsCount);

            for(int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowelCount++;
                }

                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {

                    consonantCount++;
                }
            }
            System.out.println("Vowel: " + vowelCount);
            System.out.println("Consonant: " + consonantCount);
        }
    }



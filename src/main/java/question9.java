import java.util.HashMap;

public class question9 {
        public static void main(String[] args) {
            String str = "I live in Dhaka";
            HashMap<Character,Integer> charCount = new HashMap<>();
            str = str.toLowerCase();
            for(char c: str.toCharArray()){
                if(c!=' '){
                    charCount.put(c,charCount.getOrDefault(c,0)+1);;
                }
            }
            for(char c : charCount.keySet()){
                System.out.println(c +" "+charCount.get(c));
            }
        }
    }





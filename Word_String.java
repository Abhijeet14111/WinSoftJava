import java.util.HashMap;
import java.util.Map;

public class Word_String {

    public static void main(String[] args) {
        String str = "Abhijeet Sinha is a nice boy";
        Map<String, Integer> wordCountMap = countWords(str);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();

        String[] words = str.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            if (!wordCountMap.containsKey(word)) {
                wordCountMap.put(word, 0);
            }
            wordCountMap.put(word, wordCountMap.get(word) + 1);
        }

        return wordCountMap;
    }
}
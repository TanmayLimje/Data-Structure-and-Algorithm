import java.util.*;

public class Words_subset {
    public static List<String> wordSubset(List<String> word1, List<String> word2){
        List<String> result = new ArrayList<>();

        int [] freq = new int[26];
        for(String word : word2){
            int [] curr = new int[26];
            for(char c : word.toCharArray()){
                curr[c-'a']++;
                freq[c-'a'] = Math.max(freq[c-'a'],curr[c-'a']);
            }
        }

        for(String word: word1){
            int [] curr = new int[26];
            for(char c : word.toCharArray()){
                curr[c-'a']++;
            }

            boolean isValid = true;

            for(int i = 0; i < 26; i++){
                if(curr[i] < freq[i]){
                    isValid = false;
                    break;
                }
            }

            if(isValid) result.add(word);
        }

        return result;
    }

    public static void main(String [] arg){
        List<String> word1 = new ArrayList<>();
        List<String> word2 = new ArrayList<>();

        word1.add("leetcode");
        word1.add("tech");
        word1.add("dose");

        word2.add("ee");
        word2.add("o");

        System.out.println("word1: "+word1);
        System.out.println("word2: "+word2);

        List<String> result = wordSubset(word1,word2);
        System.out.println("Universal: " + result);
    }
}

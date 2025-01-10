import java.util.*;

public class prefix_count {
    public static int prefCount(String[] words, String pref){
        int count = 0;

        for(String w: words){
            if(w.length() >= pref.length() && w.startsWith(pref)){
                count++;
            }
        }

        return count;
    }

    public static void main(String [] arg){
        String [] words = {"pay","attention","practice","attend"};
        String pref = "at";

        System.out.println("Words: " + Arrays.toString(words));
        System.out.println("Prefix: " + pref);

        int result = prefCount(words,pref);
        System.out.println("Count: " + result);
    }
}

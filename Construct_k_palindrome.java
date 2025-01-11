public class Construct_k_palindrome {
    public static boolean constKPalindrome(String s, int k){
        if(s.length() < k) return false;

        int bitmask = 0;

        for(char c : s.toCharArray()){
            bitmask ^= (1 << (c-'a'));
        }

        int oddCount = Integer.bitCount(bitmask);

        return oddCount <= k;

    }

    public static void main(String [] arg){
        String input = "annabelle";
        int k = 3;

        System.out.println("String:" + input +" k=" + k);
        boolean result = constKPalindrome(input,k);
        System.out.println(result);
    }
}

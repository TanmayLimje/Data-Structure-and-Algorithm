package expression;

import java.util.Stack;

public class Solution {

    Stack<Integer> s1 ;
    Stack<Character> s2 ;
    String exp;
    int index;

    public Solution(String exp){
        this.exp = exp;
        index = 0;
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void addExp(boolean first){
        if(first){
            s1.push(Integer.parseInt(exp.charAt(index)+ ""));
            index++;
        }
        s2.push(exp.charAt(index));
        index++;
        s1.push(Integer.parseInt(exp.charAt(index)+ ""));
        index++;
    }

    // * / && index < exp.length()-1
    // if((s2.peek() == '*' || s2.peek() == '/') &&  index < exp.length()-1) true
    // else false ==> + -

    public void multDiv(){
        int tempResult = 0;
            if(s2.peek() == '/'){
                int t1 = s1.pop();
                int t2 = s1.pop();
                tempResult = t2 / t1;
                s1.push(tempResult);
                s2.pop();
            }else if(s2.peek() == '*') {
                int t1 = s1.pop();
                int t2 = s1.pop();
                tempResult = t2 * t1;
                s1.push(tempResult);
                s2.pop();
            }
    }

    public void plusMin(){
        int tempResult = 0;

            if(s2.peek() == '+'){
                int t1 = s1.pop();
                int t2 = s1.pop();
                tempResult = t2 + t1;
                s1.push(tempResult);
                s2.pop();
            }
            else if(s2.peek() == '-'){
                int t1 = s1.pop();
                int t2 = s1.pop();
                tempResult = t2 - t1;
                s1.push(tempResult);
                s2.pop();
            }
    }

    public int solve(){
        while(exp.length() > index){
            addExp(index == 0);
            if (index <= exp.length()){
                multDiv();
            }
        }

        while(!s2.isEmpty()){
            plusMin();
        }

        return s1.pop();
    }
}

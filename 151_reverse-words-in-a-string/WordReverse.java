import java.util.ArrayList;
import java.util.List;

class WordReverse {

    public static void main(String args[]) {
        String s = "hobby";
        WordReverse wr = new WordReverse();
        String result = wr.reverseWords(s);
        System.out.println(result);
    }

    public String reverseWords(String s) {
        int len = s.length();
        int x = 0; 
        int y = len - 1;
        int prev = len;
        String res = "";
        for(int i = len-1; i>0; i--) {
            if(s.charAt(i) == " "){
                
            }
        }

        return String.valueOf(ch);       
    }

}
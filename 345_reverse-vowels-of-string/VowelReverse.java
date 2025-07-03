import java.util.ArrayList;
import java.util.List;

class VowelReverse {

    public static void main(String args[]) {
        String s = "paeblo cisnar";
        VowelReverse vowelReverse = new VowelReverse();
        String result = vowelReverse.reverseVowels(s);
        System.out.println(result);
    }

    public String reverseVowels(String s) {
        int len = s.length();
        int x = 0; 
        int y = len - 1;
        int a = -1;
        int b = -1;
        char[] ch = s.toCharArray();
        while(x<y) {
            a = "aeiouAEIOU".indexOf(s.charAt(x));
            b = "aeiouAEIOU".indexOf(s.charAt(y));
            if(a != -1 && b != -1) {
                char temp = ch[x];
                ch[x] = ch[y];
                ch[y] = temp;
                x++;
                y--;
            } else if(a == -1) {
                x++;
            } else if(b == -1) {
                y--;
            }
        }
        return String.valueOf(ch);       
    }

}
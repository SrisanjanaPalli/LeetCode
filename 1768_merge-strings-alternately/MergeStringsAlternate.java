class MergeStringsAlternate {

    public static void main (String args[]) {
        String s1 = "abcdef";
        String s2 = "pqrs";
        String res = mergeAlternately(s1, s2);
        System.out.println(res);
    }

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = 0;
        String out = "";
        boolean flag = false;

        if(len1<len2) {
            len = len1;
            flag = true;
        }
        else 
            len = len2;

        for(int i = 0; i< len; i++) {
            out = out.concat(word1.substring(i, i+1)).concat(word2.substring(i, i+1));
        }
        if(flag) {
            out = out.concat(word2.substring(len));
        } else {
            out = out.concat(word1.substring(len));
        }

        return out;
    }

    
}

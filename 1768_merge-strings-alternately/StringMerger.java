class StringMerger {

    public static void main (String args[]) {
        String s1 = "abcdef";
        String s2 = "pqrs";
        String res = mergeAlternately(s1, s2);
        System.out.println(res);
    }

    public static String mergeAlternately(String word1, String word2) {
        // String out = "";
        StringBuilder out = new StringBuilder();
        int i = 0; int j = 0;
        while(i < word1.length() && j < word2.length()) {
            out.append(word1.charAt(i));
            out.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i < word1.length()) {
            out.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length()) {
            out.append(word2.charAt(i));
            j++;
        }

        return out.toString();
    }

    
}

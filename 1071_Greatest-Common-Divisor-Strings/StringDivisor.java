class StringDivisor {

    public static void main (String args[]) {
        String s1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String s2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        StringDivisor div = new StringDivisor();
        String res = div.gcdOfStrings(s1, s2);
        System.out.println(res);
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        System.out.println(len1);
        System.out.println(len2);
        int l = 0;
        if(!(str1+str2).equals(str2+str1)) {
            return "";
        } else {
            if(len1>len2) {
                l = gcd(len2, len1);
            } else {
                l = gcd(len1, len2);
            }
            return str1.substring(0, l);
        }
    }

    public int gcd(int x, int y) {
        if(y%x == 0) {
            
            return x;
        } else {
            return gcd(y%x, x);
        }
    }
}
/*
 * abcabcabc - abc 
 * abcabcabcabc - abcabc 
 * abcabcabc - efg 
 * abcabcdef - abc 
 * 
 * take smaller string 
 * substrings of small string starting from index 0 
 * 
 */
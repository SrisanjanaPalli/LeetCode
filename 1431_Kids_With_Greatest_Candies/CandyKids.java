import java.util.ArrayList;
import java.util.List;

class CandyKids {

    public static void main(String args[]) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        CandyKids candyKids = new CandyKids();
        List<Boolean> result = candyKids.kidsWithCandies(candies, extra);
        System.out.println(result);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = candies[0];
        List<Boolean> res = new ArrayList<>();
        for(int i = 1; i< candies.length; i++) {
            maxi = Math.max(maxi, candies[i]);
        }
        for(int i = 0; i< candies.length; i++) {
            if(candies[i] >= (maxi-extraCandies)) {
                res.add(true);
            } else{
                res.add(false);
            }
        }
        return res;
    }

}
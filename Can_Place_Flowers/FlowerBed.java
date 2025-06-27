import java.util.ArrayList;
import java.util.List;

class FlowerBed {

    public static void main(String args[]) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        FlowerBed flowerBed = new FlowerBed();
        Boolean result = flowerBed.canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }

    public boolean canPlaceFlowers(int[] flowerBed, int n) {
        int count = 0;
        int l = flowerBed.length;
    
        if(l==1 && flowerBed[l-1]==0) {
            count++;
            return n<=count;
        }
            
        if(l>1 && flowerBed[1]==0 && flowerBed[0]==0) {
            count++;
            flowerBed[0]=1;
        }
        
        for(int i=1;i<l-1;i++) {
            if(flowerBed[i-1]==0 && flowerBed[i+1]==0 && flowerBed[i]==0) {
                count++;
                flowerBed[i]=1;
            }
        }
        
        if(l>2 && flowerBed[l-1]==0 && flowerBed[l-2]==0)
            count++;

        return n<=count;
    }

}
// how many 0's are there whose both sides are 0's ? - count++ & make it 1
// 1000001
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;;

public class WaterVolume {

    public static void calcVol(int[] a) {
        int n = a.length;
        int vol = 0;
        for(int i = 1; i< n-1; i++) {
            int maxL = maxLeft(a, n, i);
            int maxR = maxRight(a, n, i);
            if(maxL>0 && maxR>0) {
                int min = Math.min(maxL, maxR);
                vol = vol + min -  a[i];
                System.out.println("adding vol"+ a[i] + ":"+vol);
            }
        }

        System.out.println("water volume stored:" + vol);
    }

    public static int maxLeft(int[] a, int n, int i) {
        int maxL = -1;
        for(int j = 0; j<i; j++) {
            maxL = Math.max(maxL, a[j]);
        }
        if(maxL < a[i])
            maxL = -1;
        System.out.println("calc max left:"+ a[i] + ":"+ maxL);
        return maxL;
    }

    public static int maxRight(int[] a, int n, int i) {
        int maxR = -1;
        for(int j = n-1; j>i; j--) {
            maxR = Math.max(maxR, a[j]);
        }
        if(maxR < a[i])
            maxR = -1;
        System.out.println("calc max right:"+ a[i] + ":"+maxR);
        return maxR;
    }

    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("array entered:");
        for (int num : a) {
            System.out.println(num + " ");
        }
        // System.out.print("Enter the string: ");
        // String userInput = scanner.nextLine();  
        // System.out.println("String entered: " + userInput);
        scanner.close();
        return a;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        calcVol(input);
    }
}
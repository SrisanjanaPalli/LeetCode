import java.util.Stack;

class CelebrityPrblm {

    public static void main(String args[]) {
        int[][] m = {
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 1}
        }; 
        CelebrityPrblm cp = new CelebrityPrblm();
        int out = cp.findCelebrity(m);
        System.out.println(out);
    }

    public int findCelebrity(int[][] m) {
        if (m == null || m.length == 0) return -1;

        int n = m.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Find celebrity
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            // If a knows b, a cant be celebrity. Keep b.
            if (m[a][b] == 1) {
                stack.push(b);
            } else { // a does not know b, so b can't be celebrity. Keep a.
                stack.push(a);
            }
        }

        if (stack.isEmpty()) return -1;
        int celeb = stack.pop();

        // Verify celeb
        for (int i = 0; i < n; i++) {
            if (i == celeb) 
                continue;
            if (m[celeb][i] == 1 || m[i][celeb] == 0) {
                return -1;
            }
        }

        return celeb;
    }

}

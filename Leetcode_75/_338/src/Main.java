import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println(Arrays.toString(countBits(2)));
        System.out.println(ones(11));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = ones(i);
        }
        return ans;
    }

    public static int ones(int n) {
        int count = 0;
        while(n > 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
}
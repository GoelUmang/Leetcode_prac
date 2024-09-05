import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        int[] nums = {3,4,1,2};
        //moveZeroes(nums);
        //int ans = chalkReplacer(nums,25);
//       String word1 = "abc";
//       String word2 = "pqr"; //"apbqcr"
//        String ans1 = mergeAlternately(word1,word2);
//        System.out.println(ans1);
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0 ; right < nums.length; right++){
            if (nums[right] !=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left]= temp;

                left++;
            }
        }
    }
    public static int chalkReplacer(int[] chalk, int k) {
        int ans = 0 ;
        int total = 0;
        for (int i = 0 ; i < chalk.length ; i++){ // cal total chalk that would be used in one complete cycle
            total += chalk[i];
        }
        k %= total;

        for(int i = 0; i < chalk.length ; i++){
            while(k > 0){
                k -= chalk[i++];
            }
            ans = i;
        }
        return ans;
    }
    public static int getLucky(String s, int k) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;  // Convert 'a' -> 1, 'b' -> 2, ..., 'z' -> 26
            result += num / 10 + num % 10;    // Sum the digits of the number directly
        }

        for (int i = 0; i < k; i++) {
            int sum = 0;
            while (result > 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }
        return result;
    }
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        // while loop to check and continue until very last letter is being printed.
        //while (word1.length() > 0  || word2.length() > 0){
            // loop to print letter by letter
            for ( int i = 0 ; i < word1.length() || i < word1.length() ; i++) {
                result = result +  word1.charAt(i) + word2.charAt(i);
            }
        return result;
        }

    public static int pivotIndex(int[] nums) {
        int ans = 0;
        int[] left = new int[nums.length];
        int[] right = new int [nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            // left should have all the sum from 0 to i-1 in the ith postion
            for(int j = 0 ; j < i ; j++){
                left[j] += nums[j];
            }
            //right should have all the sum from i to n-1
            for (int k = i+1; k < nums.length; k++){
                right[k] = right nums[k];
            }
            if(left[i] == right[i]) return i;
        }
        return -1;
    }

}



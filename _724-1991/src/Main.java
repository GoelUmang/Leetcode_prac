public class Main {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
//        int middleIndexOptimised = findMiddleIndexOptimised(nums);
        System.out.println(findMiddleIndexOptimised(nums));
        System.out.println(findMiddleIndex(nums));
    }
    public static int findMiddleIndexOptimised(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        for(int j = 0; j < nums.length ; j++){
            if(ans == (sum - nums[j] - ans)) return j;
            ans += nums[j];
        }
        return -1;
    }

    public static int findMiddleIndex(int[] nums) {
        int[] left = new int[nums.length];
         int[] right = new int [nums.length];
         for (int i = 0 ; i < nums.length ; i++){
             for(int j = 0 ; j < i ; j++){
             left[i] += nums[j];
             }
             for (int k = i+1; k <nums.length; k++ ){
             right[i] += nums[k];
             }
             if(left[i] == right[i]) return i;
         }
         return -1;
    }
}
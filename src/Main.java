

public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3} , 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        int initails = 1 ;
        int countSum = 0 ;
        for(int i = 1 ; i <= sum.length ; i++){
            if (countSum == nums.length - 1){
                break;
            }
            sum[i] += sum[i-1] + nums[countSum];
            if (i > k){
                sum[i] -= sum[initails];
                initails++ ;
            }
            countSum++;
        }

        double max = Integer.MIN_VALUE ;

        for (int j = k ; j < sum.length ; j++) {
            max = Math.max(max, sum[j]);
        }

        return max / k ;

    }
}

public class SubsetsumDP {
    static boolean dp[][];
    public static void main(String[] args) {
        int [] arr = {2,5,8,3};
        int sum = 0;
        System.out.println(subsetSum(arr, sum ,arr.length));
    }

    public static boolean subsetSum(int[] arr, int sum, int length) {
        dp = new boolean[arr.length+1][sum+1];
        for(int i = 0;i<length+1;i++){
            for (int j = 0 ; j< sum+1;j++){
                if(j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = false;
                }else if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[length][sum];
    }
}

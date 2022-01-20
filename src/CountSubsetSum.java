public class CountSubsetSum {
    public static int dp[][];
    public static void main(String[] args) {
        int [] arr = {1,2,3,3};
        int sum = 6;
        dp = new int[arr.length+1][sum+1];
        System.out.println(countSubsetSum(arr,sum,arr.length));
    }

    public static int countSubsetSum(int []arr,int sum,int length){
        for (int i = 0 ; i< length+1;i++){
            for(int j = 0;j<sum+1;j++){
                if(j == 0)
                    dp[i][j]=1;
                else if(i == 0)
                    dp[i][j] = 0;
                else if(arr[i-1]<= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[length][sum];
    }
}

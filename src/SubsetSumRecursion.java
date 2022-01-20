public class SubsetSumRecursion {
    static boolean dp[][];
    public static void main(String[] args) {
        int [] arr = {2,5,8,3};
        int sum = 11;
        dp = new boolean[arr.length+1][sum+1];
        System.out.println(subsetSum(arr, sum ,arr.length));
    }

    public static Boolean subsetSum(int[] arr,int sum , int n){
        if(n==0)
            return false;
        else if(sum == 0)
            return true;
        if(dp[n][sum] == true)
            return true;
        if(sum >= arr[n-1]){
            return dp[n][sum] = subsetSum(arr,sum-arr[n-1],n-1) || subsetSum(arr,sum,n-1);
        }else{
            return dp[n][sum] = subsetSum(arr, sum, n-1);
        }
    }

}

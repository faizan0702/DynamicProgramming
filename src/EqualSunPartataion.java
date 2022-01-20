public class EqualSunPartataion {
    public static void main(String[] args) {
        int [] arr = {5,8,3};
        int sum = 8;
        System.out.println(equalSumPartation(arr,sum,arr.length));
    }

    public static boolean equalSumPartation(int []arr,int sum , int length){
        if(sum %2 == 1)
            return false;
        SubsetsumDP ss = new SubsetsumDP();
        return SubsetsumDP.subsetSum(arr,sum/2,length);
    }
}

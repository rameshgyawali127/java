public class FindTargetFromInfiniteArray {
    public static int findindex(int[] arr,int target){
        int start = 0,mid =0;
        int end = 1;
        while(end < arr.length && arr[end] < target){
            start = end + 1;
            end = (end *2 < arr.length-1)? end*2 : arr.length-1;

        }
        while(end >= start){
            mid = start + (end-start)/2;
            if(target < arr[end]){
                if(arr[mid] > target){
                    end = mid-1;
                }
                else if(arr[mid] < target){
                    start = mid +1;
                }
                else if (arr[mid] == target){
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,9,10,11,22,25};
        int target = 22;
        System.out.println(findindex(arr,target));
    }
}

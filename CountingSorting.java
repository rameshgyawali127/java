class CountingSorting{
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 7 , 9 , 2,  3, 2};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        //To count the frequency of each element
        int[] arr_count = new int[largest+1];
        for(int i = 0 ; i< arr.length; i++){
            arr_count[arr[i]] ++;
        }
        //arr_count = [0,1,3,2,1,1,0,1,0,1]//This is the frequency
        // To fill all elements as per the count
        int j =0;
        for(int i = 0; i < arr_count.length; i++){
            while(arr_count[i] > 0){
                arr[j] = i;
                j++;
                arr_count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
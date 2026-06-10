
class MaxElement{
    public static void main(String args[]){
        int[] arr={4,6,12,89,45,34};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
                
            }
        }
        System.out.println(max);

        int max2=max;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max2){
                max2=arr[i];
                
            }
        }
        System.out.println(max2);
    }
}
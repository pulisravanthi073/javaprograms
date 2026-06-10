import.java.util.*;
class MissingElement{
    public static void main(String[] args){
    int[] arr={3,1,5,2};
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
        max=arr[i];
    }
    }
    int sum_natural=max*(max+1)/2;
    int sum=0;
      for(int ele:arr){
            sum+=ele;
      }
      System.out.println("missing value is:"+(sum_natural-sum));
    }
}






























































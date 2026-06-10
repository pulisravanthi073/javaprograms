import java.lang.*;
class Amstrong{
    public static void main(String args[]){
        int n=153;
        int temp=n;
        int temp1=n;
        int count=0,rem ,base;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;
        }
        int sum=0;
        while(temp>0){
            base=temp%10;
            sum+=Math.pow(base,count);
            temp=temp/10;
        }
        if(sum==temp1){
            System.out.println("amstrong");
        }
        else{
            System.out.println(" not amstrong");
        }
    }
}
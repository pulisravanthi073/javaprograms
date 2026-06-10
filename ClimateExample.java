import java.util.*;
class ClimateExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("temp ?");
        String temp = sc.next();
        if(temp.equals("high")){
            System.out.println("NO");
        }else if(temp.equals("medium")){
            System.out.println("cloudy?");
           boolean cloudy=sc.nextBoolean();
           if(cloudy==true){
            System.out.println("yes");
           }
           else{
            System.out.println("No");
           }
        }else if(temp.equals("low")){
            System.out.println("rainy");
            boolean rainy=sc.nextBoolean();
           if(rainy==true){
            System.out.println("yes");
           }
           else{
            System.out.println("No");
           }  
    }
}
}
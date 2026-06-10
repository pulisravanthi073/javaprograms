import java.util.*;
class greater{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=91 && marks<=100){
            System.out.println(" passed with O grade");
        }else if(marks>=81 && marks<=90){
             System.out.println(" passed with A+ grade");
        }else if(marks>=71 && marks<=80){
            System.out.println(" passed with A grade");
        }else if(marks>=61 && marks<=70){
            System.out.println(" passed with B+ grade");
        }
        else if(marks>=51 && marks<=60){
            System.out.println(" passed with B grade");
        }else{
            System.out.println(" failed");
        }
        
    }
}
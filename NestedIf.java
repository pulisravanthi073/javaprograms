import java.util.*;
class Nestedif{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float cgpa =sc.nextFloat();
        if(cgpa>=7.5f)
        {
            int back=sc.nextInt();
            if(back<=2)
            {
                int coding=sc.nextInt();
                if(coding>=2)
                    {
                        int com =sc.nextInt();
                        if(com>=60){
                            System.out.println("eligible for placements");
                        }
                        else{
                             System.out.println(" Not eligible for placements");
                        }
                    }
                    else{
                         System.out.println("atleast 2 coding questions should be solved");
                    }
            }else{
                 System.out.println("backlogs should be less than 2");
            }
        }else{
             System.out.println("cgpa must be greater than or equals to 7.5");
        }
    }
}
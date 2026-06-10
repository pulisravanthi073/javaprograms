class PasswordCheck{
    public static void main(String args[]){
        String s="Bits@1234";
        int len=s.length();
        char[] ch= s.toCharArray();
        int ucount=0,lcount=0,dcount=0,scount=0;
        if(len>=8){
            for(char c:ch){
                if(c>='A' && c<='z')
                {
                  ucount++;
                }
                else if(c>='a' && c<='z')
                {
                    lcount++;
                }
                else if(c>='0' && c<='9')
                {   
                    dcount++;
                }
                else{
                    scount++;
                }
            }
        }
        else{
            System.out.println("password is less than 8");
        }

        if(len>=8 && ucount>0 && lcount>0 && dcount>0 && scount>0){
            System.out.println("valid");
        }
        else{
             System.out.println("Invalid");
        }

    }
}

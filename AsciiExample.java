class AsciiExample{
    public static void main(String args[]){
        String s="a1s2c5d8";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                sum+=(int)c-'0';    
    }
}
System.out.println(sum);
    }
}

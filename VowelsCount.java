class VowelsCount{
    public static void main(String args[]){
        String name = "Sravanthi";
        int len=name.length();
        int count=0;
        for(int i=1;i<len;i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("vowels count is:" +count);
    }
}
class Example{
    public static void main(String args[]){
        String s="bits";
        char[] ch=s.toCharArray();
        int len=s.length();
        for(char c:ch){
            System.out.println(c+"->"+(c-96));
        }
    }
}
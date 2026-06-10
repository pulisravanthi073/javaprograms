class StringMethods{
    public static void main(String args[]){
        String s="helLlo";
        System.out.println(s.toUpperCase());
         System.out.println(s.toLowerCase());

        char[] character =s.toCharArray();
         for(char ch:character){
            System.out.print(ch+ " ");
         }
         
         String s1=new String("hello");
         String s2=new String("hello");
         if(s1==s2){
            System.out.println("s1");
         }
         if(s1.equals(s2)){
            System.out.println("s2");
         }
        String s11="hello";
         String s22="hello";
         if(s11==s22){
            System.out.println("s3");
         }
         if(s11.equals(s22)){
            System.out.println("s4");
         }


}
}

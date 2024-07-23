class HelloWorld {
    public static void main(String[] args) {
        String str1="HEllo WoRLd Programming";
        System.out.println("The String is "+str1);
        int cnt=0;
        String strr="";
        for(char i:str1.toCharArray())
        {
            cnt++;
        }
        for(int i=0;i<cnt;i++)
        {
            char c=str1.charAt(i);
            if(c>=65&&c<=90)
            {
                c+=32;
                System.out.print(c);
            }
            else
            {
                c-=32;
                System.out.print(c);
            }
        }
        String tstr1=str1.replaceAll(" ","");
        System.out.println("\n"+tstr1);
    }
}

class StringMeth
{
    public static void main(String args[])
    {
        String s1 = "Java Class July";
        String s2 = "JAVA CLASS PYTHON";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String s3 ="       Hello           ";
        System.out.println(s3.trim());

        System.out.println(s1.startsWith("J"));
        System.out.println(s1.endsWith("ly"));

        System.out.println(s1.charAt(4));

        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));

        System.out.println(s1.replace('a', 'b'));
        System.out.println(s2.contains("PYTHON"));

        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,10));

        String s[] = s1.split(" ");
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);

        System.out.println(String.join("/",s));
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);

        String s4="samsung";
        System.out.println(s4.isEmpty());

        
        int a = 12345;
        String s5 = String.valueOf(a);
        System.out.println(s5);

        char c[] = s4.toCharArray();
        for (char i: c)
        {
            int ascii = (int) i;
            System.out.println(ascii);
        }
       
    }
    
}
class Strings
{
    public static void main(String args[])
    {
        String s1 = "JAVA class";
        String m = "Python class";
        String s2 = "java class";
        String s4 [] = "Java,class,july,batch".split(",");
        //s = s + " July";
        //System.out.println(s);

        System.out.println(s1.concat(m));

        if(s1.equals(s2))
        {
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equal");
        }

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(m.toUpperCase());

        System.out.println(s1.toLowerCase());

        String s3 = "                    Hello                           ";
        System.out.println(s3);
        System.out.println(s3.trim());

        System.out.println(s2.charAt(2));

        System.out.println(s2.indexOf('a'));
        System.out.println(s2.lastIndexOf('a'));

        System.out.println(s2.replace('a','b'));

     //   System.out.println(s2.contains("python"));

      //  System.out.println(s4.isEmpty());
       // System.out.println(s2.isEmpty());

      /*  System.out.println(s2.startsWith("ja"));
        System.out.println(s2.endsWith("class"));
        for(int i = 0; i< s4.length;i++)
        System.out.println(s4[i]);

        String s5 = String.join("-",s4);
        System.out.println(s5);
    }*/
    System.out.println(s2.substring(4));
    System.out.println(s2.substring(0,4));
    }
}
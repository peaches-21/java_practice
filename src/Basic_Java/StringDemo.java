public class StringDemo {
    //String is class and immutable or not modify once initialized non premitive data type
    public static void main(String[] args) {
     String str = new String("Hello");
     System.out.println("str " + str); 
     System.out.println("str length "+ str.length());
     str=str.concat(" Welocome");
     System.out.println("str concat " + str);
     System.out.println("str concat length " + str.length());
     System.out.println(str.indexOf("o"));
     System.out.println(str.charAt(7));
     System.out.println(str.toUpperCase());
     System.out.println(str.toLowerCase());

     StringBuffer strBuffer = new StringBuffer("Welcome");
     System.out.println(strBuffer);
     System.out.println(strBuffer.append(" To Java"));
     System.out.println(strBuffer.insert(4, "How"));
     System.out.println(strBuffer.delete(4, 7));
     System.out.println(strBuffer.reverse());
    }
}

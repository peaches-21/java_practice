public class StringDemo {
    //String is class and immutable or not modify once initialized non premitive data type
    public static void main(String[] args) {
     String str = new String("Hello"); 
     System.out.println("str " + str); //str Hello
     System.out.println("str length "+ str.length()); //str length 5
     str=str.concat(" Welocome"); //concatenate two strings
     System.out.println("str concat " + str); //Hello Welcome
     System.out.println("str concat length " + str.length()); //13
     System.out.println(str.indexOf("o")); //4
     System.out.println(str.charAt(7)); //e 
     System.out.println(str.toUpperCase()); //HELLO WELCOME
     System.out.println(str.toLowerCase()); //hello welcome

     StringBuffer strBuffer = new StringBuffer("Welcome");
     System.out.println(strBuffer);
     System.out.println(strBuffer.append(" To Java"));
     System.out.println(strBuffer.insert(4, "How"));
     System.out.println(strBuffer.delete(4, 7));
     System.out.println(strBuffer.reverse());

     String firstName = "John";
     String lastName = "Doe";
     System.out.println(firstName + " " + lastName);
     String txt = "We\'re the so-called \"Vikings\" from the north\\.";
    }
}

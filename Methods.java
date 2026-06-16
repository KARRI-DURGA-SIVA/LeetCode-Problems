
class Methods {
            
    public static void main(String[] args) {
    String S1="java";
    String S2="java";
    String S3= new String("JAVA");
    String S4= new String("Hello Java");
    String S5= new String(" hello ");
    String str ="java,hello,siva";
    String S6 = "";
    char S7 = ' ';
    char S8= 's';
    char S9= '7';
    
    String arr[]=str.split(",");
       if(S1==S2){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }
       System.out.println(S2.toLowerCase());
       System.out.println(S4.toUpperCase());
       System.out.println(S2.charAt(0));
       System.out.println(S1.contains(S2));
       System.out.println(S1.substring(0,3));
       System.out.println(S4.lastIndexOf('a'));
       System.out.println(S4.indexOf('a'));
       System.out.println(S1.replace('a','o'));
       System.out.println(S6.isEmpty());
       System.out.println(str.length());
       System.out.println(S5.concat(" " + S1));
       System.out.println(S5.trim());
       System.out.println(Character.isLetter(S8));
       System.out.println(Character.isDigit(S9));
       System.out.println(Character.isWhitespace(S7));
      
    }
}
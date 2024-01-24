package String;
import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {

        // Declaration in StringBuilder;
//        java.lang.StringBuilder str1 = new java.lang.StringBuilder("Hello");
//        System.out.println(str1); // Hello
        //or == > By default it will take 16 byte space if we not inilize the value.
//        java.lang.StringBuilder str2 = new java.lang.StringBuilder();
//        str2.append("Hello");
//        System.out.println(str2); // Hello

        // setCharAt is also a inBuild Function in java we can we to set any specific character in existing String
//        str1.setCharAt(0,'m');
//        System.out.println(str1); // mello

        // Insert function is also present in String Builder so we can insert any character in between the existing String
//        str1.insert(2,'n');
//        System.out.println(str1); // menllo

        // Delete
//        str1.deleteCharAt(2);
//        System.out.println(str1); // Henllo after delete output are Hello

        // append is a inBuild Function in java so we using to add any String in same line;
//        str1.append("World");
//        System.out.println(str1); // menlloWorld

        // reverse
//        java.lang.StringBuilder sb = new java.lang.StringBuilder();
//        sb.append("Nafish");
//        System.out.println("Before Reverse : " +sb);
//        sb.reverse();
//        System.out.println("After Reverse : " + sb);

        //***********************************Question************************************
//        Scanner scanner = new Scanner(System.in);
//        String str =  scanner.nextLine();

//        reverseEachCharacterInString(str);
        String str = "my name is nafish";
        System.out.println(reverseEachCharacterInString(str));
    }

    public static String reverseEachCharacterInString(String str){
        String ans = "";
        java.lang.StringBuilder str1 = new java.lang.StringBuilder("");
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch != ' '){
                str1.append(ch);
            }
            else {
                str1.reverse();
                ans += str1;
                ans += " ";
                str1 = new java.lang.StringBuilder("");
            }
        }
        ans += str1;
        return ans;
    }

}

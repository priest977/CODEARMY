package String;

public class StringBasic {
    public static void main(String[] args) {
//        String str = "abc";
//        subString(str);
//        String str = "Hello";
//        changeSingleCharacter(str);
//
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = new String("Hello");
//        System.out.println(s1+s2);

//        String str = "100.1.1.1";
//        System.out.println(defangingOfIPAddress(str));

//        String ans = "nafish";
//        String temp = reverseStringClockWise(ans,ans.length()-3);
//        System.out.println(temp);

        String s1 = "geeksforgeeks";
        String s2 = "geeksgeeksfor";
        System.out.println(checkRotation(s1,s2));
    }

    // print all the substring
    public static void subString(String str){
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.print(str.substring(i,j) + " ");
            }
//            System.out.println();
        }
    }

    // Hello --> Given String ==> Heylo --> Expected output
    public static void changeSingleCharacter(String str){
       String ans =  str.substring(0,2) + 'y' + str.substring(3);
        System.out.println(ans);
    }

    public static String defangingOfIPAddress(String str){
        // By using Normal String

//            int index = 0;
//            String ans = "";
//            while (index < str.length()){
//                if(str.charAt(index) == '.'){
//                    ans = ans+"[.]";
//                    index++;
//                }
//                else
//                {
//                    ans += str.charAt(index);
//                    index++;
//                }
//            }
//            return ans;

        // By Using String Builder
        java.lang.StringBuilder ans = new java.lang.StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='.'){
                ans.append("[.]");
            }
            else
                ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    public static String reverseStringClockWise(String str1 , int index ){
        String ans = "";
        while (index >= 0) {
            ans = ans+str1.charAt(index);
            index--;
        }
        return ans;
    }

    public static boolean checkRotation(String s1 , String s2){
        if(s1.length() != s2.length()) return false;
        String s3 = s1+s1;
        return s3.contains(s2);
    }

}

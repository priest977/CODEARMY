package Stacks;

import java.util.Stack;

public class PrefixExpression {
    public static void main(String[] args) {

        String str = "9-5+4*3/6";
        prefixExpression(str);

    }

    public static void prefixExpression(String str){
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            // Change charcter to val with the help of Ascaii Code
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)
            {
                String s = "" + ch;
                val.push(s);
            }
           else if(op.size()==0) op.push(ch);
            else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        op.push(ch);
                    } else op.push(ch);
                }
            }
        }
        while (val.size()>1)
        {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}

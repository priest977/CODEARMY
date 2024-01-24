package Stacks;

import java.util.Stack;

public class InfixExpression {
    public static void main(String[] args) {
        // Follow BODMAS rule in case of Integer
//        int x = 9-5+4*3/6;
//        System.out.println(x);

        // Solve same expression by using Stack
//        String str = "9-5+4*3/6";
//        findInfixExpressionWithoutBracket(str);

        String str = "9-(5+4)*3/6";
        findInfixExpressionWithBracket(str);
    }

    public static void findInfixExpressionWithoutBracket(String str){
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            // Change charecter into integger
            int ascaii =(int)ch;
            // '0' --> value 48 and '9' --> 57
            if(ascaii>=48 && ascaii<=57)
            {
                val.push(ascaii-48);
            }
            else if(op.size()==0) op.push(ch);
            else {
                if(ch == '+' || ch == '-'){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while (val.size()>1)
        {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }

    public static void findInfixExpressionWithBracket(String str){
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            // Change charecter into integger
            int ascaii =(int)ch;
            // '0' --> value 48 and '9' --> 57
            if(ascaii>=48 && ascaii<=57)
            {
                val.push(ascaii-48);
            }
            else if(op.size()==0 || ch == '(' || op.peek() =='(') op.push(ch);
            else if(ch == ')') {
                while (op.peek() != '(')
                {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }
            else {
                if(ch == '+' || ch == '-'){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while (val.size()>1)
        {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}

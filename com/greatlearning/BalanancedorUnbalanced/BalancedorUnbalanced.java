package com.greatlearning.BalanancedorUnbalanced;
import java.util.*;
public class BalancedorUnbalanced {
	static boolean isBalancedorUnbalanced(String expr)
	    {
	        Deque<Character> stack
	            = new ArrayDeque<Character>();
	        for (int i = 0; i < expr.length(); i++)
	        {
	            char x = expr.charAt(i);
	 
	            if (x == '(' || x == '[' || x == '{')
	            {
	                stack.push(x);
	                continue;
	            }
	            if (stack.isEmpty())
	                return false;
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }
	        return (stack.isEmpty());
	    }
	    public static void main(String[] args)
	    {
	        //String expr = "([[{}]]))";
	    	String expr;
	        Scanner sc = new Scanner(System.in);
	    	expr = sc.next();
	        if (isBalancedorUnbalanced(expr))
	            System.out.println("The entered String has Balanced Brackets");
	        else
	            System.out.println("The entered Strings do not contain Balanced Brackets");
	    }
	}
	


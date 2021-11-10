package com.msanzar87.practice.Leetcode;

import java.util.Stack;

public class ValidParentheses20LC {

    public static void main(String[] args) {
        System.out.println(isValidBracket("[]"));
        System.out.println(isValidBracket("()"));
        System.out.println(isValidBracket("(([{}]))"));
        System.out.println(isValidBracket("(}[))("));
        System.out.println(isValidBracket("{]{{{))]]]"));

    }
    public static boolean isValidBracket(String input){
        Stack<Character> stack = new Stack();
        boolean bracket= true;
        for (int i = 0; i < input.length(); i++) {
            stack.add(input.charAt(i));
        }
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == '{' && stack.pop() == '}'){
                bracket = true;


            }
            if (input.charAt(j) == '(' && stack.pop() == ')'){
                bracket = true;


            }
            if (input.charAt(j) == '[' && stack.pop() == ']'){
                bracket = true;


            }

        }
        return bracket;
    }


}
//SOLUTION
//    Stack<Character> stack = new Stack<>();// stack is LIFO(the last element you put on the top of the stack will be
////the first to remove with pop() or get the element on top of the stack with peek()
//
//
//        	for(char c : s.toCharArray()) //iterate through characters in the given string
//                    {
//                    // if the character is either one of the openings it is pushed onto the stack,
//                    //the last opening added is on top of the stack; ex. "({[]})" last element added that is on top is'['
//                    if(c=='(' || c=='{' || c=='[') stack.push(c);
//
//
//                    //it is possible to rewrite the next 3 statements into one
//                    //the idea is that the last opening in the stack should correspond to its closing
//                    //and if that's a case by following 3 statements the stack will be empty after the for loop
//                    else if(c==')' && !stack.isEmpty() && stack.peek()=='(' ) stack.pop();
//                    else if(c=='}' && !stack.isEmpty() && stack.peek()=='{' ) stack.pop();
//                    else if(c==']' && !stack.isEmpty() && stack.peek()=='[' ) stack.pop();
//
//
//                    //handles any conditions that does not satisfy above statements
//                    else return false;
//                    }
//
//                    // if each char on the stack had its closing in correct place then the stack would be empty
//                    //hence stack.empty will return true if the string was valid and false otherwise.
//                    return stack.empty();
//
//
//                    }

package com.lc.ds.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author Vel
 * @date 18/04/23 : 07:51
 * Question link : https://leetcode.com/problems/valid-parentheses/?envType=study-plan&id=data-structure-i
 * Question name : Valid Parantheses
 * Question desc :
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *     Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParenthesesDriver {
    public static void main(String[] args) {


    }
}

/*
 * Approach :
 *  Declare valid open parentheses
 * if the inputchar belongs to any of the open braces -> push to stack
 * if it's close braces -> check the top element of stack is valid for the incoming paranthesis
 * Also, ensure that stack is not empty (before pulling the top element)
 * If it's empty -> Then invalid
 * If it's mismatching -> Then invalid
 * After iterating all elements in the input string,
 * check if the stack is empty -
 *  -> If yes - Valid parentheses (return true)
 * -> If not - invalid (return false)
 */
class ParenthesesValidator {
    public boolean isValid(String input) {


        Stack<Character> parenthesisStack = new Stack<>();

        for(Character currentChar : input.toCharArray()){
            switch(currentChar){
                case '(' :
                case '{' :
                case '[' :
                    parenthesisStack.push(currentChar);
                    break;
                case ')':
                case '}':
                case ']':
                    if(hasMatchingOpenParenthesis(currentChar, parenthesisStack)){
                        parenthesisStack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
            }
        }

        return parenthesisStack.isEmpty();
    }

    private boolean hasMatchingOpenParenthesis(Character currentChar, Stack<Character> parenthesisStack) {
        if(parenthesisStack.isEmpty()) {
            return false;
        }
        switch(currentChar){
            case ')' : return parenthesisStack.peek() == '(';
            case '}' : return parenthesisStack.peek() == '{';
            case ']' : return parenthesisStack.peek() == '[';
        }
        return false;
    }
}

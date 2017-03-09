/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tag.algorithmProblems;

import com.tag.problemStructure.Problem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quantumDrop
 */
public class NumberLengthProblem implements Problem {
    List<Integer> validNumbers = new ArrayList<>();
    
    @Override
    public void printSolution() {
        numberLengthSolution(5, 2);
        for(Integer cur : validNumbers){
            System.out.println(cur);
        }
    }
    
    /*
     *  
     */
    public void numberLengthSolution(Integer sum, Integer numberLength){
        Integer n = (int)Math.pow(10, numberLength), count = 0;
        for(int i=1; i<=n; i++){
            String numberStr = i + "";
            count=0;
            for(int j=0; j<numberStr.length(); j++){
                String currentDigitStr = numberStr.charAt(j) + "";
                count+=Integer.parseInt(currentDigitStr);
                
                if(count > sum){
                    break;
                }
            }
            if(count==sum){
                validNumbers.add(i);
            }
        }
    }

    @Override
    public void printProblemStatement(boolean withExample) {
        System.out.println("The challenge is to solve this in linear time of O(KN) where N is the number length and K is the sum.\n"
                + "Given integers sum and numberLength, find the number of non-negative integers less than 10^N where N is the number length"
                + " such that the sum of digits for each of them is equal to sum.\n"
                + "Example\n"
                + "For sum = 5 and numberLength = 2 there is six numbers between 0 and 10^2=100 "
                + "the sum of their digits is 5. So the output will be 6.\n"
                + "These integers are: 5, 14, 23, 32, 41, 50.");
    }

    @Override
    public void printExample() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

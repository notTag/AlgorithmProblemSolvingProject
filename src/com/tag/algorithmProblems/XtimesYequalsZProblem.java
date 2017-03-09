/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tag.algorithmProblems;

import com.tag.problemStructure.Problem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author quantumDrop
 */
public class XtimesYequalsZProblem implements Problem {
    private List<Integer> ul = new ArrayList<>();
    private List<String> groups = new ArrayList<>();
    
    @Override
    public void printProblemStatement(boolean withExample) {
        System.out.println("You have an unordered list of n positive numbers. "
                + " Find all groups of 3 numbers such that x * y = z, with x, y, and z being numbers in the list. "
                + "The range of numbers K can be assumed to be small. (i.e. K<<n) The solution must be O(n).");
    }
    
    @Override
    public void printSolution() {
        Integer[] arr = {8, 2, 3, 7, 9, 6, 7, 4, 8, 14};
        ul.addAll(Arrays.asList(arr));
        
        xTimesYequalsZSolution(ul, groups);
        for(String cur : groups){
            System.out.println(cur);
        }
    }
    
    public List<String> xTimesYequalsZSolution(List<Integer> ul, List<String> g){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer x : ul) {
            for(Integer y : ul){
//                if(y==2){
//                    System.out.println(x + " " + y);
//                }
                map.put(x*y, x);
            }
        }
        
        for(Integer z : ul){
            if(map.containsKey(z)){
                int x = map.get(z);
                int y = z/map.get(z);
                g.add(x + " " + y + " " + z);
            }
        }
        return g;
    }

    @Override
    public void printExample() {
        
    }



}

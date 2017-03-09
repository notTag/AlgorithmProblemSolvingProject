/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tag.problemStructure;

import java.util.List;

/**
 *
 * @author quantumDrop
 */
public class ProblemHelper {
        public void newRandomUnorderedList(int size, List<Integer> newUnorderedList){
//        List<Integer> newUnorderedList = new ArrayList<>();
        for(int i=0; i<size; i++){
            int el = (int) (Math.random()*10);
            System.out.print(el + ", ");
            newUnorderedList.add(el);
        }
        
//        return newUnorderedList;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tag.algorithmProblems;

import com.tag.problemStructure.Problem;

/**
 *
 * @author quantumDrop
 */
public class SpiralOrderProblem implements Problem{
    private String problemStatement =  "Given a 2D array (matrix) named M, print all items of M in a spiral order, clockwise.\n";
    private String problemExample = "For example:\n"
    +"M  =  1   2   3   4   5\n"
    +       "6   7   8   9  10\n"
    +      "11  12  13  14  15\n"
    +      "16  17  18  19  20\n\n"
    +"The clockwise spiral print is:  \n1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12\n";
    private static int[][] bigArray = {
            {1,  2,  3,  4,  5,  6,  7, 8},
            {9,  10, 11, 12, 13, 14, 15, 16},
            {17, 18, 19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30 , 31, 32},
            {33, 34, 35, 36, 37, 38, 39, 40}
    };
    
    @Override
    public void printSolution() {
        int[][] m = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9 ,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        this.printMatrixSpiral(m);
    }

    public void printSolutionWithArray(int[][] m) {
        this.printMatrixSpiral(m);
    }
      
    public void printMatrixSpiral(int[][] m){
        int x = m.length;
        int y = m[0].length;

        int totalNodesVisited=0, i=0, totalNodes=(m.length*m[0].length);
        while(true){
            totalNodesVisited += goingRight(m,(i), y-(i+1), i);
            if(totalNodesVisited>totalNodes){ break; }
            
            totalNodesVisited += goingDown(m, (x-i), y-i, i);
            if(totalNodesVisited>totalNodes){ break; }
            
            totalNodesVisited += goingLeft(m, x-(i+1), y-(i+2), i);
            if(totalNodesVisited>totalNodes){ break; }
            
            int tempX = (x)-(i+2);
            totalNodesVisited += goingUp(m, tempX, i, (i+1));
            if(totalNodesVisited>=totalNodes){ break; }
            
//            System.out.println("_______" + totalNodesVisited + " out of " + totalNodes);
            i++;
        }
    }
    
    public int goingRight(int [][] m, int x, int y, int startingEdge){
//        System.out.print("GOING RIGHT: \t");
        int cnt=0;
        for(int j=startingEdge; j<y; j++){
            System.out.print(m[x][j] + " ");
            cnt++;
        }
//        System.out.println();
        return cnt;
        
    }
    public int goingDown(int [][] m, int x, int y, int startingEdge){
//        System.out.print("GOING DOWN: \t");
        int cnt=0;
        for(int i=startingEdge; i<x; i++){
            System.out.print(m[i][y-1] + " ");
            cnt++;
        }
//        System.out.println();
        return cnt;
    }
    public int goingLeft(int [][] m, int x, int y, int leftEdge){
//        System.out.print("GOING LEFT: \t");
        int cnt=0;
        for(int i=y; i>=leftEdge; i--){
            System.out.print(m[x][i] + " ");
            cnt++;
        }
//        System.out.println();
        return cnt;
    }
    public int goingUp(int [][] m, int x, int y, int topEdge){
//        System.out.print("GOING UP: \t");
        int cnt=0;
        for(int i=x; i>=topEdge; i--){
            System.out.print(m[i][y] + " ");
            cnt++;
        }
//        System.out.println();
        return cnt;
    }
    

    @Override
    public void printProblemStatement(boolean withExample) {
        System.out.println(problemStatement);
        if(withExample == true){ this.printExample(); }
    }

    
    @Override
    public void printExample() {
        System.out.println(problemExample);
    }


}

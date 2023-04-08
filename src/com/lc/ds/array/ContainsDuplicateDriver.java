package com.lc.ds.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vel
 * @date 07/04/23 : 09:59
 * Question link : https://leetcode.com/problems/contains-duplicate/
 * Question name : Contains duplicate
 * Question desc : Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 */
public class ContainsDuplicateDriver {
    public static void main(String[] args) {

        int[] input = {1,2,3,1};//Test case#
        //int[] input = {};//Test case#
        DuplicateFinder duplicateFinder = new DuplicateFinder();
        System.out.println("Contains duplicate : " + duplicateFinder.containsDuplicate(input));
    }
}

class DuplicateFinder{
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> uniqueElements = new HashSet<Integer>();

        for(int currentElement : nums){
            if(!uniqueElements.add(currentElement)){
                return true;
            }
        }

        return false;
    }
}

package com.bridgelab.programs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(Integer a:array) {
            map.put(a,map.getOrDefault(a, 0)+1);
        }
        Set<Entry<Integer, Integer>> entries = map.entrySet();
        for(Entry<Integer, Integer> e:entries) {
            if(e.getValue()>1) {
                System.out.println(e.getKey());
            }
        }
    }
}

package com.test.app;

import java.util.Arrays;

/**
 * Linear Probing implementation of hash function with limited set of keys
 */
public class HashTable {
    int size = 5;
    private Integer[] keys = new Integer[size];
    private String[] values = new String[size];

    public void put(Integer k, String val){
        int hash = val.hashCode();
        hash = hash%size;
        for(int i = hash; i< values.length; i++){;
            if(values[i]==null){
                values[i] = val;
                keys[i] = k;
                return;
            }
            else if(hash != 0 && hash == i){
                resize(size);
                continue;
            }
            else if(hash != 0 && i+1 == values.length){
                i = 0;
            }
        }

    }

    public String get(Integer k){
        for(int i =0 ; i< keys.length; i++){
            if(k.equals(keys[i])) return values[i];
        }
        return null;
    }

    private void resize(int currentSize){
        System.out.println("Resizing currentSize: "+currentSize);
        size = currentSize*2;
        values = Arrays.copyOf(values, currentSize*2);
        keys = Arrays.copyOf(keys, currentSize*2);
    }
}

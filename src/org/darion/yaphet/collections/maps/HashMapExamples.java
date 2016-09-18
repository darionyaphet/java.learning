package org.darion.yaphet.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapExamples {
    public static void main(String[] args) {

        // An instance of HashMap has two parameters that affect its performance:
        // initial capacity and load factor.

        // The capacity is the number of buckets in the hash table,
        // and the initial capacity is simply the capacity at the time the hash table is created.

        // The load factor is a measure of how full the hash table is allowed to get before its
        // capacity is automatically increased.
        // When the number of entries in the hash table exceeds the product of the load factor
        // and the current capacity, the hash table is rehashed so that the hash table has
        // approximately twice the number of buckets.

        Map<Integer, Integer> map = new HashMap<>(32, 0.8F);
        Random random = new Random(System.currentTimeMillis());

        for (int index = 0; index < 32; index++) {
            map.put(index, random.nextInt(128));
        }
        System.out.println(map);

        System.out.println("When the key is not exist : " + map.get(-1)); // null
    }
}

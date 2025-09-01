package com.multi.Object.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public void mapMethod1(){
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1,"박태란");
        hashmap.put(2,"함영웅");
        hashmap.put(3,"윤두준");
        hashmap.put(4,"이재욱");
        System.out.println(hashmap.toString()); //toSting이 호출 되어 문자열로 반환
        String name=String.valueOf(hashmap.get(1).startsWith("박")).charAt(0)=='t'?"박태란":"아마나"; //중첩
        System.out.println(name);


        System.out.println();

        Set<Integer> set=hashmap.keySet();
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()){
            int key=iterator.next();
            System.out.println(key+":"+hashmap.get(key));
        }

        System.out.println();

        Iterator<Map.Entry<Integer,String>>iter=hashmap.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<Integer,String>entry=iter.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

    public static void main(String[] args) {
        MapEx1 map = new MapEx1();
        map.mapMethod1();
    }
}

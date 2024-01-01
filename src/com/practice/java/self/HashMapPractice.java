package com.practice.java.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	//ArrayList<Integer> g = new ArrayList<>(map);
	map.put(10, "payal");
	map.put(20, "neha");
	map.put(3, "neha");
	map.put(2, "amit");
	map.put(null, null);
	map.put(6, null);
	HashMap<Integer, String> map1= new HashMap<>();
	map1.put(4, "aaa");
	map1.put(8, "hhh");
	map1.put(7, "kittu");
	map1.put(9, "amit");
	
	map.putAll(map1);
	System.out.println(map.get(20));
	System.out.println(map.keySet());
	System.out.println(map.size());
	map.remove(20);
	System.out.println(map.values());
	System.out.println(map.toString());
	map.remove(3, "neha");
		Set<Entry<Integer, String>> set=map.entrySet();
		Iterator<Entry<Integer, String>> m  = set.iterator();
		while(m.hasNext()) {
			Entry<Integer, String> b=m.next();
			System.out.println(b.getKey()+" "+b.getValue());
		}
		
		}
		
	}



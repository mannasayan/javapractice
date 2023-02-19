package com.demo;

import java.util.HashMap;
import java.util.Map;

public class ImmutableQ {
	
	private String name;
	private int age;
	private Map<String,Double> mapData;
	
	public ImmutableQ(String name, int age, Map<String, Double> mapData) {
		super();
		this.name = name;
		this.age = age;
		this.mapData = mapData;
	}
	
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	
	public Map<String,Double> getMapData(){
		Map<String,Double> tempMap = new HashMap<>();
		tempMap.keySet().stream().forEach((k)->tempMap.put(k, this.mapData.get(k)));
		return tempMap;
	}

}

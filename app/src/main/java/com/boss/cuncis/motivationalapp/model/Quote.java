package com.boss.cuncis.motivationalapp.model;

import com.google.gson.annotations.SerializedName;

public class Quote{

	@SerializedName("quote")
	private String quote;

	@SerializedName("name")
	private String name;

	public String getQuote(){
		return quote;
	}

	public String getName(){
		return name;
	}
}
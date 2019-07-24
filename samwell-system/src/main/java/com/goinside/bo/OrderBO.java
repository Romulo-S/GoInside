package com.goinside.bo;

import org.bson.types.ObjectId;

import lombok.Data;

@Data
public class OrderBO {

	public ObjectId _id;
	private String bookTitle;
	private String quantity;
	private String value;
	private String totalOrder;

}

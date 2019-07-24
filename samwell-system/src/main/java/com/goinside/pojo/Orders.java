package com.goinside.pojo;

import javax.inject.Named;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Named
@Data
@Document("orders")
public class Orders {

	@Id
	public ObjectId _id;
	private String bookTitle;
	private String quantity;
	private String value;
	private String totalOrder;

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
}

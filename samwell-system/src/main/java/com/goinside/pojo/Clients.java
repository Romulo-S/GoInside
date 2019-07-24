/**
 * 
 */
package com.goinside.pojo;

import javax.inject.Named;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author romulo
 *
 */
@Named
@Data
@Document("clients")
public class Clients {

	@Id
	public ObjectId _id;
	private String name;
	private String adress;
	private String email;

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

}
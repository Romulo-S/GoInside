/**
 * 
 */
package com.goinside.view;

import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

/**
 * @author romulo
 *
 */
@Named
@Getter
@Setter
public class OrderView {

	private String title;
	private String quantity;
	private Double price;
	private String totalPrice;
}

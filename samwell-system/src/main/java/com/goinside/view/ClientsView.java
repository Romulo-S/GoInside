/**
 * 
 */
package com.goinside.view;

import javax.inject.Named;

import com.goinside.bo.ClientBO;
import com.goinside.service.ClientService;

import lombok.Getter;
import lombok.Setter;

/**
 * @author romulo
 *
 */
@Named
@Getter
@Setter
public class ClientsView {

	private String name;
	private String adress;
	private String phone;
	private String email;

	private ClientService clientService;
	private ClientBO clientBO;

	public void init() {
		clientBO = new ClientBO();
	}

	public void save() {
		clientBO.setName(name);
		clientBO.setEmail(email);
		clientBO.setAdress(adress);
		this.clientService.save(clientBO);
	}

	public String showGreeting() {
		return "New client saved succesfuly!";
	}
}

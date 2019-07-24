package com.goinside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goinside.bo.ClientBO;
import com.goinside.pojo.Clients;
import com.goinside.repository.ClientsRepository;

import lombok.Data;

@Data
@Service
public class ClientService {

	@Autowired
	private ClientsRepository clientsRepository;
	private Clients client;

	public void save(ClientBO clientBO) {
		client = new Clients();
		client.setAdress(clientBO.getAdress());
		client.setEmail(clientBO.getEmail());
		client.setName(clientBO.getName());
		this.clientsRepository.save(client);
	}
}

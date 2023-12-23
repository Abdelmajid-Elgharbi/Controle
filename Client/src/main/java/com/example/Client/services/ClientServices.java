package com.example.Client.services;

import com.example.Client.entities.Client;
import com.example.Client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;
    public List<Client> findAll(){
        return clientRepository.findAll();
    }
    public Client findById(Long id) throws Exception{
        return clientRepository.findById(id).orElseThrow(() ->new Exception("invalid Client ID"));
    }
    public void addClient (Client client){
        clientRepository.save(client);
    }


}

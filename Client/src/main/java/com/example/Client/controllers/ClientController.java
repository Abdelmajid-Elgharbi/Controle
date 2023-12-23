package com.example.Client.controllers;

import com.example.Client.entities.Client;
import com.example.Client.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    private ClientServices service;

@GetMapping
    public List<Client> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception{
    return service.findById(id);

}
@PostMapping
    public void save(@RequestBody Client client){
    service.addClient(client);
}


}

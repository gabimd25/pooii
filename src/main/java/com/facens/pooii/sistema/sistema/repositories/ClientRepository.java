package com.facens.pooii.sistema.sistema.repositories;

import java.util.ArrayList;
import java.util.List;

import com.facens.pooii.sistema.sistema.entities.Client;

import org.springframework.stereotype.Component;

@Component
public class ClientRepository {
    
    public List<Client> getClients() {
        Client c = new Client();
        c.setId(1l);
        c.setName("Glauco");
        c.setAddress("Rua x, 99");

        Client c2 = new Client();
        c2.setId(2l);
        c2.setName("Gabi");
        c2.setAddress("Rua y, 88");

        List<Client> list = new ArrayList<>();
        list.add(c);
        list.add(c2);
        
        return list;
    }
}

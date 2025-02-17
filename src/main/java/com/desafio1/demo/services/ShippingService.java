package com.desafio1.demo.services;

import com.desafio1.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double valor=order.getBasic();
        if (valor<100){
            return 20.0;
        }
        else if (valor>200){
            return 0;
        }
        else{
            return 12.0;
        }
    }
}

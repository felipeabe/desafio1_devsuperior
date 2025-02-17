package com.desafio1.demo;

import com.desafio1.demo.entities.Order;
import com.desafio1.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		System.out.println("""
				Dados do pedido: 
				Códidgo do pedido, valor básico e porcentagem de desconto""");
		int code=scanner.nextInt();
		double basicValue=scanner.nextDouble();
		double discount=scanner.nextDouble();
		Order order=new Order(code, basicValue,discount);
		System.out.println("Pedido código: "+order.getCode());
		System.out.println("Valor total: R$"+orderService.total(order));
	}
}

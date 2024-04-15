package com.springdevsuperior.springprofessional1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdevsuperior.springprofessional1.entities.Order;
import com.springdevsuperior.springprofessional1.services.OrderService;

@SpringBootApplication
public class Springprofessional1Application implements CommandLineRunner {

	@Autowired
	private OrderService os;
	
	public static void main(String[] args) {
		SpringApplication.run(Springprofessional1Application.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dados Do Pedido:");
		System.out.print("Código:");
		int cod=sc.nextInt();
		System.out.print("Valor Básico:");
		double value=sc.nextDouble();
		System.out.print("Porcentagem De Desconto:");
		double percentage=sc.nextDouble();
		Order order=new Order(cod, value, percentage);
		
		System.out.println();
		System.out.println("Pedido Código "+order.getCode());
		System.out.println("Valor total: R$ "+String.format("%.2f", os.total(order)));
		
		
	}

}

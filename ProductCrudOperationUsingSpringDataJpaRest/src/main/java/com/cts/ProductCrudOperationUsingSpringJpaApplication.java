package com.cts;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.model.Product;
import com.cts.service.ProductService;
import com.cts.service.ProductServiceImpl;

@SpringBootApplication 
public class ProductCrudOperationUsingSpringJpaApplication {

	public static void main(String[] args) {
	SpringApplication.run(ProductCrudOperationUsingSpringJpaApplication.class, args);
	System.out.println("HELLO.....");
	}

}

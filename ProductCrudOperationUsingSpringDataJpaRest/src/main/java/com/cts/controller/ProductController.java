package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exceptions.ProductNotFound;
import com.cts.model.Product;
import com.cts.service.ProductService;
 
@RestController
@RequestMapping("/products") // http://localhost:8080/products
public class ProductController {
    @Autowired
	ProductService service;
 
	@GetMapping("/getMsg") // http://localhost:8080/products/getMsg
	public String sayHello() {
		return "am jbj trying to listen but am getting sleep";
	}
 
	@PostMapping("/saveproduct") // http://localhost:8080/products/saveproduct
	@Validated
	public String insertProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	@PutMapping("/updateproduct") // http://localhost:8080/products/updateproduct
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	@GetMapping("/getproduct/{pid}") // http://localhost:8080/products/getproduct/
	public Product fetchProduct(@PathVariable("pid") int productId) throws ProductNotFound {
		return service.getProduct(productId);
	}
	@DeleteMapping("/deleteproduct/{pid}") // http://localhost:8080/products/deleteproduct/
	public String deleteProduct(@PathVariable("pid") int productId) {
		return service.removeProduct(productId);
	}
	@GetMapping("/getAll") // http://localhost:8080/products/getAll
	public List<Product> getAll() {
		return service.getAllProducts();
	}
	@GetMapping("/getProductsBetween/{initialPrice}/{finalPrice}") // http://localhost:8080/products/getProductsBetween/
	public List<Product> getProductsBetween(@PathVariable("initialPrice") int initialPrice,@PathVariable("finalPrice") int finalPrice) {
		return service.getAllProductsBetween(initialPrice, finalPrice);
	}
	@GetMapping("/getAllProductsByCategory/{Category}") // http://localhost:8080/products/getAllProductsByCategory/
	public List<Product> getAllProductsByCategory(@PathVariable("Category") String Category) {
		return service.getAllProductsByCategory(Category);
	}
	@GetMapping("/getProductsGraterThanPrice/{price}") // http://localhost:8080/products/getProductsGraterThanPrice
	public List<Product> getProductsGraterThanPrice(@PathVariable("price") int price) {
		return service.getProductsGraterThanPrice(price);
	}
}
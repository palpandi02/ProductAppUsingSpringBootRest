package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_info")
@Data
@NoArgsConstructor
public class Product {
	@Id
	@Column(name="pId")
	@GeneratedValue
	private int productId;
	@NotBlank(message="Product name can't be null or blank")
	private String productName;
	@Column(name="price")
	@Min(value=100,message="Product price must above 100")
	@Max(value=100000,message="Product price must below 100000")
	private int productPrice;
	@Size(min=5,max=12,message="Category length must between (5,12)")
	private String productCategory;
	@Column(name="quantity")
	@Positive
	private int productQuantity;
	public Product(String productName, int productPrice, String productCategory, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}
}

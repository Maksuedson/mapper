package com.mapper.struct.mapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.struct.mapper.dto.ProductDto;
import com.mapper.struct.mapper.mapper.ProductMapper;
import com.mapper.struct.mapper.model.Product;
import com.mapper.struct.mapper.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@Autowired
	private ProductMapper mapper;
	
	@PostMapping
	public ResponseEntity<Product> createProductMapper(@RequestBody ProductDto dto){
		Product product = mapper.productDtoToProduct(dto);
		Product saveProduct = repo.save(product);
		return ResponseEntity.ok(saveProduct);
	}
}

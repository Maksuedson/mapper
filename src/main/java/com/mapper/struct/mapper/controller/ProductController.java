package com.mapper.struct.mapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.struct.mapper.dto.ProductDto;
import com.mapper.struct.mapper.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService mapper;
	
	@PostMapping
	public ResponseEntity<ProductDto> createProductMapper(@RequestBody ProductDto dto){
		ProductDto productDto = mapper.saveProduct(dto);
		return ResponseEntity.ok(productDto);
	}
}

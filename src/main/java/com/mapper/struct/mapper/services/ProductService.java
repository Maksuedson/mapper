package com.mapper.struct.mapper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.struct.mapper.dto.ProductDto;
import com.mapper.struct.mapper.model.Product;
import com.mapper.struct.mapper.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public ProductDto convertToDto(Product product) {
		ProductDto productDto = new ProductDto();
		productDto.setId(product.getId());
		productDto.setNome(product.getName());
		productDto.setPreco(product.getPrice());
		
		return productDto;
	}
	
	public Product convertToEntity(ProductDto dto) {
		Product product = new Product();
		product.setId(dto.getId());
		product.setName(dto.getNome());
		product.setPrice(dto.getPreco());
		
		return product;
	}
	
	public ProductDto saveProduct(ProductDto productDto) {
		Product product = convertToEntity(productDto);
		Product saveProduct = repo.save(product);
		
		return convertToDto(saveProduct);
	}
}

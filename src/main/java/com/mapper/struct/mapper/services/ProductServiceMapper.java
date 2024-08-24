package com.mapper.struct.mapper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.struct.mapper.dto.ProductDto;
import com.mapper.struct.mapper.mapper.ProductMapper;
import com.mapper.struct.mapper.model.Product;
import com.mapper.struct.mapper.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceMapper {

	@Autowired
	private ProductRepository repo;
	
	@Autowired
	private ProductMapper mapper;
	
    public ProductDto saveProduct(ProductDto productDto) {
        Product product = mapper.productDtoToProduct(productDto);
        Product savedProduct = repo.save(product);
        return mapper.productToProductDto(savedProduct);
    }
}

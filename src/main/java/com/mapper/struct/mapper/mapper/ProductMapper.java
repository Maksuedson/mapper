package com.mapper.struct.mapper.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mapper.struct.mapper.dto.ProductDto;
import com.mapper.struct.mapper.model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	
    @Mapping(source = "price", target = "preco")
    @Mapping(source = "name", target = "nome")
	ProductDto productToProductDto(Product product);
	
    @Mapping(source = "preco", target = "price")
    @Mapping(source = "nome", target = "name")
    Product productDtoToProduct(ProductDto productDto);
}

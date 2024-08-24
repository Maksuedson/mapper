package com.mapper.struct.mapper;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mapper.struct.mapper.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}

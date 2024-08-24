package com.mapper.struct.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDto {

	private Long id;
	private String nome;
	private double preco;
}

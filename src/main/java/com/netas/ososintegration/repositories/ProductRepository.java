package com.netas.ososintegration.repositories;

import org.springframework.data.repository.CrudRepository;

import com.netas.ososintegration.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}

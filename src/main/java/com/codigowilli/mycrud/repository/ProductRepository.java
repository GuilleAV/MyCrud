package com.codigowilli.mycrud.repository;

import com.codigowilli.mycrud.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    public Product findByCode(Long code);

    public Product findByDescription(String description);
}

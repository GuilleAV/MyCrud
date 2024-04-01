package com.codigowilli.mycrud.service;
import com.codigowilli.mycrud.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    public Product insertProduct(Product product);
    public List<Product> listarProducts();
    public Product getProductByCode(Long code);

    public Product getProductByDescription(String description);

    public Product updateProduct(Product product);


}

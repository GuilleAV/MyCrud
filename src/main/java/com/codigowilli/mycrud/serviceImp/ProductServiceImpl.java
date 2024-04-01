package com.codigowilli.mycrud.serviceImp;

import com.codigowilli.mycrud.dto.ProductDTO;
import com.codigowilli.mycrud.model.Product;
import com.codigowilli.mycrud.repository.ProductRepository;
import com.codigowilli.mycrud.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public Product insertProduct(Product product) {

         return productRepository.save(product);
    }

    @Override
    public List<Product> listarProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product getProductByCode(Long code) {
        return productRepository.findByCode(code);
    }

    @Override
    public Product getProductByDescription(String description) {
        return productRepository.findByDescription(description);
    }

    @Override
    @Transactional
    public Product updateProduct(Product productExistente) {

        return  productRepository.save(productExistente);

    }


}

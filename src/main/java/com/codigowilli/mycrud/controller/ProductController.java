package com.codigowilli.mycrud.controller;
import com.codigowilli.mycrud.dto.ProductDTO;
import com.codigowilli.mycrud.handler.ErrorResponse;
import com.codigowilli.mycrud.model.Product;
import com.codigowilli.mycrud.service.ProductService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    private static Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    @GetMapping(value= "/app/v1/products")
    public ResponseEntity<List<Product>> getListProduct(){

        List<Product> products = productService.listarProducts();

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping(value = "/app/v1/product")
    public ResponseEntity<Object> getProduct(@RequestParam(name = "code") Long code){

        Product product = productService.getProductByCode(code);

        if(product!=null){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrorResponse(HttpStatus.NOT_FOUND.value(),"Producto Inexistente","El producto con el código "+code+" no existe" ));
    }

    @PostMapping("/app/v1/add")
    public ResponseEntity<Object> addProduct(@RequestBody ProductDTO productDTO) {

        Product product = new Product();
     //   product.setBarcode(productDTO.getBarcode());
     //   product.setDescription(productDTO.getDescription());

        ModelMapper mapper = new ModelMapper();
        product = mapper.map(productDTO,Product.class);

        Product savedProduct = productService.insertProduct(product);

        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @PutMapping("/app/v1/update")
    public ResponseEntity<Object> updateProduct (@RequestParam Long code,@RequestBody ProductDTO productDTO) {

        Product productExisting = productService.getProductByCode(code);

        if(productExisting!=null){

            ModelMapper mapper = new ModelMapper();
           productExisting = mapper.map(productDTO,Product.class);
           productExisting.setCode(code);


            Product updated = productService.updateProduct(productExisting);

            return new ResponseEntity<>(updated, HttpStatus.OK);
        }

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ErrorResponse(HttpStatus.CONFLICT.value(),"No es posible modificar el producto",
                        "El producto con el código " +code +" no existe"));
    }

}

package com.example.sweetcorner.service;

import com.example.sweetcorner.model.Product;
import com.example.sweetcorner.model.dto.ProductDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Optional<Product> findByName(String name);

    Optional<Product> save(String name, Double price, Integer quantity, Long category, String fileName, MultipartFile multipartFile) throws IOException;

    Optional<Product> save(ProductDto productDto);

    Optional<Product> edit(Long id, String name, Double price, Integer quantity, Long category, String fileName, MultipartFile image) throws IOException;

    Optional<Product> edit(Long id, ProductDto productDto);

    void deleteById(Long id);

}

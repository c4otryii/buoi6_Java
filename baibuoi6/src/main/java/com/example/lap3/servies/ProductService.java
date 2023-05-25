//package com.example.lap3.servies;
//
//import com.example.lap3.entity.Product;
//import com.example.lap3.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//    @Autowired
//    private ProductRepository repo;
//
//    public ProductService(ProductRepository repo) {
//        this.repo = repo;
//    }
//
//    public List<Product> GetAll() {
//        return (List<Product>) repo.findAll();
//    }
//    public void add(Product newProduct) {
//        repo.save(newProduct);
//    }
//}

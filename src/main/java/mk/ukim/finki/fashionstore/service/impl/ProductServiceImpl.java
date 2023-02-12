package mk.ukim.finki.fashionstore.service.impl;

import mk.ukim.finki.fashionstore.repsitory.jpa.CategoryRepository;
import mk.ukim.finki.fashionstore.repsitory.jpa.ManufacturerRepository;
import mk.ukim.finki.fashionstore.repsitory.jpa.ProductRepository;
import mk.ukim.finki.fashionstore.model.Category;
import mk.ukim.finki.fashionstore.model.Manufacturer;
import mk.ukim.finki.fashionstore.model.Product;
import mk.ukim.finki.fashionstore.model.exceptions.CategoryNotFoundException;
import mk.ukim.finki.fashionstore.model.exceptions.ManufacturerNotFoundException;
import mk.ukim.finki.fashionstore.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ManufacturerRepository manufacturerRepository;

    public ProductServiceImpl(ProductRepository productRepository,
                              CategoryRepository categoryRepository,
                              ManufacturerRepository manufacturerRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Optional<Product> findByName(String name) {
        return this.productRepository.findByName(name);
    }

    @Override
    public Optional<Product> save(String name, Double price, Integer quantity, Long categoryId,
                                  Long manufacturerId) {
        Category category=this.categoryRepository.findById(categoryId)
                .orElseThrow(()->new CategoryNotFoundException(categoryId));
        Manufacturer manufacturer=this.manufacturerRepository.findById(manufacturerId)
                .orElseThrow(()->new ManufacturerNotFoundException(manufacturerId));
        return Optional.of(this.productRepository.save(new Product(name,price,quantity,category,manufacturer)));
    }

    @Override
    public void deleteById(Long id) {
        this.productRepository.deleteById(id);
    }
}

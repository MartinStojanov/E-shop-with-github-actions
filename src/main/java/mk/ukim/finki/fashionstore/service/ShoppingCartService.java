package mk.ukim.finki.fashionstore.service;

import mk.ukim.finki.fashionstore.model.Product;
import mk.ukim.finki.fashionstore.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);
    ShoppingCart getActiveShoppingCart(String username);
    ShoppingCart addProductToShoppingCart(String username, Long productId);

}

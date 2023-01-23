package mk.ukim.finki.wbaudi.service;

import mk.ukim.finki.wbaudi.model.Product;
import mk.ukim.finki.wbaudi.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);
    ShoppingCart getActiveShoppingCart(String username);
    ShoppingCart addProductToShoppingCart(String username, Long productId);

}

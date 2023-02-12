package mk.ukim.finki.fashionstore.service;

import mk.ukim.finki.fashionstore.model.User;

public interface AuthService {
    User login(String username, String password);


}

package mk.ukim.finki.wbaudi.service;

import mk.ukim.finki.wbaudi.model.User;

public interface AuthService {
    User login(String username, String password);


}

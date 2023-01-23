package mk.ukim.finki.wbaudi.service;

import mk.ukim.finki.wbaudi.model.Role;
import mk.ukim.finki.wbaudi.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}

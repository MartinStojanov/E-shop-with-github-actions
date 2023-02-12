package mk.ukim.finki.fashionstore.service.impl;

import mk.ukim.finki.fashionstore.repsitory.jpa.UserRepository;
import mk.ukim.finki.fashionstore.model.User;
import mk.ukim.finki.fashionstore.model.exceptions.InvalidArgumentsException;
import mk.ukim.finki.fashionstore.model.exceptions.InvalidUserCredentialsException;
import mk.ukim.finki.fashionstore.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCredentialsException::new);
    }



}

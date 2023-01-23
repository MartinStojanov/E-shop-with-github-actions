package mk.ukim.finki.wbaudi.service.impl;

import mk.ukim.finki.wbaudi.model.User;
import mk.ukim.finki.wbaudi.model.exceptions.InvalidArgumentsException;
import mk.ukim.finki.wbaudi.model.exceptions.InvalidUserCredentialsException;
import mk.ukim.finki.wbaudi.model.exceptions.PasswordsDoNotMatchException;
import mk.ukim.finki.wbaudi.model.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.wbaudi.repsitory.impl.InMemoryUserRepository;
import mk.ukim.finki.wbaudi.repsitory.jpa.UserRepository;
import mk.ukim.finki.wbaudi.service.AuthService;
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

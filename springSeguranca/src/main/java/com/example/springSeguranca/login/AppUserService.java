package com.example.springSeguranca.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public AppUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {//vai fazer a busca no banco de dados
        return userRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("User not found"));
        //busco por email e caso aconteça algum erro ele instancia uma mensagem de erro indicando essa informação para o usuario

    }
}

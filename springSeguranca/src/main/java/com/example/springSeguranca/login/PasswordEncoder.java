package com.example.springSeguranca.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder {//essa classe é de configuração

    @Bean //estou dizendo que esse método da classe terá que ser executado logo no começo da aplicação
    //pois eu preciso do Encoder logo no começo antes de acessar o meu sistema
    //porque quando eu mandar meu usuario ele vai pegar o Encoder para verificar se a senha
    //é a mesma que está salva no banco de dados
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

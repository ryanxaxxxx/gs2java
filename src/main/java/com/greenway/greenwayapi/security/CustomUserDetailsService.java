package com.greenway.greenwayapi.security;

import com.greenway.greenwayapi.entity.User;
import com.greenway.greenwayapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User usuario =
                userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email));

        UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(usuario.getEmail());
        builder.password(usuario.getPassword());
        builder.roles(usuario.getRole()); 

        return builder.build();
    }
}


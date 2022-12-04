package com.isfortech.Servieses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.isfortech.Repositories.LoginRepository;
import com.isfortech.Models.LoginModel;

@Service
public class LoginService implements UserDetailsService {
    @Autowired
    private LoginRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginModel us = repo.findByNombre(username);

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));

        UserDetails userDet = new User(us.getNombre(), us.getClave(),roles);

        return userDet;

    }
}

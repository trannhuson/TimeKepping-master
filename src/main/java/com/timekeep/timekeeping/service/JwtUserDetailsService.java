package com.timekeep.timekeeping.service;

import com.timekeep.timekeeping.entity.Admin;
import com.timekeep.timekeeping.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    AdminRepository adminRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Optional<Admin> adminOptional = adminRepository.findByUsernameContaining(username);
        //final Admin admin = adminOptional.get();

        if ("admin".equals(username)) {
            return new User("admin", "$2y$12$ErhDxG5Rtvmp49voQvY4TOIoDPnWPjIrcvPLwrqY9dFVCyhSI3wb2",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}

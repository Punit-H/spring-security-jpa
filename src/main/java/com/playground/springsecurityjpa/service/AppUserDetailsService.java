package com.playground.springsecurityjpa.service;

import com.playground.springsecurityjpa.model.AppUserDetail;
import com.playground.springsecurityjpa.model.User;
import com.playground.springsecurityjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Configuration
@Service
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> byUserName = userRepository.findByUserName(userName);
        User user = byUserName.orElseThrow(() -> new UsernameNotFoundException(" Not found " + userName));
        if(user==null){

        }else[]
        return byUserName.map(AppUserDetail::new).get();
    }
}

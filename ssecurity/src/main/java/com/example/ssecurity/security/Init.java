package com.example.ssecurity.security;

import com.example.ssecurity.security.domain.Authority;
import com.example.ssecurity.security.domain.Role;
import com.example.ssecurity.security.domain.User;
import com.example.ssecurity.security.repository.AuthorityRepository;
import com.example.ssecurity.security.repository.RoleRepository;
import com.example.ssecurity.security.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @author tao
 */
@Component
@AllArgsConstructor
public class Init implements CommandLineRunner {
    private UserService userService;
    private AuthorityRepository authorityRepository;
    private RoleRepository roleRepository;

    @Override
    public void run(String... strings) throws Exception {

        //权限
        Authority authority = new Authority();
        authority.setName("查询");
        authority.setValue("query");
        authorityRepository.save(authority);

        //角色
        Role admin = new Role();
        admin.setName("管理员");
        admin.setValue("ROLE_ADMIN");
        admin.setAuthorities(Collections.singleton(authorityRepository.findById(1L).get()));
        roleRepository.save(admin);

        Role role = new Role();
        role.setName("普通用户");
        role.setValue("ROLE_USER");
        roleRepository.save(role);


        //用户
        User fpf = new User();
        fpf.setUsername("fpf");
        fpf.setPassword("fpf");

        fpf.setRoles(Collections.singleton(roleRepository.findById(2L).get()));
        userService.createUser(fpf);

        User wl = new User();
        wl.setUsername("wl");
        wl.setPassword("wl");
        wl.setRoles(Collections.singleton(roleRepository.findById(3L).get()));
        userService.createUser(wl);


    }
}
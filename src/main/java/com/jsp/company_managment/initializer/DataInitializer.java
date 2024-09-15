package com.jsp.company_managment.initializer;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import com.jsp.company_managment.entity.Role;
import com.jsp.company_managment.entity.User;
import com.jsp.company_managment.repository.RoleRepository;
import com.jsp.company_managment.repository.UserRepository;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Component
public class DataInitializer {

    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Autowired
    public DataInitializer(PasswordEncoder passwordEncoder, RoleRepository roleRepository, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        // Initialize roles if they don't exist
        if (roleRepository.count() == 0) {
            Role adminRole = new Role();
            adminRole.setName("ROLE_ADMIN");

            Role salesRole = new Role();
            salesRole.setName("ROLE_SALES");

            Role accountantRole = new Role();
            accountantRole.setName("ROLE_ACCOUNTANT");

            Role hrRole = new Role();
            hrRole.setName("ROLE_HR");

            roleRepository.save(adminRole);
            roleRepository.save(salesRole);
            roleRepository.save(accountantRole);
            roleRepository.save(hrRole);
        }

        // Initialize users for each role
        if (userRepository.count() == 0) {
            // Admin user
            User adminUser = new User();
            adminUser.setUserName("admin");
            adminUser.setPassword(passwordEncoder.encode("admin123"));
            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(roleRepository.findByName("ROLE_ADMIN"));
            adminUser.setRoles(adminRoles);
            userRepository.save(adminUser);

            // Sales user
            User salesUser = new User();
            salesUser.setUserName("sales");
            salesUser.setPassword(passwordEncoder.encode("sales123"));
            Set<Role> salesRoles = new HashSet<>();
            salesRoles.add(roleRepository.findByName("ROLE_SALES"));
            salesUser.setRoles(salesRoles);
            userRepository.save(salesUser);

            // Accountant user
            User accountantUser = new User();
            accountantUser.setUserName("accountant");
            accountantUser.setPassword(passwordEncoder.encode("accountant123"));
            Set<Role> accountantRoles = new HashSet<>();
            accountantRoles.add(roleRepository.findByName("ROLE_ACCOUNTANT"));
            accountantUser.setRoles(accountantRoles);
            userRepository.save(accountantUser);

            // HR user
            User hrUser = new User();
            hrUser.setUserName("hr");
            hrUser.setPassword(passwordEncoder.encode("hr123"));
            Set<Role> hrRoles = new HashSet<>();
            hrRoles.add(roleRepository.findByName("ROLE_HR"));
            hrUser.setRoles(hrRoles);
            userRepository.save(hrUser);
        }
    }
}
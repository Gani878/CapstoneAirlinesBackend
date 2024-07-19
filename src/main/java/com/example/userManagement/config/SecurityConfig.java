package com.example.userManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

   
//<<<<<<< HEAD
//     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//       
//                http.csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                                .requestMatchers(HttpMethod.POST, "/api/user/signUp", "/api/user/login","/api/user/booking").permitAll()
//                                .requestMatchers(HttpMethod.GET, "/api/user/getBookingDetails/*").permitAll()
//                                .anyRequest().authenticated()
//                )
//                .formLogin(login -> login.disable()); // Disable default login form
//=======
	 @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http
                 .csrf(csrf -> csrf.disable())
                 .authorizeHttpRequests(auth -> auth
                                 .requestMatchers(HttpMethod.POST, "/api/user/signUp", "/api/user/login", "/api/user/query", "/api/user/checkin", "/api/user/booking").permitAll()
                                 .requestMatchers(HttpMethod.GET, "/api/user/getAllQueries", "/api/user/{userId}", "/api/user/getBookingDetails/*").permitAll()
                                 .anyRequest().authenticated()
                 )
                 .formLogin(login -> login.disable()); // Disable default login form
//>>>>>>> refs/heads/master
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

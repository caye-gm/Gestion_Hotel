package com.gestionHotel.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private final UserDetailsService userDetailsService;
	private final CustomSuccessHandler cSH;
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		
		http
			.authorizeRequests()
				.antMatchers("/css/**", "/js/**","/img/**","/Fragment/**","/h2-console/**").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/","/reserva","/usuarioEditar").hasRole("USER")
				.antMatchers("/login","/registro/**","/contacto").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				//.loginProcessingUrl("")
				.successHandler(cSH)
				.permitAll()
				.and()
			.logout()
				.logoutUrl("/logout")
				.permitAll();
		
		
		// h2
		http.csrf().disable();
		http.headers().frameOptions().disable();
		
		

	}

}


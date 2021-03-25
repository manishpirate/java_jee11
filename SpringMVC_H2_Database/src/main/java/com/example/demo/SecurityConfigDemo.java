package com.example.demo;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.dao.Reader;
import com.example.demo.dao.ReaderRepository;
import org.slf4j.Logger;



@Configuration
@EnableWebSecurity
public class SecurityConfigDemo extends WebSecurityConfigurerAdapter {

	
	@Autowired
	ReaderRepository readerRepository;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/")
			.permitAll()
			.antMatchers("/**").permitAll()
			
			.and()
			
			.formLogin().loginPage("/login").permitAll()
			.and()
			.logout().invalidateHttpSession(true)
			.logoutRequestMatcher( new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/logout-success").permitAll();
			//we are using in memory database h2. for that we need to disable csrf and frame options so that we can browse ir
			http.csrf().disable();
		    http.headers().frameOptions().disable();
	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(new UserDetailsService() {
			
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

				List<Reader> userDetailslist = readerRepository.findByUsername(username);
				return userDetailslist.get(0);
		
			}
		});
	}
	
	
	
}

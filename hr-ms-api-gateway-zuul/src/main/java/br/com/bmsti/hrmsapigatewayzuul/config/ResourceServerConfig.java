package br.com.bmsti.hrmsapigatewayzuul.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private static final String ROLE_ADMIN = "ADMIN";
    private static final String ROLE_OPERETOR = "OPERETOR";
    private static final String[] PUBLIC = { "/hr-ms-oauth/oauth/token" };
    private static final String[] OPERETOR = { "/hr-ms-worker/**" };
    private static final String[] ADMIN = {
            "/hr-ms-payroll/**",
            "/hr-ms-user/**",
            "/actuator/**",
            "/hr-ms-worker/actuator/**",
            "/hr-ms-oauth/actuator/**" };

    @Autowired
    private JwtTokenStore tokenStore;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(tokenStore);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(PUBLIC).permitAll()
                .antMatchers(HttpMethod.GET, OPERETOR).hasAnyRole(ROLE_OPERETOR, ROLE_ADMIN)
                .antMatchers(ADMIN).hasRole(ROLE_ADMIN)
                .anyRequest().authenticated();
    }
}

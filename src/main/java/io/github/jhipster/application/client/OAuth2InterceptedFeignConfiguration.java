package io.github.jhipster.application.client;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

import io.github.jhipster.application.security.oauth2.AuthorizationHeaderUtil;

@Configuration
public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) throws IOException {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}

package com.ssafy.flody.config;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends GenericFilterBean {
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        //헤더에서 jwt 받아오기
        String token = jwtTokenProvider.resolveToken((HttpServletRequest) request);

        //유효성 검증
        if (token != null && jwtTokenProvider.validateToken(token)){
            //유효하면 토큰으로부터 유저 정보를 받아오기
            Authentication authentication = jwtTokenProvider.getAuthentication(token);
            // securityContext에 Authentication 객체 저장
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        chain.doFilter(request,response);
    }

}

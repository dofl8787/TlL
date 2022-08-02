package com.ssafy.flody.config;

import com.ssafy.flody.service.users.UsersService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Date;

@RequiredArgsConstructor
@Component
public class JwtTokenProvider {
    private String SALT = "projectSSAFY";

    private long tokenValidTime = 30 * 60 * 1000L;

    @Lazy
    private final UsersService usersService;

    @PostConstruct
    protected void init(){
        SALT = Base64.getEncoder().encodeToString(SALT.getBytes());
    }

    public String createToken(String userId){
        Claims claims = Jwts.claims().setSubject(userId);
        //claims.put("roles",roles);
        Date now = new Date();
        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime() + tokenValidTime))
                .signWith(SignatureAlgorithm.HS256, SALT)

                .compact();
    }

    //인증 정보 조회
    public Authentication getAuthentication(String token){ //response token
        UserDetails userDetails = usersService.loadUserByUserid(this.getUserPk(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    //토큰에서 회원 정보 추출
    public String getUserPk(String token){
        return Jwts.parser().setSigningKey(SALT).parseClaimsJwt(token).getBody().getSubject();
    }

    //헤더에서 토큰 값 가져오기
    public String resolveToken(HttpServletRequest request){
        return request.getHeader("X-AUTH-TOKEN");
    }

    //유효성 + 만료일자 확인
    public boolean validateToken(String jwtToken){
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(SALT).parseClaimsJws(jwtToken);
            return !claims.getBody().getExpiration().before(new Date());
        } catch (Exception e){
            return false;
        }
    }
}

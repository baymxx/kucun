//package com.bmx.kucun.utils;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//
//import java.security.Key;
//import java.util.Date;
//import java.util.HashMap;
//
///**
// * @Author: code generator
// * @Date: 2022/5/11
// */
//public class JwtTokenUtils {
//
//    public static final String TOKEN_HEADER = "Authorization";
//    public static final String TOKEN_PREFIX = "Bearer ";
//
//    private static final String SECRET = "ZmQ0ZGI5NjQ0MDQwY2I4MjMxY2Y3ZmI3MjdhN2ZmMjNhODViOTg1ZGE0NTBjMGM4NDA5NzYxMjdjOWMwYWRmZTBlZjlhNGY3ZTg4Y2U3YTE1ODVkZDU5Y2Y3OGYwZWE1NzUzNWQ2YjFjZDc0NGMxZWU2MmQ3MjY1NzJmNTE0MzI=";
//    private static final String ISS = "echisan";
//
//    // 过期时间是3600秒，既是1个小时
//    private static final long EXPIRATION = 3600L;
//
//    // 选择了记住我之后的过期时间为7天
//    private static final long EXPIRATION_REMEMBER = 604800L;
//
//    // 添加角色的key
//    private static final String ROLE_CLAIMS = "rol";
//
//    // 创建token
//    public static String createToken(String username, String permission, boolean isRememberMe) {
////        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
////        Key key = Keys.hmacShaKeyFor(keyBytes);
////
////        long expiration = isRememberMe ? EXPIRATION_REMEMBER : EXPIRATION;
//        HashMap<String, Object> map = new HashMap<>();
////        map.put(ROLE_CLAIMS, permission);
//        return Jwts.builder()
//                .signWith(key, SignatureAlgorithm.HS512)
//                // 这里要早set一点，放到后面会覆盖别的字段
//                .setClaims(map)
//                .setIssuer(ISS)
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + expiration * 1000))
//                .compact();
//    }
//
//    // 从token中获取用户名
//    public static String getUsername(String token) {
//        return getTokenBody(token).getSubject();
//    }
//
//    // 是否已过期
//    public static boolean isExpiration(String token) {
//        return getTokenBody(token).getExpiration().before(new Date());
//    }
//
//    private static Claims getTokenBody(String token) {
//        return Jwts.parser()
//                .setSigningKey(SECRET)
//                .parseClaimsJws(token)
//                .getBody();
//    }
//
//    public static String getUserPermission(String token) {
//        return (String) getTokenBody(token).get(ROLE_CLAIMS);
//    }
//}
//
//

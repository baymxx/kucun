package com.bmx.kucun.utils;

import com.alibaba.fastjson.JSON;
import com.bmx.kucun.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: code generator
 * @Date: 2022/5/11
 */
public class JwtUtils {
    private static final String jwtClaimKey="userJson";
    private static final String jwtSecretKey="bmxxx";

    /**
     * 生成jwt的token串
     * @param user
     * @return
     */
    public static String createJwtToken(User user)
    {
        HashMap<String,Object> claims=new HashMap<>();
        String userStr =JSON.toJSONString(user);
        claims.put(jwtClaimKey,userStr);
        claims.put("role",user.getAuthorities());
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,30);//30天过期
        return Jwts.builder()
                .setClaims(claims)//设置载荷部分
                .setSubject(user.getUsername())
                .setExpiration(calendar.getTime())//设置过期时间
                .signWith(SignatureAlgorithm.HS512, jwtSecretKey)//设置加密算法
                .compact();
    }



    public static String getJwtUsername(String token){
        Claims claims = Jwts.parser().setSigningKey(jwtSecretKey).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

    public static List<String> getJwtRoles(String token){
        Claims claims = Jwts.parser().setSigningKey(jwtSecretKey).parseClaimsJws(token).getBody();
        return claims.get("role",List.class);
    }
    /**
     * 从jwttoken串中获取载荷值
     * @param tokenStr
     * @return
     */
    public static User getJwtTokenClaimValue(String tokenStr)
    {
        User result=null;
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtSecretKey)
                    .parseClaimsJws(tokenStr)
                    .getBody();

            if(claims.getExpiration().compareTo(Calendar.getInstance().getTime())>0)
            {
                //token未过期
                String userStr = claims.get(jwtClaimKey ,String.class);
                result = JSON.parseObject(userStr,User.class);

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return result;
    }


}

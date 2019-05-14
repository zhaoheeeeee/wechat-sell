package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.redis.core.RedisTemplate;

import java.math.BigDecimal;


@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

    public static void main(String[] args) {
        RedisTemplate redisTemplate=new RedisTemplate();
        redisTemplate.opsForValue().set();
    }
    
}

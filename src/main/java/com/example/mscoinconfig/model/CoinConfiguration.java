package com.example.mscoinconfig.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RedisHash("coin-configuration")
@Data
@NoArgsConstructor
public class CoinConfiguration {
    @Id
    private String id;
    private String coinName;
    private BigDecimal purchasePrice;
    private BigDecimal salePrice;
    private Double availableCoins;
    private Double soldCoins;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

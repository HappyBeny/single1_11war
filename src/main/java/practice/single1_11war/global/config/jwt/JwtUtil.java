package practice.single1_11war.global.config.jwt;

import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Slf4j(topic = "JwtUtil")
@Component
@RequiredArgsConstructor
public class JwtUtil {
    private static final String BEARER_PREFIX = "Bearer ";
    private final JwtProperties jwtProperties;

    private long tokenExpiryMs;
    private SecretKey key;

    @PostConstruct
    public void init() {
        String secret = jwtProperties.getSecret();
        if (secret == null) throw new IllegalStateException("JWT secret must not be null");

        byte[] keyBytes = secret.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        if (keyBytes.length < 32) throw new IllegalStateException("JWT secret must be >= 32 bytes");

        this.key = Keys.hmacShaKeyFor(keyBytes);
        long ms = jwtProperties.getTokenTime();

        if (ms <= 0) throw new IllegalStateException("JWT tokenTime(ms) must be > 0");
        this.tokenExpiryMs = ms;
    }
}

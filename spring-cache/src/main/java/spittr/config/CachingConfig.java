package spittr.config;

import net.sf.ehcache.CacheManager;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@EnableCaching
public class CachingConfig {

  @Bean
  public EhCacheCacheManager cacheManager(CacheManager cm) {
    return new EhCacheCacheManager(cm);
  }

  @Bean
  public EhCacheManagerFactoryBean ehcache() {
    EhCacheManagerFactoryBean ehCacheFactoryBean = 
        new EhCacheManagerFactoryBean();
    ehCacheFactoryBean.setConfigLocation(
        new ClassPathResource("spittr/cache/ehcache.xml"));
    return ehCacheFactoryBean;
  }

//  public CacheManager getCacheManager(RedisTemplate redisTemplate){
//    return new RedisCacheManager(redisTemplate);
//  }
//
//  public JedisConnectionFactory jedisConnectionFactory(){
//    JedisConnectionFactory jedisConnectionFactory =
//            new JedisConnectionFactory();
//    jedisConnectionFactory.afterPropertiesSet();
//    return jedisConnectionFactory;
//  }
//
//  public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory redisConnectionFactory){
//
//    RedisTemplate<String,String> redisTemplate =
//            new RedisTemplate<String, String>();
//    redisTemplate.setConnectionFactory(redisConnectionFactory);
//    redisTemplate.afterPropertiesSet();
//    return redisTemplate;
//  }
  
}

package pers.yan.jimao.minio.spring.boot.starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@code @Name:} MinioProperties
 * {@code @Description: } minio配置类
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2022/11/15 - 周二
 */
@Data
@ConfigurationProperties(prefix = "jimao-mall.minio")
public class MinioProperties {
    private String endpoint;
    private String fileHost;
    private String bucket;
    private String accessKey;
    private String secretKey;
}

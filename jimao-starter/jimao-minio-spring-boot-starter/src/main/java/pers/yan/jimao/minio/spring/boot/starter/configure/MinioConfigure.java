package pers.yan.jimao.minio.spring.boot.starter.configure;


import io.minio.MinioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.yan.jimao.minio.spring.boot.starter.properties.MinioProperties;

/**
 * {@code @Name:} MinioConfigure
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2022/11/15 - 周二
 */
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(MinioProperties.class)
public class MinioConfigure {

    private final MinioProperties minioProperties;

    /**
     * 初始化客户端
     *
     * @return 客户端
     */
    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(minioProperties.getEndpoint())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
    }
}

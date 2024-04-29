package pers.yan.jimao.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableCaching
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("pers.yan.jimao.**.mapper")
@ComponentScans({
        @ComponentScan("pers.yan.jimao.**.service.**"),
        @ComponentScan("pers.yan.jimao.**.controller"),
})
public class JimaoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JimaoAdminApplication.class, args);
    }

}

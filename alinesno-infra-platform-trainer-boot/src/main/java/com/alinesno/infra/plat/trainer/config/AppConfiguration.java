package com.alinesno.infra.plat.trainer.config;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import jakarta.servlet.MultipartConfigElement;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.unit.DataSize;

@EnableScheduling
@EnableActable
@EnableInfraSsoApi
@MapperScan("com.alinesno.infra.plat.trainer.mapper")
@Configuration
public class AppConfiguration {

    /**
     * 配置上传文件大小
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {

        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofMegabytes(100));
        factory.setMaxRequestSize(DataSize.ofMegabytes(100));

        return factory.createMultipartConfig();
    }
}

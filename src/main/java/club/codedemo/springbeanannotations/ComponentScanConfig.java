package club.codedemo.springbeanannotations;

import club.codedemo.OutClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

/**
 * 2. 扫描组件
 * 7. @Configuration 注解
 * club.codedemo.outpackage并不属于当前Spring Boot项目所在包或其子包
 * 所以如果想实现：当项目启动时，自动扫描club.codedemo.outpackage包中的bean
 * 则需要使用 @ComponentScan 来实现。
 * 同理OutClass.class所有的包同样不属于当前Spring Boot项目所在包或其子包
 * 也需要使用 @ComponentScan 实现。
 */
@Configuration
//@ComponentScan(basePackages = "club.codedemo.outpackage")
//@ComponentScan(basePackageClasses = OutClass.class)
@ComponentScans({
        @ComponentScan(basePackages = "club.codedemo.outpackage"),
        @ComponentScan(basePackageClasses = OutClass.class)
})
public class ComponentScanConfig {
    /**
     * 4. Repository注解
     * 声明PersistenceExceptionTranslationPostProcessor bean以启用@Repository的异常转换
     * @return
     */
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}

package club.codedemo.springbeanannotations;

import club.codedemo.OutClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

@Configuration
//@ComponentScan(basePackages = "club.codedemo.outpackage")
//@ComponentScan(basePackageClasses = OutClass.class)
@ComponentScans({
        @ComponentScan(basePackages = "club.codedemo.outpackage"),
        @ComponentScan(basePackageClasses = OutClass.class)
})
public class ComponentScanConfig {
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}

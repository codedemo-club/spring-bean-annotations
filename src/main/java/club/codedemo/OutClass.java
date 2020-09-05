package club.codedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutClass {
    @Bean
    TeacherService teacherService() {
        return new TeacherService() {
        };
    }
}

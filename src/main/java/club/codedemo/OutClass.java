package club.codedemo;

import org.springframework.context.annotation.Bean;

public class OutClass {
    @Bean
    TeacherService teacherService() {
        return new TeacherService() {
        };
    }
}

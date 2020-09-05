package club.codedemo.springbeanannotations.repository;

import org.hibernate.NonUniqueResultException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void findAll() {
        boolean catchException = false;
        try {
            this.studentRepository.findAll();
        } catch (Exception e) {
            catchException = true;
            assertTrue(e instanceof IncorrectResultSizeDataAccessException);
            assertTrue(e instanceof DataAccessException);
            assertFalse(e instanceof NonUniqueResultException);
        } finally {
            assertTrue(catchException);
        }
    }

    @Test
    void deleteAll() throws InterruptedException {
        this.studentRepository.deleteAll();
    }
}
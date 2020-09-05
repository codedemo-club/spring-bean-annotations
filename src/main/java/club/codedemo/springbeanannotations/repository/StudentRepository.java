package club.codedemo.springbeanannotations.repository;

import org.hibernate.NonUniqueResultException;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public void findAll() {
        throw new NonUniqueResultException(2);
    }

    public void deleteAll() throws InterruptedException {
        Thread.sleep(1000);
    }
}

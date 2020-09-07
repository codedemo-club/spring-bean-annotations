package club.codedemo.springbeanannotations.repository;

import org.hibernate.NonUniqueResultException;
import org.springframework.stereotype.Repository;

/**
 * 4. Repository注解
 */
@Repository
public class StudentRepository {
    /**
     * 4.  Repository注解 异常转换
     * 当调用findAll方法是，将会抛出继承于DataAccessException的异常。
     * 而此方法中的NonUniqueResultException将会被包装起来
     * 详情请参考本类对应的单元测试文件
     */
    public void findAll() {
        throw new NonUniqueResultException(2);
    }

    /**
     * 模拟数据操作延迟
     *
     * @throws InterruptedException
     */
    public void deleteAll() throws InterruptedException {
        Thread.sleep(1000);
    }
}

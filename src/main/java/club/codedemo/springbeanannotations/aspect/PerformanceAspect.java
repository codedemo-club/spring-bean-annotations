package club.codedemo.springbeanannotations.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class PerformanceAspect {

    @Pointcut("within(@org.springframework.stereotype.Repository *)")
    public void repositoryClassMethods() {}

    @Around("repositoryClassMethods()")
    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取切点方法执行的起始、结束时间
        long start = System.nanoTime();
        Object returnValue = joinPoint.proceed();
        long end = System.nanoTime();

        // 获取切点方法的类名、方法名并打印执行时间
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Long costTime = TimeUnit.NANOSECONDS.toMillis(end - start);
        System.out.println("执行:" + className + "->" + methodName +
                "耗时：" + costTime  + "ms");

        if (costTime > 1000) {
            // 耗时大于1秒的认为是慢查询，根据实际情况进行后续操作
            // 比如可以实时的短信预警、钉钉预警、邮件预警、推送到日志服务器等
        }

        return returnValue;
    }
}

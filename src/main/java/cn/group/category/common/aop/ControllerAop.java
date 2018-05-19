package cn.group.category.common.aop;

import cn.group.category.common.beans.ResultBean;
import cn.group.category.common.exceptions.CheckException;
import cn.group.category.common.exceptions.UnloginException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author lxd
 * @date 2018/3/21
 */
@Component
@Aspect
public class ControllerAop {

    private static final Logger logger = LoggerFactory.getLogger(ControllerAop.class);

    @Around("execution(public cn.group.category.common.beans.ResultBean *(..))")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
        long startTime = System.currentTimeMillis();
        ResultBean<?> result = null;
        try {
            result = (ResultBean<?>) pjp.proceed();
            logger.info("{} use time: {}", pjp.getSignature(), System.currentTimeMillis() - startTime);
        } catch (Throwable e) {
            result = handleException(pjp, e);
        }
        return result;
    }

    private ResultBean<?> handleException(ProceedingJoinPoint pjp, Throwable e) {
        ResultBean<?> result = new ResultBean<>();
        if (e instanceof CheckException) {
            result.setMsg(e.getLocalizedMessage());
            result.setCode(ResultBean.FAIL);
        } else if (e instanceof UnloginException) {
            result.setMsg("Unlogin");
            result.setCode(ResultBean.NO_LOGIN);
        } else {
            logger.error(pjp.getSignature() + " error ", e);

            //TODO 未知的异常，应该格外注意，可以发送邮件通知等
            result.setMsg(e.toString());
            result.setCode(ResultBean.FAIL);
        }
        return result;
    }
}

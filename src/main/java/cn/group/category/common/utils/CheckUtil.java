package cn.group.category.common.utils;

import cn.group.category.common.exceptions.CheckException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

/**
 *
 * @author lxd
 * @date 2018/3/21
 */
public class CheckUtil {
    private static final Logger logger = LoggerFactory.getLogger(CheckUtil.class);

    private static MessageSource resources;

    public static void setResources(MessageSource resources) {
        CheckUtil.resources = resources;
    }

    public static void check(boolean condition, String msgKey, Object... args) {
        if (!condition) {
            fail(msgKey, args);
        }
    }

    public static void notEmpty(String str, String msgKey, Object... args) {
        if (str == null || str.isEmpty()) {
            fail(msgKey, args);
        }
    }

    public static void notNull(Object obj, String msgKey, Object... args) {
        if (obj == null) {
            fail(msgKey, args);
        }
    }


    public static void fail(String msgKey, Object... args) {
        logger.error("error. message: " + msgKey + ", args: " + args);
        throw new CheckException(resources.getMessage(msgKey, args, UserUtil.getLocale()));
    }
}

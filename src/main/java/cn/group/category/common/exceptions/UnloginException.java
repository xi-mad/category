package cn.group.category.common.exceptions;

/**
 *
 * @author lxd
 * @date 2018/3/21
 */
public class UnloginException extends RuntimeException {
    public UnloginException() {
    }

    public UnloginException(String message) {
        super(message);
    }

    public UnloginException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnloginException(Throwable cause) {
        super(cause);
    }

    public UnloginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

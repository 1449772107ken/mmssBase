/*
  2022-06-14
 */

package tech.mmss.entity;

/**
 * 结果码
 */
public class StatusCode {
    // 成功
    public static final int OK = 20000;
    // 失败
    public static final int ERROR = 20001;
    // 用户名或密码错误
    public static final int LOGIN_ERROR = 20002;
    // 权限不足
    public static final int ACCESS_ERROR = 20003;
    // 远程调用失败
    public static final int REMOTE_ERROR = 20004;
    // 重复操作
    public static final int REP_ERROR = 20005;
    // 暂未登录或token已经过期
    public static final int UNAUTHORIZED = 20006;
}

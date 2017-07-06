package com.damifan.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @email wanglei59@jd.com
 * @create 2017/7/6 11:11
 */
public class MyZuulFilter extends ZuulFilter {

    /**
     * filterType :filter类型,分为以下几种
     * pre:请求执行之前filter
     * route: 处理请求，进行路由
     * post: 请求处理完成后执行的filter
     * error:出现错误时执行的filter
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder:filter执行顺序，通过数字指定
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter:filter是否需要执行 true执行 false 不执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * run : filter具体逻辑
     *
     * @return
     */
    @Override
    public Object run() {
        return null;
    }
}

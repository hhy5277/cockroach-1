package com.zhangyingwei.cockroach.http;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by zhangyw on 2017/8/11.
 */
public interface IHttpProxy {

    /**
     * 随机获取一个代理
     * @return
     */
    public ProxyTuple randomProxy();

    /**
     * 如果代理失效，从代理池中删除代理
     *
     * @param proxy
     */
    public void disable(ProxyTuple proxy);

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty();
}

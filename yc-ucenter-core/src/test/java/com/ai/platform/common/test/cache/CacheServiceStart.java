package com.ai.platform.common.test.cache;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ai.opt.sdk.cache.base.AbstractCache;


public final class CacheServiceStart {

    private static final Logger LOG = LogManager.getLogger(CacheServiceStart.class);

    private static final String PATH = "classpath:context/core-context.xml";
    private CacheServiceStart(){}
    public static void main(String[] args) {
        LOG.info("开始刷新缓存......");
        @SuppressWarnings("resource")
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { PATH });
        context.start();
        Map<String, AbstractCache> caches = context
                .getBeansOfType(AbstractCache.class);
        for (AbstractCache cache : caches.values()) {

           

        }
        // 刷新缓存结束，需要提示
        LOG.info("缓存刷新结束,请通过日志查看是否刷新成功.....");
    }
}

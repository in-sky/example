package io.ymq.redis.test;

import io.ymq.redis.jedis.JedisClusterUtils;
import io.ymq.redis.jedis.JedisSentinelUtils;
import io.ymq.redis.jedis.utils.CacheUtils;
import org.junit.Test;

/**
 * 描述: redis 工具类测试
 * author: yanpenglei
 * Date: 2017/10/13 17:50
 */
public class BaseTest {

    /**
     * java JedisCluster 操作 redis 集群
     */
    @Test
    public void clusterTest() {

        JedisClusterUtils.saveString("cluster-key", "www.ymq.io");

        System.out.println(JedisClusterUtils.getString("cluster-key"));

    }

    /**
     * java Jedis 操作 redis 单实例
     */
    @Test
    public void sentineTest() {

        JedisSentinelUtils.saveString("sentine-key", "www.ymq.io");

        System.out.println(JedisSentinelUtils.getString("sentine-key"));

    }

    /**
     * cacheUtils 操作 redis 集群
     */
    @Test
    public void cacheUtilsTest() {

        CacheUtils.saveString("cluster-key2", "www.ymq.io2");

        System.out.println(CacheUtils.getString("cluster-key2"));

    }


}

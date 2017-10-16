package test;

import cn.e3mall.common.jedis.JedisClient;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

/** 
* JedisTest Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 14, 2017</pre> 
* @version 1.0 
*/ 
public class JedisTestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: testJedis() 
* 
*/ 
@Test
public void testTestJedis() throws Exception {
//    //创建一个连接Jedis对象，参数：host、port
//    Jedis jedis = new Jedis("192.168.25.128", 6379);
//    //直接使用jedis操作redis。所有jedis的命令都对应一个方法。
//    jedis.set("test123", "my first jedis test");
//    String string = jedis.get("test123");
//    System.out.println(string);
//    //关闭连接
//    jedis.close();
    //初始化spring容器
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
    //从容器中获得JedisClient对象
    JedisClient jedisClient = applicationContext.getBean(JedisClient.class);
    jedisClient.set("mytest", "jedisClient");
    String string = jedisClient.get("mytest");
    System.out.println(string);

} 

/** 
* 
* Method: testJedisPool() 
* 
*/ 
@Test
public void testTestJedisPool() throws Exception {
//    //创建一个连接池对象，两个参数host、port
//    JedisPool jedisPool = new JedisPool("192.168.25.128", 6379);
//    //从连接池获得一个连接，就是一个jedis对象。
//    Jedis jedis = jedisPool.getResource();
//    //使用jedis操作redis
//    String string = jedis.get("test123");
//    System.out.println(string);
//    //关闭连接，每次使用完毕后关闭连接。连接池回收资源。
//    jedis.close();
//    //关闭连接池。
//    jedisPool.close();
} 

/** 
* 
* Method: testJedisCluster() 
* 
*/ 
@Test
public void testTestJedisCluster() throws Exception {
//    //创建一个JedisCluster对象。有一个参数nodes是一个set类型。set中包含若干个HostAndPort对象。
//    Set<HostAndPort> nodes = new HashSet<>();
//    nodes.add(new HostAndPort("192.168.25.128", 7021));
//    nodes.add(new HostAndPort("192.168.25.128", 7022));
//    nodes.add(new HostAndPort("192.168.25.128", 7023));
//    nodes.add(new HostAndPort("192.168.25.128", 7024));
//    nodes.add(new HostAndPort("192.168.25.128", 7025));
//    nodes.add(new HostAndPort("192.168.25.128", 7026));
//    JedisCluster jedisCluster = new JedisCluster(nodes);
//    //直接使用JedisCluster对象操作redis。
//    jedisCluster.set("test", "123");
//    String string = jedisCluster.get("test");
//    System.out.println(string);
//    //关闭JedisCluster对象
//    jedisCluster.close();
} 


} 

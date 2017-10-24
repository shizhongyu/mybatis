package test.cn.e3mall.search; 

import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* TestSolrCloud Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 17, 2017</pre> 
* @version 1.0 
*/ 
public class TestSolrCloudTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: testAddDocument() 
* 
*/ 
@Test
public void testTestAddDocument() throws Exception { 
//TODO: Test goes here... 、
    //创建一个集群的连接，应该使用CloudSolrServer创建。
    CloudSolrServer solrServer = new CloudSolrServer("192.168.25.129:2181,192.168.25.129:2182,192.168.25.129:2183");
    //zkHost：zookeeper的地址列表
    //设置一个defaultCollection属性。
    solrServer.setDefaultCollection("collection2");
    //创建一个文档对象
    SolrInputDocument document = new SolrInputDocument();
    //向文档中添加域
    document.setField("id", "solrcloud01");
    document.setField("item_title", "测试商品01");
    document.setField("item_price", 123);
    //把文件写入索引库
    solrServer.add(document);
    //提交
    solrServer.commit();
} 

/** 
* 
* Method: testQueryDocument() 
* 
*/ 
@Test
public void testTestQueryDocument() throws Exception { 
//TODO: Test goes here... 
} 


} 

package com.example.autotestdemo.cases;

import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.jar.JarEntry;

@SpringBootTest
public class UserTest extends AbstractTestNGSpringContextTests {
    @Test
    public void testAddUser() throws IOException {
        //组装参数
        HttpPost post=new HttpPost("http://localhost:8080/index/adduser");
        JSONObject param= new JSONObject();
        param.put("userName","lisi");
        param.put("passWord","123456");
        param.put("realName","李四");
        param.put("age",23);
        param.put("sex",1);
        System.out.println(param);
        post.setHeader("content-type","application/json");
        StringEntity entity = new StringEntity(param.toString(), "utf-8");
        post.setEntity(entity);
        System.out.println(entity);
        DefaultHttpClient defaultHttpClient =new DefaultHttpClient();
        HttpResponse response = defaultHttpClient.execute(post);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}

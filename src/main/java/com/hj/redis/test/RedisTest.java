package com.hj.redis.test;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class RedisTest {

    public static void main(String[] args) {
        //1.创建jedis对象
        Jedis jedis = new Jedis("192.168.170.129", 6379);//1.redis服务必须关闭防火墙  2.redis服务必须开启远程连接
        jedis.select(0);//选择操作的库默认0号库
        //2.执行相关操作
        Set<String> keys = jedis.keys("*");
        for (String str : keys){
            System.out.println(str);
        }
        //3.释放资源
        jedis.close();
    }


}

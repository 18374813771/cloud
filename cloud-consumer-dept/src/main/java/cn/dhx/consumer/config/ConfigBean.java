package cn.dhx.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //使用ribbon负载均衡，只定义这个就是使用ribbon默认的轮询算法
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean  //定义这个bean是使用ribbon的随机算法，不使用默认的
    public IRule myRule(){
        return  new RandomRule();
    }

}

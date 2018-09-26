package cn.dhx.consumer.Controller;

import cn.dhx.api.entity.Dept;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

/**
 * 消费者
 * */
@RestController
@RequestMapping("consumer/dept")
public class DeptController_Consumer {
//    private static final String REST_URL_PREFIX = "http://127.0.0.1:8081";
    private static final String REST_URL_PREFIX = "http://CLOUD-PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public void addDept(Dept dept) throws IOException {
//        Dept dept = new ObjectMapper().readValue(deptInfo,Dept.class);
        //调用服务提供者提供的restful服务 参数分别是url,
        restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Dept.class);
    }

    @GetMapping("/get/{id}")
    public Dept getDept(@PathVariable Integer id){
        return  restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping("/all/get")
    public List<Dept> getAllDept(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/all/get",List.class);
    }

}

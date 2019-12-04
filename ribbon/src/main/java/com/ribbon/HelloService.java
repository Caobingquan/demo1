package com.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author {曹炳全}
 * @Title HelloService
 * @Description
 * @date 2019/12/4 12:06
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://USER-SERVICE/hi?name="+name,String.class);
    }


}



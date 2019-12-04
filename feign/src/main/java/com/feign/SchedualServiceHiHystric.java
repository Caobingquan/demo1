package com.feign;

import org.springframework.stereotype.Component;

/**
 * @author {曹炳全}
 * @Title SchedualServiceHiHystric
 * @Description
 * @date 2019/12/4 14:59
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

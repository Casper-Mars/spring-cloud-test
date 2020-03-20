package org.r.learn.user.client;

import org.r.learn.user.client.impl.LabelClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @date 20-3-14 下午8:59
 **/
@FeignClient(name = "es-service",path = "/label",fallback = LabelClientImpl.class)
public interface LabelClient {


    @RequestMapping("/list")
    List<String> list();


}

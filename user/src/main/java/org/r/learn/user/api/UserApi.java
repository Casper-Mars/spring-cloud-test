package org.r.learn.user.api;

import org.r.learn.user.client.LabelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author casper
 * @date 20-3-14 下午9:07
 **/
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserApi {


    @Autowired
    private LabelClient labelClient;

    @Value("${ip}")
    private String ip;

    @GetMapping("/label")
    public List<String> getUserLabel() {
        List<String> list = labelClient.list();
        list.add("come from user");
        return list;
    }

    @GetMapping("/ip")
    public String getIp(){
        return ip;
    }

}

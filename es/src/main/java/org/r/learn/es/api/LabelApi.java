package org.r.learn.es.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author casper
 * @date 20-3-14 下午9:00
 **/
@RestController
@RequestMapping("/label")
public class LabelApi {


    @RequestMapping("/list")
    public List<String> list() {
        List<String> result = new ArrayList<>(2);
        result.add("测试");
        result.add("测试2");


        return result;
    }


}

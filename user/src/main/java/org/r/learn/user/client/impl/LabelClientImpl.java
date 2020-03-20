package org.r.learn.user.client.impl;

import org.r.learn.user.client.LabelClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author casper
 * @date 20-3-14 下午10:37
 **/
@Component
public class LabelClientImpl implements LabelClient {
    @Override
    public List<String> list() {
        List<String> result = new ArrayList<>(2);
        result.add("error");
        result.add("404");
        return result;
    }
}

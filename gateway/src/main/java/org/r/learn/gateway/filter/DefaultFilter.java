package org.r.learn.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author casper
 * @date 20-3-15 下午2:07
 **/
@Component
public class DefaultFilter extends ZuulFilter {


    private static final String TOKEN = "token";


    @Override
    public String filterType() {
        System.out.println("token pre filter");
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getHeader(TOKEN);
        if (!StringUtils.isEmpty(token)) {
            currentContext.addZuulRequestHeader(TOKEN, token);
        }
        return null;
    }
}

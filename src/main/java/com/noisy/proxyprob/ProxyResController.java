package com.noisy.proxyprob;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lei.X
 * @date 2019/4/26
 */

@Slf4j
@RestController
@RequestMapping("/test")
public class ProxyResController {

    @ResponseBody
    @GetMapping("/parse")
    public String parseRequest(HttpServletRequest request){

        String ipAddress = IpUtil.getIpAddr(request);
        log.info("IP DETECT: {} ",ipAddress);
        return  ipAddress;

    }
}
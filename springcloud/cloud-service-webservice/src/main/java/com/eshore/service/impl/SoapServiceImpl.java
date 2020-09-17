package com.eshore.service.impl;

import com.eshore.service.SoapService;
import org.springframework.stereotype.Component;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Wen Hao
 * @Date 2020/9/10 11:07
 */
@WebService(name = "SoapService", targetNamespace = "http://server.webservice.example.com",
        endpointInterface = "com.eshore.service.SoapService")
@Component
public class SoapServiceImpl implements SoapService {

    public String emrService(@WebParam(name = "data") String data) {
        if(null == data || "".equals(data.trim())){
            return "传入的参数为空";
        }
        return "调用成功";
    }
}

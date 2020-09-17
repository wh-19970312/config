package com.eshore.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Wen Hao
 * @Date 2020/9/10 11:04
 */
@WebService(name = "SoapService", targetNamespace = "http://server.webservice.example.com")
public interface SoapService {
    /**
     * 调用的方法
     * @param data
     * @return
     */
    @WebMethod
    @WebResult(name = "dataResult")
    String emrService(@WebParam(name = "data") String data);
}

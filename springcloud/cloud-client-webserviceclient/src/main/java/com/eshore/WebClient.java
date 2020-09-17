package com.eshore;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @author Wen Hao
 * @Date 2020/9/11 9:29
 */

public class WebClient {
    public static void main(String[] args) {
        JaxWsDynamicClientFactory clientFactory=JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://localhost:8001/services/ws/api?wsdl");
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            //这里注意如果是复杂参数的话，要保证复杂参数可以序列化
            objects = client.invoke("emrService", "hello world");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

    }
}

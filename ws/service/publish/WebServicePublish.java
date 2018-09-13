package ws.service.publish;

import ws.service.webserviceimpl.WebServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @author Aix
 * @Title:
 * @Package: ws.publish
 * @Description:
 * @date 2018/9/13 16:12
 * @Version:
 */
public class WebServicePublish {
    public static void main(String[] args) {
        //定义url
        String url = "http://127.0.0.1:8123/demo/webservice";
        //发布webservice
        Endpoint.publish(url,new WebServiceImpl());
        System.out.println("webService发布完成");
    }
}

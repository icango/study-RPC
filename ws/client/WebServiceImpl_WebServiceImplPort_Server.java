
package ws.client;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-09-13T16:44:52.559+08:00
 * Generated source version: 3.1.4
 * 
 */
 
public class WebServiceImpl_WebServiceImplPort_Server{

    protected WebServiceImpl_WebServiceImplPort_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new WebServiceImplPortImpl();
        String address = "http://127.0.0.1:8123/demo/webservice";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception {
        new WebServiceImpl_WebServiceImplPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}

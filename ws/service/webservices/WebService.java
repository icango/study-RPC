package ws.service.webservices;

import javax.jws.WebMethod;

/**
 * webService接口类
 * @author Aix
 * @Title:
 * @Package: ws
 * @Description:WebService服务器端
 * @date 2018/9/13 16:00
 * @Version:
 */
@javax.jws.WebService
public interface WebService {

    @WebMethod
    String printLog();

}

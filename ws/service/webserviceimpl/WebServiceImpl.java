package ws.service.webserviceimpl;

import ws.service.webservices.WebService;

/**
 * WebService接口实现类
 * @author Aix
 * @Title:
 * @Package: ws.webserviceimpl
 * @Description:WebServie服务端
 * @date 2018/9/13 16:09
 * @Version:
 */
@javax.jws.WebService
public class WebServiceImpl implements WebService{
    @Override
    public String printLog() {
        return "打印日志，哦吼吼吼";
    }
}

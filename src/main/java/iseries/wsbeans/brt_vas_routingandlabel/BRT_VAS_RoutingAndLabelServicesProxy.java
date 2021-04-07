package iseries.wsbeans.brt_vas_routingandlabel;

public class BRT_VAS_RoutingAndLabelServicesProxy implements iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServices {
  private String _endpoint = null;
  private iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServices bRT_VAS_RoutingAndLabelServices = null;
  
  public BRT_VAS_RoutingAndLabelServicesProxy() {
    _initBRT_VAS_RoutingAndLabelServicesProxy();
  }
  
  public BRT_VAS_RoutingAndLabelServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initBRT_VAS_RoutingAndLabelServicesProxy();
  }
  
  private void _initBRT_VAS_RoutingAndLabelServicesProxy() {
    try {
      bRT_VAS_RoutingAndLabelServices = (new iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelLocator()).getBRT_VAS_RoutingAndLabelServicesPort();
      if (bRT_VAS_RoutingAndLabelServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bRT_VAS_RoutingAndLabelServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bRT_VAS_RoutingAndLabelServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bRT_VAS_RoutingAndLabelServices != null)
      ((javax.xml.rpc.Stub)bRT_VAS_RoutingAndLabelServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServices getBRT_VAS_RoutingAndLabelServices() {
    if (bRT_VAS_RoutingAndLabelServices == null)
      _initBRT_VAS_RoutingAndLabelServicesProxy();
    return bRT_VAS_RoutingAndLabelServices;
  }
  
  public iseries.wsbeans.brt_vas_routingandlabel.BrtVASRoutingAndLabelResult brt_vas_routingandlabel(iseries.wsbeans.brt_vas_routingandlabel.BrtVASRoutingAndLabelInput arg0) throws java.rmi.RemoteException{
    if (bRT_VAS_RoutingAndLabelServices == null)
      _initBRT_VAS_RoutingAndLabelServicesProxy();
    return bRT_VAS_RoutingAndLabelServices.brt_vas_routingandlabel(arg0);
  }
  
  
}
package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class BRT_TrackingByBRTshipmentIDServicesProxy implements iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices {
  private String _endpoint = null;
  private iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices bRT_TrackingByBRTshipmentIDServices = null;
  
  public BRT_TrackingByBRTshipmentIDServicesProxy() {
    _initBRT_TrackingByBRTshipmentIDServicesProxy();
  }
  
  public BRT_TrackingByBRTshipmentIDServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initBRT_TrackingByBRTshipmentIDServicesProxy();
  }
  
  private void _initBRT_TrackingByBRTshipmentIDServicesProxy() {
    try {
      bRT_TrackingByBRTshipmentIDServices = (new iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDLocator()).getBRT_TrackingByBRTshipmentIDServicesPort();
      if (bRT_TrackingByBRTshipmentIDServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bRT_TrackingByBRTshipmentIDServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bRT_TrackingByBRTshipmentIDServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bRT_TrackingByBRTshipmentIDServices != null)
      ((javax.xml.rpc.Stub)bRT_TrackingByBRTshipmentIDServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices getBRT_TrackingByBRTshipmentIDServices() {
    if (bRT_TrackingByBRTshipmentIDServices == null)
      _initBRT_TrackingByBRTshipmentIDServicesProxy();
    return bRT_TrackingByBRTshipmentIDServices;
  }
  
  public iseries.wsbeans.brt_trackingbybrtshipmentid.BrtTRACKINGBYBRTSHIPMENTIDResult brt_trackingbybrtshipmentid(iseries.wsbeans.brt_trackingbybrtshipmentid.BrtTRACKINGBYBRTSHIPMENTIDInput arg0) throws java.rmi.RemoteException{
    if (bRT_TrackingByBRTshipmentIDServices == null)
      _initBRT_TrackingByBRTshipmentIDServicesProxy();
    return bRT_TrackingByBRTshipmentIDServices.brt_trackingbybrtshipmentid(arg0);
  }
  
  
}
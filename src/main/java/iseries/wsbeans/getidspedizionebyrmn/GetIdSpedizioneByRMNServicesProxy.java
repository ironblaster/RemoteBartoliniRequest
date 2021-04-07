package iseries.wsbeans.getidspedizionebyrmn;

public class GetIdSpedizioneByRMNServicesProxy implements iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices {
  private String _endpoint = null;
  private iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices getIdSpedizioneByRMNServices = null;
  
  public GetIdSpedizioneByRMNServicesProxy() {
    _initGetIdSpedizioneByRMNServicesProxy();
  }
  
  public GetIdSpedizioneByRMNServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetIdSpedizioneByRMNServicesProxy();
  }
  
  private void _initGetIdSpedizioneByRMNServicesProxy() {
    try {
      getIdSpedizioneByRMNServices = (new iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNLocator()).getGetIdSpedizioneByRMNServicesPort();
      if (getIdSpedizioneByRMNServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getIdSpedizioneByRMNServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getIdSpedizioneByRMNServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getIdSpedizioneByRMNServices != null)
      ((javax.xml.rpc.Stub)getIdSpedizioneByRMNServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices getGetIdSpedizioneByRMNServices() {
    if (getIdSpedizioneByRMNServices == null)
      _initGetIdSpedizioneByRMNServicesProxy();
    return getIdSpedizioneByRMNServices;
  }
  
  public iseries.wsbeans.getidspedizionebyrmn.GetidspedizionebyrmnResult getidspedizionebyrmn(iseries.wsbeans.getidspedizionebyrmn.GetidspedizionebyrmnInput arg0) throws java.rmi.RemoteException{
    if (getIdSpedizioneByRMNServices == null)
      _initGetIdSpedizioneByRMNServicesProxy();
    return getIdSpedizioneByRMNServices.getidspedizionebyrmn(arg0);
  }
  
  
}
/**
 * GetIdSpedizioneByRMALocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyrma;

public class GetIdSpedizioneByRMALocator extends org.apache.axis.client.Service implements iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMA {

    public GetIdSpedizioneByRMALocator() {
    }


    public GetIdSpedizioneByRMALocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetIdSpedizioneByRMALocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetIdSpedizioneByRMAServicesPort
    private java.lang.String GetIdSpedizioneByRMAServicesPort_address = "http://wsr.brt.it:10041/web/GetIdSpedizioneByRMAService/GetIdSpedizioneByRMA";

    public java.lang.String getGetIdSpedizioneByRMAServicesPortAddress() {
        return GetIdSpedizioneByRMAServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetIdSpedizioneByRMAServicesPortWSDDServiceName = "GetIdSpedizioneByRMAServicesPort";

    public java.lang.String getGetIdSpedizioneByRMAServicesPortWSDDServiceName() {
        return GetIdSpedizioneByRMAServicesPortWSDDServiceName;
    }

    public void setGetIdSpedizioneByRMAServicesPortWSDDServiceName(java.lang.String name) {
        GetIdSpedizioneByRMAServicesPortWSDDServiceName = name;
    }

    public iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices getGetIdSpedizioneByRMAServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetIdSpedizioneByRMAServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetIdSpedizioneByRMAServicesPort(endpoint);
    }

    public iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices getGetIdSpedizioneByRMAServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServicesPortBindingStub _stub = new iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getGetIdSpedizioneByRMAServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetIdSpedizioneByRMAServicesPortEndpointAddress(java.lang.String address) {
        GetIdSpedizioneByRMAServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices.class.isAssignableFrom(serviceEndpointInterface)) {
                iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServicesPortBindingStub _stub = new iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServicesPortBindingStub(new java.net.URL(GetIdSpedizioneByRMAServicesPort_address), this);
                _stub.setPortName(getGetIdSpedizioneByRMAServicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetIdSpedizioneByRMAServicesPort".equals(inputPortName)) {
            return getGetIdSpedizioneByRMAServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://getidspedizionebyrma.wsbeans.iseries/", "GetIdSpedizioneByRMA");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://getidspedizionebyrma.wsbeans.iseries/", "GetIdSpedizioneByRMAServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetIdSpedizioneByRMAServicesPort".equals(portName)) {
            setGetIdSpedizioneByRMAServicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

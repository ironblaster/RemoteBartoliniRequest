/**
 * GetIdSpedizioneByRMNLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyrmn;

public class GetIdSpedizioneByRMNLocator extends org.apache.axis.client.Service implements iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMN {

    public GetIdSpedizioneByRMNLocator() {
    }


    public GetIdSpedizioneByRMNLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetIdSpedizioneByRMNLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetIdSpedizioneByRMNServicesPort
    private java.lang.String GetIdSpedizioneByRMNServicesPort_address = "http://wsr.brt.it:10041/web/GetIdSpedizioneByRMNService/GetIdSpedizioneByRMN";

    public java.lang.String getGetIdSpedizioneByRMNServicesPortAddress() {
        return GetIdSpedizioneByRMNServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetIdSpedizioneByRMNServicesPortWSDDServiceName = "GetIdSpedizioneByRMNServicesPort";

    public java.lang.String getGetIdSpedizioneByRMNServicesPortWSDDServiceName() {
        return GetIdSpedizioneByRMNServicesPortWSDDServiceName;
    }

    public void setGetIdSpedizioneByRMNServicesPortWSDDServiceName(java.lang.String name) {
        GetIdSpedizioneByRMNServicesPortWSDDServiceName = name;
    }

    public iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices getGetIdSpedizioneByRMNServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetIdSpedizioneByRMNServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetIdSpedizioneByRMNServicesPort(endpoint);
    }

    public iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices getGetIdSpedizioneByRMNServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServicesPortBindingStub _stub = new iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getGetIdSpedizioneByRMNServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetIdSpedizioneByRMNServicesPortEndpointAddress(java.lang.String address) {
        GetIdSpedizioneByRMNServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServices.class.isAssignableFrom(serviceEndpointInterface)) {
                iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServicesPortBindingStub _stub = new iseries.wsbeans.getidspedizionebyrmn.GetIdSpedizioneByRMNServicesPortBindingStub(new java.net.URL(GetIdSpedizioneByRMNServicesPort_address), this);
                _stub.setPortName(getGetIdSpedizioneByRMNServicesPortWSDDServiceName());
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
        if ("GetIdSpedizioneByRMNServicesPort".equals(inputPortName)) {
            return getGetIdSpedizioneByRMNServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://getidspedizionebyrmn.wsbeans.iseries/", "GetIdSpedizioneByRMN");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://getidspedizionebyrmn.wsbeans.iseries/", "GetIdSpedizioneByRMNServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetIdSpedizioneByRMNServicesPort".equals(portName)) {
            setGetIdSpedizioneByRMNServicesPortEndpointAddress(address);
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

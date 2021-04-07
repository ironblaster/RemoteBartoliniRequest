/**
 * BRT_TrackingByBRTshipmentIDLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class BRT_TrackingByBRTshipmentIDLocator extends org.apache.axis.client.Service implements iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentID {

    public BRT_TrackingByBRTshipmentIDLocator() {
    }


    public BRT_TrackingByBRTshipmentIDLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BRT_TrackingByBRTshipmentIDLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BRT_TrackingByBRTshipmentIDServicesPort
    private java.lang.String BRT_TrackingByBRTshipmentIDServicesPort_address = "http://wsr.brt.it:10041/web/BRT_TrackingByBRTshipmentIDService/BRT_TrackingByBRTshipmentID";

    public java.lang.String getBRT_TrackingByBRTshipmentIDServicesPortAddress() {
        return BRT_TrackingByBRTshipmentIDServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName = "BRT_TrackingByBRTshipmentIDServicesPort";

    public java.lang.String getBRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName() {
        return BRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName;
    }

    public void setBRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName(java.lang.String name) {
        BRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName = name;
    }

    public iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices getBRT_TrackingByBRTshipmentIDServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BRT_TrackingByBRTshipmentIDServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBRT_TrackingByBRTshipmentIDServicesPort(endpoint);
    }

    public iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices getBRT_TrackingByBRTshipmentIDServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServicesPortBindingStub _stub = new iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getBRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBRT_TrackingByBRTshipmentIDServicesPortEndpointAddress(java.lang.String address) {
        BRT_TrackingByBRTshipmentIDServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServices.class.isAssignableFrom(serviceEndpointInterface)) {
                iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServicesPortBindingStub _stub = new iseries.wsbeans.brt_trackingbybrtshipmentid.BRT_TrackingByBRTshipmentIDServicesPortBindingStub(new java.net.URL(BRT_TrackingByBRTshipmentIDServicesPort_address), this);
                _stub.setPortName(getBRT_TrackingByBRTshipmentIDServicesPortWSDDServiceName());
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
        if ("BRT_TrackingByBRTshipmentIDServicesPort".equals(inputPortName)) {
            return getBRT_TrackingByBRTshipmentIDServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "BRT_TrackingByBRTshipmentID");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "BRT_TrackingByBRTshipmentIDServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BRT_TrackingByBRTshipmentIDServicesPort".equals(portName)) {
            setBRT_TrackingByBRTshipmentIDServicesPortEndpointAddress(address);
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

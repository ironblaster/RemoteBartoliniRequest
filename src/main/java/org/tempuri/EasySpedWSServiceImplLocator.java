/**
 * EasySpedWSServiceImplLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EasySpedWSServiceImplLocator extends org.apache.axis.client.Service implements org.tempuri.EasySpedWSServiceImpl {

    public EasySpedWSServiceImplLocator() {
    }


    public EasySpedWSServiceImplLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EasySpedWSServiceImplLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for easyspedde_endpoint
    private java.lang.String easyspedde_endpoint_address = "http://172.16.16.143:9005/easyspeddews";

    public java.lang.String geteasyspedde_endpointAddress() {
        return easyspedde_endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String easyspedde_endpointWSDDServiceName = "easyspedde_endpoint";

    public java.lang.String geteasyspedde_endpointWSDDServiceName() {
        return easyspedde_endpointWSDDServiceName;
    }

    public void seteasyspedde_endpointWSDDServiceName(java.lang.String name) {
        easyspedde_endpointWSDDServiceName = name;
    }

    public it.bartolini.easysped.ws.EasySpedDEWS geteasyspedde_endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(easyspedde_endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return geteasyspedde_endpoint(endpoint);
    }

    public it.bartolini.easysped.ws.EasySpedDEWS geteasyspedde_endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.Easyspedde_endpointStub _stub = new org.tempuri.Easyspedde_endpointStub(portAddress, this);
            _stub.setPortName(geteasyspedde_endpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void seteasyspedde_endpointEndpointAddress(java.lang.String address) {
        easyspedde_endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.bartolini.easysped.ws.EasySpedDEWS.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.Easyspedde_endpointStub _stub = new org.tempuri.Easyspedde_endpointStub(new java.net.URL(easyspedde_endpoint_address), this);
                _stub.setPortName(geteasyspedde_endpointWSDDServiceName());
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
        if ("easyspedde_endpoint".equals(inputPortName)) {
            return geteasyspedde_endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "EasySpedWSServiceImpl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "easyspedde_endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("easyspedde_endpoint".equals(portName)) {
            seteasyspedde_endpointEndpointAddress(address);
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

/**
 * BRT_VAS_RoutingAndLabelLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class BRT_VAS_RoutingAndLabelLocator extends org.apache.axis.client.Service implements iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabel {

    public BRT_VAS_RoutingAndLabelLocator() {
    }


    public BRT_VAS_RoutingAndLabelLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BRT_VAS_RoutingAndLabelLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BRT_VAS_RoutingAndLabelServicesPort
    private java.lang.String BRT_VAS_RoutingAndLabelServicesPort_address = "http://wsw.brt.it:10065/web/BRT_VAS_RoutingAndLabelService/BRT_VAS_RoutingAndLabel";

    public java.lang.String getBRT_VAS_RoutingAndLabelServicesPortAddress() {
        return BRT_VAS_RoutingAndLabelServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BRT_VAS_RoutingAndLabelServicesPortWSDDServiceName = "BRT_VAS_RoutingAndLabelServicesPort";

    public java.lang.String getBRT_VAS_RoutingAndLabelServicesPortWSDDServiceName() {
        return BRT_VAS_RoutingAndLabelServicesPortWSDDServiceName;
    }

    public void setBRT_VAS_RoutingAndLabelServicesPortWSDDServiceName(java.lang.String name) {
        BRT_VAS_RoutingAndLabelServicesPortWSDDServiceName = name;
    }

    public iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServices getBRT_VAS_RoutingAndLabelServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BRT_VAS_RoutingAndLabelServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBRT_VAS_RoutingAndLabelServicesPort(endpoint);
    }

    public iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServices getBRT_VAS_RoutingAndLabelServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServicesPortBindingStub _stub = new iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getBRT_VAS_RoutingAndLabelServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBRT_VAS_RoutingAndLabelServicesPortEndpointAddress(java.lang.String address) {
        BRT_VAS_RoutingAndLabelServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServices.class.isAssignableFrom(serviceEndpointInterface)) {
                iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServicesPortBindingStub _stub = new iseries.wsbeans.brt_vas_routingandlabel.BRT_VAS_RoutingAndLabelServicesPortBindingStub(new java.net.URL(BRT_VAS_RoutingAndLabelServicesPort_address), this);
                _stub.setPortName(getBRT_VAS_RoutingAndLabelServicesPortWSDDServiceName());
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
        if ("BRT_VAS_RoutingAndLabelServicesPort".equals(inputPortName)) {
            return getBRT_VAS_RoutingAndLabelServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "BRT_VAS_RoutingAndLabel");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "BRT_VAS_RoutingAndLabelServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BRT_VAS_RoutingAndLabelServicesPort".equals(portName)) {
            setBRT_VAS_RoutingAndLabelServicesPortEndpointAddress(address);
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

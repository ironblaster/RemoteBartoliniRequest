/**
 * GetLegendaEsitiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getlegendaesiti;

public class GetLegendaEsitiLocator extends org.apache.axis.client.Service implements iseries.wsbeans.getlegendaesiti.GetLegendaEsiti {

    public GetLegendaEsitiLocator() {
    }


    public GetLegendaEsitiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetLegendaEsitiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetLegendaEsitiServicesPort
    private java.lang.String GetLegendaEsitiServicesPort_address = "http://wsr.brt.it:10041/web/GetLegendaEsitiService/GetLegendaEsiti";

    public java.lang.String getGetLegendaEsitiServicesPortAddress() {
        return GetLegendaEsitiServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetLegendaEsitiServicesPortWSDDServiceName = "GetLegendaEsitiServicesPort";

    public java.lang.String getGetLegendaEsitiServicesPortWSDDServiceName() {
        return GetLegendaEsitiServicesPortWSDDServiceName;
    }

    public void setGetLegendaEsitiServicesPortWSDDServiceName(java.lang.String name) {
        GetLegendaEsitiServicesPortWSDDServiceName = name;
    }

    public iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices getGetLegendaEsitiServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetLegendaEsitiServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetLegendaEsitiServicesPort(endpoint);
    }

    public iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices getGetLegendaEsitiServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServicesPortBindingStub _stub = new iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getGetLegendaEsitiServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetLegendaEsitiServicesPortEndpointAddress(java.lang.String address) {
        GetLegendaEsitiServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices.class.isAssignableFrom(serviceEndpointInterface)) {
                iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServicesPortBindingStub _stub = new iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServicesPortBindingStub(new java.net.URL(GetLegendaEsitiServicesPort_address), this);
                _stub.setPortName(getGetLegendaEsitiServicesPortWSDDServiceName());
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
        if ("GetLegendaEsitiServicesPort".equals(inputPortName)) {
            return getGetLegendaEsitiServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://getlegendaesiti.wsbeans.iseries", "GetLegendaEsiti");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://getlegendaesiti.wsbeans.iseries", "GetLegendaEsitiServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetLegendaEsitiServicesPort".equals(portName)) {
            setGetLegendaEsitiServicesPortEndpointAddress(address);
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

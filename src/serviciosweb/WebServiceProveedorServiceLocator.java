/**
 * WebServiceProveedorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviciosweb;

public class WebServiceProveedorServiceLocator extends org.apache.axis.client.Service implements serviciosweb.WebServiceProveedorService {

    public WebServiceProveedorServiceLocator() {
    }


    public WebServiceProveedorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceProveedorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceProveedor
    private java.lang.String WebServiceProveedor_address = "http://localhost:8080/TallerJSP/services/WebServiceProveedor";

    public java.lang.String getWebServiceProveedorAddress() {
        return WebServiceProveedor_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceProveedorWSDDServiceName = "WebServiceProveedor";

    public java.lang.String getWebServiceProveedorWSDDServiceName() {
        return WebServiceProveedorWSDDServiceName;
    }

    public void setWebServiceProveedorWSDDServiceName(java.lang.String name) {
        WebServiceProveedorWSDDServiceName = name;
    }

    public serviciosweb.WebServiceProveedor getWebServiceProveedor() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceProveedor_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceProveedor(endpoint);
    }

    public serviciosweb.WebServiceProveedor getWebServiceProveedor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            serviciosweb.WebServiceProveedorSoapBindingStub _stub = new serviciosweb.WebServiceProveedorSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceProveedorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceProveedorEndpointAddress(java.lang.String address) {
        WebServiceProveedor_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviciosweb.WebServiceProveedor.class.isAssignableFrom(serviceEndpointInterface)) {
                serviciosweb.WebServiceProveedorSoapBindingStub _stub = new serviciosweb.WebServiceProveedorSoapBindingStub(new java.net.URL(WebServiceProveedor_address), this);
                _stub.setPortName(getWebServiceProveedorWSDDServiceName());
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
        if ("WebServiceProveedor".equals(inputPortName)) {
            return getWebServiceProveedor();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviciosweb", "WebServiceProveedorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviciosweb", "WebServiceProveedor"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceProveedor".equals(portName)) {
            setWebServiceProveedorEndpointAddress(address);
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

/**
 * PersonServiceImplementationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sample;

public class PersonServiceImplementationServiceLocator extends org.apache.axis.client.Service implements com.sample.PersonServiceImplementationService {

    public PersonServiceImplementationServiceLocator() {
    }


    public PersonServiceImplementationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonServiceImplementationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonServiceImplementation
    private java.lang.String PersonServiceImplementation_address = "http://localhost:8085/ASample/services/PersonServiceImplementation";

    public java.lang.String getPersonServiceImplementationAddress() {
        return PersonServiceImplementation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonServiceImplementationWSDDServiceName = "PersonServiceImplementation";

    public java.lang.String getPersonServiceImplementationWSDDServiceName() {
        return PersonServiceImplementationWSDDServiceName;
    }

    public void setPersonServiceImplementationWSDDServiceName(java.lang.String name) {
        PersonServiceImplementationWSDDServiceName = name;
    }

    public com.sample.PersonServiceImplementation getPersonServiceImplementation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonServiceImplementation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonServiceImplementation(endpoint);
    }

    public com.sample.PersonServiceImplementation getPersonServiceImplementation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sample.PersonServiceImplementationSoapBindingStub _stub = new com.sample.PersonServiceImplementationSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonServiceImplementationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonServiceImplementationEndpointAddress(java.lang.String address) {
        PersonServiceImplementation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sample.PersonServiceImplementation.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sample.PersonServiceImplementationSoapBindingStub _stub = new com.sample.PersonServiceImplementationSoapBindingStub(new java.net.URL(PersonServiceImplementation_address), this);
                _stub.setPortName(getPersonServiceImplementationWSDDServiceName());
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
        if ("PersonServiceImplementation".equals(inputPortName)) {
            return getPersonServiceImplementation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sample.com", "PersonServiceImplementationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sample.com", "PersonServiceImplementation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonServiceImplementation".equals(portName)) {
            setPersonServiceImplementationEndpointAddress(address);
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

/**
 * PersonServiceImplementationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sample;

public interface PersonServiceImplementationService extends javax.xml.rpc.Service {
    public java.lang.String getPersonServiceImplementationAddress();

    public com.sample.PersonServiceImplementation getPersonServiceImplementation() throws javax.xml.rpc.ServiceException;

    public com.sample.PersonServiceImplementation getPersonServiceImplementation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

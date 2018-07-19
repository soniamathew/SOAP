package com.sample;

public class PersonServiceImplementationProxy implements com.sample.PersonServiceImplementation {
  private String _endpoint = null;
  private com.sample.PersonServiceImplementation personServiceImplementation = null;
  
  public PersonServiceImplementationProxy() {
    _initPersonServiceImplementationProxy();
  }
  
  public PersonServiceImplementationProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonServiceImplementationProxy();
  }
  
  private void _initPersonServiceImplementationProxy() {
    try {
      personServiceImplementation = (new com.sample.PersonServiceImplementationServiceLocator()).getPersonServiceImplementation();
      if (personServiceImplementation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personServiceImplementation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personServiceImplementation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personServiceImplementation != null)
      ((javax.xml.rpc.Stub)personServiceImplementation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sample.PersonServiceImplementation getPersonServiceImplementation() {
    if (personServiceImplementation == null)
      _initPersonServiceImplementationProxy();
    return personServiceImplementation;
  }
  
  public boolean addPerson(com.sample.Person p) throws java.rmi.RemoteException{
    if (personServiceImplementation == null)
      _initPersonServiceImplementationProxy();
    return personServiceImplementation.addPerson(p);
  }
  
  public boolean deletePerson(int id) throws java.rmi.RemoteException{
    if (personServiceImplementation == null)
      _initPersonServiceImplementationProxy();
    return personServiceImplementation.deletePerson(id);
  }
  
  public com.sample.Person getPerson(int id) throws java.rmi.RemoteException{
    if (personServiceImplementation == null)
      _initPersonServiceImplementationProxy();
    return personServiceImplementation.getPerson(id);
  }
  
  public com.sample.Person[] getAllPersons() throws java.rmi.RemoteException{
    if (personServiceImplementation == null)
      _initPersonServiceImplementationProxy();
    return personServiceImplementation.getAllPersons();
  }
  
  
}
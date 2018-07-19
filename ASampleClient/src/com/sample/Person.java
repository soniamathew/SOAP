/**
 * Person.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sample;

public class Person  implements java.io.Serializable {
    private java.lang.String FName;

    private java.lang.String LName;

    private java.lang.String MName;

    private int age;

    private int id;

    public Person() {
    }

    public Person(
           java.lang.String FName,
           java.lang.String LName,
           java.lang.String MName,
           int age,
           int id) {
           this.FName = FName;
           this.LName = LName;
           this.MName = MName;
           this.age = age;
           this.id = id;
    }


    /**
     * Gets the FName value for this Person.
     * 
     * @return FName
     */
    public java.lang.String getFName() {
        return FName;
    }


    /**
     * Sets the FName value for this Person.
     * 
     * @param FName
     */
    public void setFName(java.lang.String FName) {
        this.FName = FName;
    }


    /**
     * Gets the LName value for this Person.
     * 
     * @return LName
     */
    public java.lang.String getLName() {
        return LName;
    }


    /**
     * Sets the LName value for this Person.
     * 
     * @param LName
     */
    public void setLName(java.lang.String LName) {
        this.LName = LName;
    }


    /**
     * Gets the MName value for this Person.
     * 
     * @return MName
     */
    public java.lang.String getMName() {
        return MName;
    }


    /**
     * Sets the MName value for this Person.
     * 
     * @param MName
     */
    public void setMName(java.lang.String MName) {
        this.MName = MName;
    }


    /**
     * Gets the age value for this Person.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the age value for this Person.
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets the id value for this Person.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Person.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FName==null && other.getFName()==null) || 
             (this.FName!=null &&
              this.FName.equals(other.getFName()))) &&
            ((this.LName==null && other.getLName()==null) || 
             (this.LName!=null &&
              this.LName.equals(other.getLName()))) &&
            ((this.MName==null && other.getMName()==null) || 
             (this.MName!=null &&
              this.MName.equals(other.getMName()))) &&
            this.age == other.getAge() &&
            this.id == other.getId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFName() != null) {
            _hashCode += getFName().hashCode();
        }
        if (getLName() != null) {
            _hashCode += getLName().hashCode();
        }
        if (getMName() != null) {
            _hashCode += getMName().hashCode();
        }
        _hashCode += getAge();
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Person.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sample.com", "Person"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sample.com", "FName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sample.com", "LName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sample.com", "MName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sample.com", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sample.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

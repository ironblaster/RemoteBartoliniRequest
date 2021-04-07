/**
 * EasySpedFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Bartolini_EasySped_ws;

public class EasySpedFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String arguments;

    private java.lang.String detail;

    private java.lang.String exceptionMessage;

    private java.lang.String exceptionType;

    public EasySpedFault() {
    }

    public EasySpedFault(
           java.lang.String arguments,
           java.lang.String detail,
           java.lang.String exceptionMessage,
           java.lang.String exceptionType) {
        this.arguments = arguments;
        this.detail = detail;
        this.exceptionMessage = exceptionMessage;
        this.exceptionType = exceptionType;
    }


    /**
     * Gets the arguments value for this EasySpedFault.
     * 
     * @return arguments
     */
    public java.lang.String getArguments() {
        return arguments;
    }


    /**
     * Sets the arguments value for this EasySpedFault.
     * 
     * @param arguments
     */
    public void setArguments(java.lang.String arguments) {
        this.arguments = arguments;
    }


    /**
     * Gets the detail value for this EasySpedFault.
     * 
     * @return detail
     */
    public java.lang.String getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this EasySpedFault.
     * 
     * @param detail
     */
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }


    /**
     * Gets the exceptionMessage value for this EasySpedFault.
     * 
     * @return exceptionMessage
     */
    public java.lang.String getExceptionMessage() {
        return exceptionMessage;
    }


    /**
     * Sets the exceptionMessage value for this EasySpedFault.
     * 
     * @param exceptionMessage
     */
    public void setExceptionMessage(java.lang.String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }


    /**
     * Gets the exceptionType value for this EasySpedFault.
     * 
     * @return exceptionType
     */
    public java.lang.String getExceptionType() {
        return exceptionType;
    }


    /**
     * Sets the exceptionType value for this EasySpedFault.
     * 
     * @param exceptionType
     */
    public void setExceptionType(java.lang.String exceptionType) {
        this.exceptionType = exceptionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EasySpedFault)) return false;
        EasySpedFault other = (EasySpedFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arguments==null && other.getArguments()==null) || 
             (this.arguments!=null &&
              this.arguments.equals(other.getArguments()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            ((this.exceptionMessage==null && other.getExceptionMessage()==null) || 
             (this.exceptionMessage!=null &&
              this.exceptionMessage.equals(other.getExceptionMessage()))) &&
            ((this.exceptionType==null && other.getExceptionType()==null) || 
             (this.exceptionType!=null &&
              this.exceptionType.equals(other.getExceptionType())));
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
        if (getArguments() != null) {
            _hashCode += getArguments().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        if (getExceptionMessage() != null) {
            _hashCode += getExceptionMessage().hashCode();
        }
        if (getExceptionType() != null) {
            _hashCode += getExceptionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EasySpedFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.ws", "EasySpedFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arguments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.ws", "Arguments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.ws", "Detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.ws", "ExceptionMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Bartolini.EasySped.ws", "ExceptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}

/**
 * ErrorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class ErrorInfo  implements java.io.Serializable {
    private java.lang.String errorSeverity;

    private int errorCode;

    private java.lang.String errorCodeDesc;

    private java.lang.String errorMessage;

    public ErrorInfo() {
    }

    public ErrorInfo(
           java.lang.String errorSeverity,
           int errorCode,
           java.lang.String errorCodeDesc,
           java.lang.String errorMessage) {
           this.errorSeverity = errorSeverity;
           this.errorCode = errorCode;
           this.errorCodeDesc = errorCodeDesc;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorSeverity value for this ErrorInfo.
     * 
     * @return errorSeverity
     */
    public java.lang.String getErrorSeverity() {
        return errorSeverity;
    }


    /**
     * Sets the errorSeverity value for this ErrorInfo.
     * 
     * @param errorSeverity
     */
    public void setErrorSeverity(java.lang.String errorSeverity) {
        this.errorSeverity = errorSeverity;
    }


    /**
     * Gets the errorCode value for this ErrorInfo.
     * 
     * @return errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ErrorInfo.
     * 
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorCodeDesc value for this ErrorInfo.
     * 
     * @return errorCodeDesc
     */
    public java.lang.String getErrorCodeDesc() {
        return errorCodeDesc;
    }


    /**
     * Sets the errorCodeDesc value for this ErrorInfo.
     * 
     * @param errorCodeDesc
     */
    public void setErrorCodeDesc(java.lang.String errorCodeDesc) {
        this.errorCodeDesc = errorCodeDesc;
    }


    /**
     * Gets the errorMessage value for this ErrorInfo.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ErrorInfo.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorInfo)) return false;
        ErrorInfo other = (ErrorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorSeverity==null && other.getErrorSeverity()==null) || 
             (this.errorSeverity!=null &&
              this.errorSeverity.equals(other.getErrorSeverity()))) &&
            this.errorCode == other.getErrorCode() &&
            ((this.errorCodeDesc==null && other.getErrorCodeDesc()==null) || 
             (this.errorCodeDesc!=null &&
              this.errorCodeDesc.equals(other.getErrorCodeDesc()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getErrorSeverity() != null) {
            _hashCode += getErrorSeverity().hashCode();
        }
        _hashCode += getErrorCode();
        if (getErrorCodeDesc() != null) {
            _hashCode += getErrorCodeDesc().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "errorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCodeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCodeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

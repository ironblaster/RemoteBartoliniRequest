/**
 * GetidspedizionebyidcolloInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyidcollo;

public class GetidspedizionebyidcolloInput  implements java.io.Serializable {
    private java.math.BigDecimal CLIENTE_ID;

    private java.lang.String COLLO_ID;

    public GetidspedizionebyidcolloInput() {
    }

    public GetidspedizionebyidcolloInput(
           java.math.BigDecimal CLIENTE_ID,
           java.lang.String COLLO_ID) {
           this.CLIENTE_ID = CLIENTE_ID;
           this.COLLO_ID = COLLO_ID;
    }


    /**
     * Gets the CLIENTE_ID value for this GetidspedizionebyidcolloInput.
     * 
     * @return CLIENTE_ID
     */
    public java.math.BigDecimal getCLIENTE_ID() {
        return CLIENTE_ID;
    }


    /**
     * Sets the CLIENTE_ID value for this GetidspedizionebyidcolloInput.
     * 
     * @param CLIENTE_ID
     */
    public void setCLIENTE_ID(java.math.BigDecimal CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }


    /**
     * Gets the COLLO_ID value for this GetidspedizionebyidcolloInput.
     * 
     * @return COLLO_ID
     */
    public java.lang.String getCOLLO_ID() {
        return COLLO_ID;
    }


    /**
     * Sets the COLLO_ID value for this GetidspedizionebyidcolloInput.
     * 
     * @param COLLO_ID
     */
    public void setCOLLO_ID(java.lang.String COLLO_ID) {
        this.COLLO_ID = COLLO_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetidspedizionebyidcolloInput)) return false;
        GetidspedizionebyidcolloInput other = (GetidspedizionebyidcolloInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CLIENTE_ID==null && other.getCLIENTE_ID()==null) || 
             (this.CLIENTE_ID!=null &&
              this.CLIENTE_ID.equals(other.getCLIENTE_ID()))) &&
            ((this.COLLO_ID==null && other.getCOLLO_ID()==null) || 
             (this.COLLO_ID!=null &&
              this.COLLO_ID.equals(other.getCOLLO_ID())));
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
        if (getCLIENTE_ID() != null) {
            _hashCode += getCLIENTE_ID().hashCode();
        }
        if (getCOLLO_ID() != null) {
            _hashCode += getCOLLO_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetidspedizionebyidcolloInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getidspedizionebyidcollo.wsbeans.iseries/", "getidspedizionebyidcolloInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENTE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CLIENTE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COLLO_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COLLO_ID"));
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

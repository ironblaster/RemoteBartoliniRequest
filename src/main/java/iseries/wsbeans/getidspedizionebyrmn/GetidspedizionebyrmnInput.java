/**
 * GetidspedizionebyrmnInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyrmn;

public class GetidspedizionebyrmnInput  implements java.io.Serializable {
    private java.math.BigDecimal CLIENTE_ID;

    private java.math.BigDecimal RIFERIMENTO_MITTENTE_NUMERICO;

    public GetidspedizionebyrmnInput() {
    }

    public GetidspedizionebyrmnInput(
           java.math.BigDecimal CLIENTE_ID,
           java.math.BigDecimal RIFERIMENTO_MITTENTE_NUMERICO) {
           this.CLIENTE_ID = CLIENTE_ID;
           this.RIFERIMENTO_MITTENTE_NUMERICO = RIFERIMENTO_MITTENTE_NUMERICO;
    }


    /**
     * Gets the CLIENTE_ID value for this GetidspedizionebyrmnInput.
     * 
     * @return CLIENTE_ID
     */
    public java.math.BigDecimal getCLIENTE_ID() {
        return CLIENTE_ID;
    }


    /**
     * Sets the CLIENTE_ID value for this GetidspedizionebyrmnInput.
     * 
     * @param CLIENTE_ID
     */
    public void setCLIENTE_ID(java.math.BigDecimal CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }


    /**
     * Gets the RIFERIMENTO_MITTENTE_NUMERICO value for this GetidspedizionebyrmnInput.
     * 
     * @return RIFERIMENTO_MITTENTE_NUMERICO
     */
    public java.math.BigDecimal getRIFERIMENTO_MITTENTE_NUMERICO() {
        return RIFERIMENTO_MITTENTE_NUMERICO;
    }


    /**
     * Sets the RIFERIMENTO_MITTENTE_NUMERICO value for this GetidspedizionebyrmnInput.
     * 
     * @param RIFERIMENTO_MITTENTE_NUMERICO
     */
    public void setRIFERIMENTO_MITTENTE_NUMERICO(java.math.BigDecimal RIFERIMENTO_MITTENTE_NUMERICO) {
        this.RIFERIMENTO_MITTENTE_NUMERICO = RIFERIMENTO_MITTENTE_NUMERICO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetidspedizionebyrmnInput)) return false;
        GetidspedizionebyrmnInput other = (GetidspedizionebyrmnInput) obj;
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
            ((this.RIFERIMENTO_MITTENTE_NUMERICO==null && other.getRIFERIMENTO_MITTENTE_NUMERICO()==null) || 
             (this.RIFERIMENTO_MITTENTE_NUMERICO!=null &&
              this.RIFERIMENTO_MITTENTE_NUMERICO.equals(other.getRIFERIMENTO_MITTENTE_NUMERICO())));
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
        if (getRIFERIMENTO_MITTENTE_NUMERICO() != null) {
            _hashCode += getRIFERIMENTO_MITTENTE_NUMERICO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetidspedizionebyrmnInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getidspedizionebyrmn.wsbeans.iseries/", "getidspedizionebyrmnInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENTE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CLIENTE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIFERIMENTO_MITTENTE_NUMERICO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIFERIMENTO_MITTENTE_NUMERICO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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

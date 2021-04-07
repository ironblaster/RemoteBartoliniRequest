/**
 * GetidspedizionebyrmaInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyrma;

public class GetidspedizionebyrmaInput  implements java.io.Serializable {
    private java.math.BigDecimal CLIENTE_ID;

    private java.lang.String RIFERIMENTO_MITTENTE_ALFABETICO;

    public GetidspedizionebyrmaInput() {
    }

    public GetidspedizionebyrmaInput(
           java.math.BigDecimal CLIENTE_ID,
           java.lang.String RIFERIMENTO_MITTENTE_ALFABETICO) {
           this.CLIENTE_ID = CLIENTE_ID;
           this.RIFERIMENTO_MITTENTE_ALFABETICO = RIFERIMENTO_MITTENTE_ALFABETICO;
    }


    /**
     * Gets the CLIENTE_ID value for this GetidspedizionebyrmaInput.
     * 
     * @return CLIENTE_ID
     */
    public java.math.BigDecimal getCLIENTE_ID() {
        return CLIENTE_ID;
    }


    /**
     * Sets the CLIENTE_ID value for this GetidspedizionebyrmaInput.
     * 
     * @param CLIENTE_ID
     */
    public void setCLIENTE_ID(java.math.BigDecimal CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }


    /**
     * Gets the RIFERIMENTO_MITTENTE_ALFABETICO value for this GetidspedizionebyrmaInput.
     * 
     * @return RIFERIMENTO_MITTENTE_ALFABETICO
     */
    public java.lang.String getRIFERIMENTO_MITTENTE_ALFABETICO() {
        return RIFERIMENTO_MITTENTE_ALFABETICO;
    }


    /**
     * Sets the RIFERIMENTO_MITTENTE_ALFABETICO value for this GetidspedizionebyrmaInput.
     * 
     * @param RIFERIMENTO_MITTENTE_ALFABETICO
     */
    public void setRIFERIMENTO_MITTENTE_ALFABETICO(java.lang.String RIFERIMENTO_MITTENTE_ALFABETICO) {
        this.RIFERIMENTO_MITTENTE_ALFABETICO = RIFERIMENTO_MITTENTE_ALFABETICO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetidspedizionebyrmaInput)) return false;
        GetidspedizionebyrmaInput other = (GetidspedizionebyrmaInput) obj;
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
            ((this.RIFERIMENTO_MITTENTE_ALFABETICO==null && other.getRIFERIMENTO_MITTENTE_ALFABETICO()==null) || 
             (this.RIFERIMENTO_MITTENTE_ALFABETICO!=null &&
              this.RIFERIMENTO_MITTENTE_ALFABETICO.equals(other.getRIFERIMENTO_MITTENTE_ALFABETICO())));
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
        if (getRIFERIMENTO_MITTENTE_ALFABETICO() != null) {
            _hashCode += getRIFERIMENTO_MITTENTE_ALFABETICO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetidspedizionebyrmaInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getidspedizionebyrma.wsbeans.iseries/", "getidspedizionebyrmaInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENTE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CLIENTE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIFERIMENTO_MITTENTE_ALFABETICO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIFERIMENTO_MITTENTE_ALFABETICO"));
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

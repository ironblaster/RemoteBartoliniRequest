/**
 * Riferimenti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Riferimenti  implements java.io.Serializable {
    private java.lang.String RIFERIMENTO_MITTENTE_ALFABETICO;

    private long RIFERIMENTO_MITTENTE_NUMERICO;

    private java.lang.String RIFERIMENTO_PARTNER_ESTERO;

    public Riferimenti() {
    }

    public Riferimenti(
           java.lang.String RIFERIMENTO_MITTENTE_ALFABETICO,
           long RIFERIMENTO_MITTENTE_NUMERICO,
           java.lang.String RIFERIMENTO_PARTNER_ESTERO) {
           this.RIFERIMENTO_MITTENTE_ALFABETICO = RIFERIMENTO_MITTENTE_ALFABETICO;
           this.RIFERIMENTO_MITTENTE_NUMERICO = RIFERIMENTO_MITTENTE_NUMERICO;
           this.RIFERIMENTO_PARTNER_ESTERO = RIFERIMENTO_PARTNER_ESTERO;
    }


    /**
     * Gets the RIFERIMENTO_MITTENTE_ALFABETICO value for this Riferimenti.
     * 
     * @return RIFERIMENTO_MITTENTE_ALFABETICO
     */
    public java.lang.String getRIFERIMENTO_MITTENTE_ALFABETICO() {
        return RIFERIMENTO_MITTENTE_ALFABETICO;
    }


    /**
     * Sets the RIFERIMENTO_MITTENTE_ALFABETICO value for this Riferimenti.
     * 
     * @param RIFERIMENTO_MITTENTE_ALFABETICO
     */
    public void setRIFERIMENTO_MITTENTE_ALFABETICO(java.lang.String RIFERIMENTO_MITTENTE_ALFABETICO) {
        this.RIFERIMENTO_MITTENTE_ALFABETICO = RIFERIMENTO_MITTENTE_ALFABETICO;
    }


    /**
     * Gets the RIFERIMENTO_MITTENTE_NUMERICO value for this Riferimenti.
     * 
     * @return RIFERIMENTO_MITTENTE_NUMERICO
     */
    public long getRIFERIMENTO_MITTENTE_NUMERICO() {
        return RIFERIMENTO_MITTENTE_NUMERICO;
    }


    /**
     * Sets the RIFERIMENTO_MITTENTE_NUMERICO value for this Riferimenti.
     * 
     * @param RIFERIMENTO_MITTENTE_NUMERICO
     */
    public void setRIFERIMENTO_MITTENTE_NUMERICO(long RIFERIMENTO_MITTENTE_NUMERICO) {
        this.RIFERIMENTO_MITTENTE_NUMERICO = RIFERIMENTO_MITTENTE_NUMERICO;
    }


    /**
     * Gets the RIFERIMENTO_PARTNER_ESTERO value for this Riferimenti.
     * 
     * @return RIFERIMENTO_PARTNER_ESTERO
     */
    public java.lang.String getRIFERIMENTO_PARTNER_ESTERO() {
        return RIFERIMENTO_PARTNER_ESTERO;
    }


    /**
     * Sets the RIFERIMENTO_PARTNER_ESTERO value for this Riferimenti.
     * 
     * @param RIFERIMENTO_PARTNER_ESTERO
     */
    public void setRIFERIMENTO_PARTNER_ESTERO(java.lang.String RIFERIMENTO_PARTNER_ESTERO) {
        this.RIFERIMENTO_PARTNER_ESTERO = RIFERIMENTO_PARTNER_ESTERO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Riferimenti)) return false;
        Riferimenti other = (Riferimenti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RIFERIMENTO_MITTENTE_ALFABETICO==null && other.getRIFERIMENTO_MITTENTE_ALFABETICO()==null) || 
             (this.RIFERIMENTO_MITTENTE_ALFABETICO!=null &&
              this.RIFERIMENTO_MITTENTE_ALFABETICO.equals(other.getRIFERIMENTO_MITTENTE_ALFABETICO()))) &&
            this.RIFERIMENTO_MITTENTE_NUMERICO == other.getRIFERIMENTO_MITTENTE_NUMERICO() &&
            ((this.RIFERIMENTO_PARTNER_ESTERO==null && other.getRIFERIMENTO_PARTNER_ESTERO()==null) || 
             (this.RIFERIMENTO_PARTNER_ESTERO!=null &&
              this.RIFERIMENTO_PARTNER_ESTERO.equals(other.getRIFERIMENTO_PARTNER_ESTERO())));
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
        if (getRIFERIMENTO_MITTENTE_ALFABETICO() != null) {
            _hashCode += getRIFERIMENTO_MITTENTE_ALFABETICO().hashCode();
        }
        _hashCode += new Long(getRIFERIMENTO_MITTENTE_NUMERICO()).hashCode();
        if (getRIFERIMENTO_PARTNER_ESTERO() != null) {
            _hashCode += getRIFERIMENTO_PARTNER_ESTERO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Riferimenti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "riferimenti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIFERIMENTO_MITTENTE_ALFABETICO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIFERIMENTO_MITTENTE_ALFABETICO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIFERIMENTO_MITTENTE_NUMERICO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIFERIMENTO_MITTENTE_NUMERICO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIFERIMENTO_PARTNER_ESTERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIFERIMENTO_PARTNER_ESTERO"));
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

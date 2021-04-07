/**
 * Assicurazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Assicurazione  implements java.io.Serializable {
    private java.lang.String ASSICURAZIONE_DIVISA;

    private double ASSICURAZIONE_IMPORTO;

    public Assicurazione() {
    }

    public Assicurazione(
           java.lang.String ASSICURAZIONE_DIVISA,
           double ASSICURAZIONE_IMPORTO) {
           this.ASSICURAZIONE_DIVISA = ASSICURAZIONE_DIVISA;
           this.ASSICURAZIONE_IMPORTO = ASSICURAZIONE_IMPORTO;
    }


    /**
     * Gets the ASSICURAZIONE_DIVISA value for this Assicurazione.
     * 
     * @return ASSICURAZIONE_DIVISA
     */
    public java.lang.String getASSICURAZIONE_DIVISA() {
        return ASSICURAZIONE_DIVISA;
    }


    /**
     * Sets the ASSICURAZIONE_DIVISA value for this Assicurazione.
     * 
     * @param ASSICURAZIONE_DIVISA
     */
    public void setASSICURAZIONE_DIVISA(java.lang.String ASSICURAZIONE_DIVISA) {
        this.ASSICURAZIONE_DIVISA = ASSICURAZIONE_DIVISA;
    }


    /**
     * Gets the ASSICURAZIONE_IMPORTO value for this Assicurazione.
     * 
     * @return ASSICURAZIONE_IMPORTO
     */
    public double getASSICURAZIONE_IMPORTO() {
        return ASSICURAZIONE_IMPORTO;
    }


    /**
     * Sets the ASSICURAZIONE_IMPORTO value for this Assicurazione.
     * 
     * @param ASSICURAZIONE_IMPORTO
     */
    public void setASSICURAZIONE_IMPORTO(double ASSICURAZIONE_IMPORTO) {
        this.ASSICURAZIONE_IMPORTO = ASSICURAZIONE_IMPORTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assicurazione)) return false;
        Assicurazione other = (Assicurazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ASSICURAZIONE_DIVISA==null && other.getASSICURAZIONE_DIVISA()==null) || 
             (this.ASSICURAZIONE_DIVISA!=null &&
              this.ASSICURAZIONE_DIVISA.equals(other.getASSICURAZIONE_DIVISA()))) &&
            this.ASSICURAZIONE_IMPORTO == other.getASSICURAZIONE_IMPORTO();
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
        if (getASSICURAZIONE_DIVISA() != null) {
            _hashCode += getASSICURAZIONE_DIVISA().hashCode();
        }
        _hashCode += new Double(getASSICURAZIONE_IMPORTO()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assicurazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "assicurazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSICURAZIONE_DIVISA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ASSICURAZIONE_DIVISA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSICURAZIONE_IMPORTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ASSICURAZIONE_IMPORTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

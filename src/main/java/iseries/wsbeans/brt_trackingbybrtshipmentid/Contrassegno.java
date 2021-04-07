/**
 * Contrassegno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Contrassegno  implements java.io.Serializable {
    private java.lang.String CONTRASSEGNO_DIVISA;

    private double CONTRASSEGNO_IMPORTO;

    private java.lang.String CONTRASSEGNO_INCASSO;

    private java.lang.String CONTRASSEGNO_PARTICOLARITA;

    public Contrassegno() {
    }

    public Contrassegno(
           java.lang.String CONTRASSEGNO_DIVISA,
           double CONTRASSEGNO_IMPORTO,
           java.lang.String CONTRASSEGNO_INCASSO,
           java.lang.String CONTRASSEGNO_PARTICOLARITA) {
           this.CONTRASSEGNO_DIVISA = CONTRASSEGNO_DIVISA;
           this.CONTRASSEGNO_IMPORTO = CONTRASSEGNO_IMPORTO;
           this.CONTRASSEGNO_INCASSO = CONTRASSEGNO_INCASSO;
           this.CONTRASSEGNO_PARTICOLARITA = CONTRASSEGNO_PARTICOLARITA;
    }


    /**
     * Gets the CONTRASSEGNO_DIVISA value for this Contrassegno.
     * 
     * @return CONTRASSEGNO_DIVISA
     */
    public java.lang.String getCONTRASSEGNO_DIVISA() {
        return CONTRASSEGNO_DIVISA;
    }


    /**
     * Sets the CONTRASSEGNO_DIVISA value for this Contrassegno.
     * 
     * @param CONTRASSEGNO_DIVISA
     */
    public void setCONTRASSEGNO_DIVISA(java.lang.String CONTRASSEGNO_DIVISA) {
        this.CONTRASSEGNO_DIVISA = CONTRASSEGNO_DIVISA;
    }


    /**
     * Gets the CONTRASSEGNO_IMPORTO value for this Contrassegno.
     * 
     * @return CONTRASSEGNO_IMPORTO
     */
    public double getCONTRASSEGNO_IMPORTO() {
        return CONTRASSEGNO_IMPORTO;
    }


    /**
     * Sets the CONTRASSEGNO_IMPORTO value for this Contrassegno.
     * 
     * @param CONTRASSEGNO_IMPORTO
     */
    public void setCONTRASSEGNO_IMPORTO(double CONTRASSEGNO_IMPORTO) {
        this.CONTRASSEGNO_IMPORTO = CONTRASSEGNO_IMPORTO;
    }


    /**
     * Gets the CONTRASSEGNO_INCASSO value for this Contrassegno.
     * 
     * @return CONTRASSEGNO_INCASSO
     */
    public java.lang.String getCONTRASSEGNO_INCASSO() {
        return CONTRASSEGNO_INCASSO;
    }


    /**
     * Sets the CONTRASSEGNO_INCASSO value for this Contrassegno.
     * 
     * @param CONTRASSEGNO_INCASSO
     */
    public void setCONTRASSEGNO_INCASSO(java.lang.String CONTRASSEGNO_INCASSO) {
        this.CONTRASSEGNO_INCASSO = CONTRASSEGNO_INCASSO;
    }


    /**
     * Gets the CONTRASSEGNO_PARTICOLARITA value for this Contrassegno.
     * 
     * @return CONTRASSEGNO_PARTICOLARITA
     */
    public java.lang.String getCONTRASSEGNO_PARTICOLARITA() {
        return CONTRASSEGNO_PARTICOLARITA;
    }


    /**
     * Sets the CONTRASSEGNO_PARTICOLARITA value for this Contrassegno.
     * 
     * @param CONTRASSEGNO_PARTICOLARITA
     */
    public void setCONTRASSEGNO_PARTICOLARITA(java.lang.String CONTRASSEGNO_PARTICOLARITA) {
        this.CONTRASSEGNO_PARTICOLARITA = CONTRASSEGNO_PARTICOLARITA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contrassegno)) return false;
        Contrassegno other = (Contrassegno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CONTRASSEGNO_DIVISA==null && other.getCONTRASSEGNO_DIVISA()==null) || 
             (this.CONTRASSEGNO_DIVISA!=null &&
              this.CONTRASSEGNO_DIVISA.equals(other.getCONTRASSEGNO_DIVISA()))) &&
            this.CONTRASSEGNO_IMPORTO == other.getCONTRASSEGNO_IMPORTO() &&
            ((this.CONTRASSEGNO_INCASSO==null && other.getCONTRASSEGNO_INCASSO()==null) || 
             (this.CONTRASSEGNO_INCASSO!=null &&
              this.CONTRASSEGNO_INCASSO.equals(other.getCONTRASSEGNO_INCASSO()))) &&
            ((this.CONTRASSEGNO_PARTICOLARITA==null && other.getCONTRASSEGNO_PARTICOLARITA()==null) || 
             (this.CONTRASSEGNO_PARTICOLARITA!=null &&
              this.CONTRASSEGNO_PARTICOLARITA.equals(other.getCONTRASSEGNO_PARTICOLARITA())));
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
        if (getCONTRASSEGNO_DIVISA() != null) {
            _hashCode += getCONTRASSEGNO_DIVISA().hashCode();
        }
        _hashCode += new Double(getCONTRASSEGNO_IMPORTO()).hashCode();
        if (getCONTRASSEGNO_INCASSO() != null) {
            _hashCode += getCONTRASSEGNO_INCASSO().hashCode();
        }
        if (getCONTRASSEGNO_PARTICOLARITA() != null) {
            _hashCode += getCONTRASSEGNO_PARTICOLARITA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contrassegno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "contrassegno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRASSEGNO_DIVISA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRASSEGNO_DIVISA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRASSEGNO_IMPORTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRASSEGNO_IMPORTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRASSEGNO_INCASSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRASSEGNO_INCASSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRASSEGNO_PARTICOLARITA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRASSEGNO_PARTICOLARITA"));
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

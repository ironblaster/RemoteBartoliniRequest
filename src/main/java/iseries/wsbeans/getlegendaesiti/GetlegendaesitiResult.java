/**
 * GetlegendaesitiResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getlegendaesiti;

public class GetlegendaesitiResult  implements java.io.Serializable {
    private int ESITO;

    private iseries.wsbeans.getlegendaesiti.LegendaESITO[] LEGENDA;

    private int LEGENDA_CONTATORE;

    private int VERSIONE;

    public GetlegendaesitiResult() {
    }

    public GetlegendaesitiResult(
           int ESITO,
           iseries.wsbeans.getlegendaesiti.LegendaESITO[] LEGENDA,
           int LEGENDA_CONTATORE,
           int VERSIONE) {
           this.ESITO = ESITO;
           this.LEGENDA = LEGENDA;
           this.LEGENDA_CONTATORE = LEGENDA_CONTATORE;
           this.VERSIONE = VERSIONE;
    }


    /**
     * Gets the ESITO value for this GetlegendaesitiResult.
     * 
     * @return ESITO
     */
    public int getESITO() {
        return ESITO;
    }


    /**
     * Sets the ESITO value for this GetlegendaesitiResult.
     * 
     * @param ESITO
     */
    public void setESITO(int ESITO) {
        this.ESITO = ESITO;
    }


    /**
     * Gets the LEGENDA value for this GetlegendaesitiResult.
     * 
     * @return LEGENDA
     */
    public iseries.wsbeans.getlegendaesiti.LegendaESITO[] getLEGENDA() {
        return LEGENDA;
    }


    /**
     * Sets the LEGENDA value for this GetlegendaesitiResult.
     * 
     * @param LEGENDA
     */
    public void setLEGENDA(iseries.wsbeans.getlegendaesiti.LegendaESITO[] LEGENDA) {
        this.LEGENDA = LEGENDA;
    }

    public iseries.wsbeans.getlegendaesiti.LegendaESITO getLEGENDA(int i) {
        return this.LEGENDA[i];
    }

    public void setLEGENDA(int i, iseries.wsbeans.getlegendaesiti.LegendaESITO _value) {
        this.LEGENDA[i] = _value;
    }


    /**
     * Gets the LEGENDA_CONTATORE value for this GetlegendaesitiResult.
     * 
     * @return LEGENDA_CONTATORE
     */
    public int getLEGENDA_CONTATORE() {
        return LEGENDA_CONTATORE;
    }


    /**
     * Sets the LEGENDA_CONTATORE value for this GetlegendaesitiResult.
     * 
     * @param LEGENDA_CONTATORE
     */
    public void setLEGENDA_CONTATORE(int LEGENDA_CONTATORE) {
        this.LEGENDA_CONTATORE = LEGENDA_CONTATORE;
    }


    /**
     * Gets the VERSIONE value for this GetlegendaesitiResult.
     * 
     * @return VERSIONE
     */
    public int getVERSIONE() {
        return VERSIONE;
    }


    /**
     * Sets the VERSIONE value for this GetlegendaesitiResult.
     * 
     * @param VERSIONE
     */
    public void setVERSIONE(int VERSIONE) {
        this.VERSIONE = VERSIONE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetlegendaesitiResult)) return false;
        GetlegendaesitiResult other = (GetlegendaesitiResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ESITO == other.getESITO() &&
            ((this.LEGENDA==null && other.getLEGENDA()==null) || 
             (this.LEGENDA!=null &&
              java.util.Arrays.equals(this.LEGENDA, other.getLEGENDA()))) &&
            this.LEGENDA_CONTATORE == other.getLEGENDA_CONTATORE() &&
            this.VERSIONE == other.getVERSIONE();
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
        _hashCode += getESITO();
        if (getLEGENDA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLEGENDA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLEGENDA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLEGENDA_CONTATORE();
        _hashCode += getVERSIONE();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetlegendaesitiResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getlegendaesiti.wsbeans.iseries", "getlegendaesitiResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESITO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESITO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEGENDA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LEGENDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://getlegendaesiti.wsbeans.iseries", "legendaESITO"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEGENDA_CONTATORE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LEGENDA_CONTATORE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VERSIONE"));
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

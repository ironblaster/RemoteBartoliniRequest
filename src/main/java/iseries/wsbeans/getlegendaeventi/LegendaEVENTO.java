/**
 * LegendaEVENTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getlegendaeventi;

public class LegendaEVENTO  implements java.io.Serializable {
    private java.lang.String DESCRIZIONE;

    private java.lang.String ID;

    public LegendaEVENTO() {
    }

    public LegendaEVENTO(
           java.lang.String DESCRIZIONE,
           java.lang.String ID) {
           this.DESCRIZIONE = DESCRIZIONE;
           this.ID = ID;
    }


    /**
     * Gets the DESCRIZIONE value for this LegendaEVENTO.
     * 
     * @return DESCRIZIONE
     */
    public java.lang.String getDESCRIZIONE() {
        return DESCRIZIONE;
    }


    /**
     * Sets the DESCRIZIONE value for this LegendaEVENTO.
     * 
     * @param DESCRIZIONE
     */
    public void setDESCRIZIONE(java.lang.String DESCRIZIONE) {
        this.DESCRIZIONE = DESCRIZIONE;
    }


    /**
     * Gets the ID value for this LegendaEVENTO.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this LegendaEVENTO.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LegendaEVENTO)) return false;
        LegendaEVENTO other = (LegendaEVENTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DESCRIZIONE==null && other.getDESCRIZIONE()==null) || 
             (this.DESCRIZIONE!=null &&
              this.DESCRIZIONE.equals(other.getDESCRIZIONE()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID())));
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
        if (getDESCRIZIONE() != null) {
            _hashCode += getDESCRIZIONE().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LegendaEVENTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getlegendaeventi.wsbeans.iseries", "legendaEVENTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIZIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRIZIONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
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

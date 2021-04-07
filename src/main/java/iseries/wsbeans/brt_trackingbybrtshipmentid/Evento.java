/**
 * Evento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Evento  implements java.io.Serializable {
    private java.lang.String DATA;

    private java.lang.String DESCRIZIONE;

    private java.lang.String FILIALE;

    private java.lang.String ID;

    private java.lang.String ORA;

    public Evento() {
    }

    public Evento(
           java.lang.String DATA,
           java.lang.String DESCRIZIONE,
           java.lang.String FILIALE,
           java.lang.String ID,
           java.lang.String ORA) {
           this.DATA = DATA;
           this.DESCRIZIONE = DESCRIZIONE;
           this.FILIALE = FILIALE;
           this.ID = ID;
           this.ORA = ORA;
    }


    /**
     * Gets the DATA value for this Evento.
     * 
     * @return DATA
     */
    public java.lang.String getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this Evento.
     * 
     * @param DATA
     */
    public void setDATA(java.lang.String DATA) {
        this.DATA = DATA;
    }


    /**
     * Gets the DESCRIZIONE value for this Evento.
     * 
     * @return DESCRIZIONE
     */
    public java.lang.String getDESCRIZIONE() {
        return DESCRIZIONE;
    }


    /**
     * Sets the DESCRIZIONE value for this Evento.
     * 
     * @param DESCRIZIONE
     */
    public void setDESCRIZIONE(java.lang.String DESCRIZIONE) {
        this.DESCRIZIONE = DESCRIZIONE;
    }


    /**
     * Gets the FILIALE value for this Evento.
     * 
     * @return FILIALE
     */
    public java.lang.String getFILIALE() {
        return FILIALE;
    }


    /**
     * Sets the FILIALE value for this Evento.
     * 
     * @param FILIALE
     */
    public void setFILIALE(java.lang.String FILIALE) {
        this.FILIALE = FILIALE;
    }


    /**
     * Gets the ID value for this Evento.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Evento.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the ORA value for this Evento.
     * 
     * @return ORA
     */
    public java.lang.String getORA() {
        return ORA;
    }


    /**
     * Sets the ORA value for this Evento.
     * 
     * @param ORA
     */
    public void setORA(java.lang.String ORA) {
        this.ORA = ORA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evento)) return false;
        Evento other = (Evento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              this.DATA.equals(other.getDATA()))) &&
            ((this.DESCRIZIONE==null && other.getDESCRIZIONE()==null) || 
             (this.DESCRIZIONE!=null &&
              this.DESCRIZIONE.equals(other.getDESCRIZIONE()))) &&
            ((this.FILIALE==null && other.getFILIALE()==null) || 
             (this.FILIALE!=null &&
              this.FILIALE.equals(other.getFILIALE()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.ORA==null && other.getORA()==null) || 
             (this.ORA!=null &&
              this.ORA.equals(other.getORA())));
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
        if (getDATA() != null) {
            _hashCode += getDATA().hashCode();
        }
        if (getDESCRIZIONE() != null) {
            _hashCode += getDESCRIZIONE().hashCode();
        }
        if (getFILIALE() != null) {
            _hashCode += getFILIALE().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getORA() != null) {
            _hashCode += getORA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Evento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "evento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIZIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRIZIONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FILIALE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FILIALE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ORA"));
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

/**
 * RecapitoMITT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class RecapitoMITT  implements java.io.Serializable {
    private java.lang.String CAP;

    private int CODICE;

    private java.lang.String INDIRIZZO;

    private java.lang.String LOCALITA;

    private java.lang.String RAGIONE_SOCIALE;

    private java.lang.String SIGLA_AREA;

    public RecapitoMITT() {
    }

    public RecapitoMITT(
           java.lang.String CAP,
           int CODICE,
           java.lang.String INDIRIZZO,
           java.lang.String LOCALITA,
           java.lang.String RAGIONE_SOCIALE,
           java.lang.String SIGLA_AREA) {
           this.CAP = CAP;
           this.CODICE = CODICE;
           this.INDIRIZZO = INDIRIZZO;
           this.LOCALITA = LOCALITA;
           this.RAGIONE_SOCIALE = RAGIONE_SOCIALE;
           this.SIGLA_AREA = SIGLA_AREA;
    }


    /**
     * Gets the CAP value for this RecapitoMITT.
     * 
     * @return CAP
     */
    public java.lang.String getCAP() {
        return CAP;
    }


    /**
     * Sets the CAP value for this RecapitoMITT.
     * 
     * @param CAP
     */
    public void setCAP(java.lang.String CAP) {
        this.CAP = CAP;
    }


    /**
     * Gets the CODICE value for this RecapitoMITT.
     * 
     * @return CODICE
     */
    public int getCODICE() {
        return CODICE;
    }


    /**
     * Sets the CODICE value for this RecapitoMITT.
     * 
     * @param CODICE
     */
    public void setCODICE(int CODICE) {
        this.CODICE = CODICE;
    }


    /**
     * Gets the INDIRIZZO value for this RecapitoMITT.
     * 
     * @return INDIRIZZO
     */
    public java.lang.String getINDIRIZZO() {
        return INDIRIZZO;
    }


    /**
     * Sets the INDIRIZZO value for this RecapitoMITT.
     * 
     * @param INDIRIZZO
     */
    public void setINDIRIZZO(java.lang.String INDIRIZZO) {
        this.INDIRIZZO = INDIRIZZO;
    }


    /**
     * Gets the LOCALITA value for this RecapitoMITT.
     * 
     * @return LOCALITA
     */
    public java.lang.String getLOCALITA() {
        return LOCALITA;
    }


    /**
     * Sets the LOCALITA value for this RecapitoMITT.
     * 
     * @param LOCALITA
     */
    public void setLOCALITA(java.lang.String LOCALITA) {
        this.LOCALITA = LOCALITA;
    }


    /**
     * Gets the RAGIONE_SOCIALE value for this RecapitoMITT.
     * 
     * @return RAGIONE_SOCIALE
     */
    public java.lang.String getRAGIONE_SOCIALE() {
        return RAGIONE_SOCIALE;
    }


    /**
     * Sets the RAGIONE_SOCIALE value for this RecapitoMITT.
     * 
     * @param RAGIONE_SOCIALE
     */
    public void setRAGIONE_SOCIALE(java.lang.String RAGIONE_SOCIALE) {
        this.RAGIONE_SOCIALE = RAGIONE_SOCIALE;
    }


    /**
     * Gets the SIGLA_AREA value for this RecapitoMITT.
     * 
     * @return SIGLA_AREA
     */
    public java.lang.String getSIGLA_AREA() {
        return SIGLA_AREA;
    }


    /**
     * Sets the SIGLA_AREA value for this RecapitoMITT.
     * 
     * @param SIGLA_AREA
     */
    public void setSIGLA_AREA(java.lang.String SIGLA_AREA) {
        this.SIGLA_AREA = SIGLA_AREA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecapitoMITT)) return false;
        RecapitoMITT other = (RecapitoMITT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CAP==null && other.getCAP()==null) || 
             (this.CAP!=null &&
              this.CAP.equals(other.getCAP()))) &&
            this.CODICE == other.getCODICE() &&
            ((this.INDIRIZZO==null && other.getINDIRIZZO()==null) || 
             (this.INDIRIZZO!=null &&
              this.INDIRIZZO.equals(other.getINDIRIZZO()))) &&
            ((this.LOCALITA==null && other.getLOCALITA()==null) || 
             (this.LOCALITA!=null &&
              this.LOCALITA.equals(other.getLOCALITA()))) &&
            ((this.RAGIONE_SOCIALE==null && other.getRAGIONE_SOCIALE()==null) || 
             (this.RAGIONE_SOCIALE!=null &&
              this.RAGIONE_SOCIALE.equals(other.getRAGIONE_SOCIALE()))) &&
            ((this.SIGLA_AREA==null && other.getSIGLA_AREA()==null) || 
             (this.SIGLA_AREA!=null &&
              this.SIGLA_AREA.equals(other.getSIGLA_AREA())));
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
        if (getCAP() != null) {
            _hashCode += getCAP().hashCode();
        }
        _hashCode += getCODICE();
        if (getINDIRIZZO() != null) {
            _hashCode += getINDIRIZZO().hashCode();
        }
        if (getLOCALITA() != null) {
            _hashCode += getLOCALITA().hashCode();
        }
        if (getRAGIONE_SOCIALE() != null) {
            _hashCode += getRAGIONE_SOCIALE().hashCode();
        }
        if (getSIGLA_AREA() != null) {
            _hashCode += getSIGLA_AREA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecapitoMITT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "recapitoMITT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODICE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDIRIZZO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDIRIZZO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCALITA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOCALITA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RAGIONE_SOCIALE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RAGIONE_SOCIALE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGLA_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIGLA_AREA"));
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

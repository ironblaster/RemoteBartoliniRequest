/**
 * BrtTRACKINGBYBRTSHIPMENTIDResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class BrtTRACKINGBYBRTSHIPMENTIDResult  implements java.io.Serializable {
    private iseries.wsbeans.brt_trackingbybrtshipmentid.Spedizione BOLLA;

    private int CONTATORE_EVENTI;

    private int CONTATORE_NOTE;

    private int ESITO;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi[] LISTA_EVENTI;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.Note[] LISTA_NOTE;

    private java.lang.String RISPOSTA_TIMESTAMP;

    private int VERSIONE;

    public BrtTRACKINGBYBRTSHIPMENTIDResult() {
    }

    public BrtTRACKINGBYBRTSHIPMENTIDResult(
           iseries.wsbeans.brt_trackingbybrtshipmentid.Spedizione BOLLA,
           int CONTATORE_EVENTI,
           int CONTATORE_NOTE,
           int ESITO,
           iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi[] LISTA_EVENTI,
           iseries.wsbeans.brt_trackingbybrtshipmentid.Note[] LISTA_NOTE,
           java.lang.String RISPOSTA_TIMESTAMP,
           int VERSIONE) {
           this.BOLLA = BOLLA;
           this.CONTATORE_EVENTI = CONTATORE_EVENTI;
           this.CONTATORE_NOTE = CONTATORE_NOTE;
           this.ESITO = ESITO;
           this.LISTA_EVENTI = LISTA_EVENTI;
           this.LISTA_NOTE = LISTA_NOTE;
           this.RISPOSTA_TIMESTAMP = RISPOSTA_TIMESTAMP;
           this.VERSIONE = VERSIONE;
    }


    /**
     * Gets the BOLLA value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return BOLLA
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Spedizione getBOLLA() {
        return BOLLA;
    }


    /**
     * Sets the BOLLA value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param BOLLA
     */
    public void setBOLLA(iseries.wsbeans.brt_trackingbybrtshipmentid.Spedizione BOLLA) {
        this.BOLLA = BOLLA;
    }


    /**
     * Gets the CONTATORE_EVENTI value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return CONTATORE_EVENTI
     */
    public int getCONTATORE_EVENTI() {
        return CONTATORE_EVENTI;
    }


    /**
     * Sets the CONTATORE_EVENTI value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param CONTATORE_EVENTI
     */
    public void setCONTATORE_EVENTI(int CONTATORE_EVENTI) {
        this.CONTATORE_EVENTI = CONTATORE_EVENTI;
    }


    /**
     * Gets the CONTATORE_NOTE value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return CONTATORE_NOTE
     */
    public int getCONTATORE_NOTE() {
        return CONTATORE_NOTE;
    }


    /**
     * Sets the CONTATORE_NOTE value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param CONTATORE_NOTE
     */
    public void setCONTATORE_NOTE(int CONTATORE_NOTE) {
        this.CONTATORE_NOTE = CONTATORE_NOTE;
    }


    /**
     * Gets the ESITO value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return ESITO
     */
    public int getESITO() {
        return ESITO;
    }


    /**
     * Sets the ESITO value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param ESITO
     */
    public void setESITO(int ESITO) {
        this.ESITO = ESITO;
    }


    /**
     * Gets the LISTA_EVENTI value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return LISTA_EVENTI
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi[] getLISTA_EVENTI() {
        return LISTA_EVENTI;
    }


    /**
     * Sets the LISTA_EVENTI value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param LISTA_EVENTI
     */
    public void setLISTA_EVENTI(iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi[] LISTA_EVENTI) {
        this.LISTA_EVENTI = LISTA_EVENTI;
    }

    public iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi getLISTA_EVENTI(int i) {
        return this.LISTA_EVENTI[i];
    }

    public void setLISTA_EVENTI(int i, iseries.wsbeans.brt_trackingbybrtshipmentid.Eventi _value) {
        this.LISTA_EVENTI[i] = _value;
    }


    /**
     * Gets the LISTA_NOTE value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return LISTA_NOTE
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Note[] getLISTA_NOTE() {
        return LISTA_NOTE;
    }


    /**
     * Sets the LISTA_NOTE value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param LISTA_NOTE
     */
    public void setLISTA_NOTE(iseries.wsbeans.brt_trackingbybrtshipmentid.Note[] LISTA_NOTE) {
        this.LISTA_NOTE = LISTA_NOTE;
    }

    public iseries.wsbeans.brt_trackingbybrtshipmentid.Note getLISTA_NOTE(int i) {
        return this.LISTA_NOTE[i];
    }

    public void setLISTA_NOTE(int i, iseries.wsbeans.brt_trackingbybrtshipmentid.Note _value) {
        this.LISTA_NOTE[i] = _value;
    }


    /**
     * Gets the RISPOSTA_TIMESTAMP value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return RISPOSTA_TIMESTAMP
     */
    public java.lang.String getRISPOSTA_TIMESTAMP() {
        return RISPOSTA_TIMESTAMP;
    }


    /**
     * Sets the RISPOSTA_TIMESTAMP value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param RISPOSTA_TIMESTAMP
     */
    public void setRISPOSTA_TIMESTAMP(java.lang.String RISPOSTA_TIMESTAMP) {
        this.RISPOSTA_TIMESTAMP = RISPOSTA_TIMESTAMP;
    }


    /**
     * Gets the VERSIONE value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @return VERSIONE
     */
    public int getVERSIONE() {
        return VERSIONE;
    }


    /**
     * Sets the VERSIONE value for this BrtTRACKINGBYBRTSHIPMENTIDResult.
     * 
     * @param VERSIONE
     */
    public void setVERSIONE(int VERSIONE) {
        this.VERSIONE = VERSIONE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrtTRACKINGBYBRTSHIPMENTIDResult)) return false;
        BrtTRACKINGBYBRTSHIPMENTIDResult other = (BrtTRACKINGBYBRTSHIPMENTIDResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BOLLA==null && other.getBOLLA()==null) || 
             (this.BOLLA!=null &&
              this.BOLLA.equals(other.getBOLLA()))) &&
            this.CONTATORE_EVENTI == other.getCONTATORE_EVENTI() &&
            this.CONTATORE_NOTE == other.getCONTATORE_NOTE() &&
            this.ESITO == other.getESITO() &&
            ((this.LISTA_EVENTI==null && other.getLISTA_EVENTI()==null) || 
             (this.LISTA_EVENTI!=null &&
              java.util.Arrays.equals(this.LISTA_EVENTI, other.getLISTA_EVENTI()))) &&
            ((this.LISTA_NOTE==null && other.getLISTA_NOTE()==null) || 
             (this.LISTA_NOTE!=null &&
              java.util.Arrays.equals(this.LISTA_NOTE, other.getLISTA_NOTE()))) &&
            ((this.RISPOSTA_TIMESTAMP==null && other.getRISPOSTA_TIMESTAMP()==null) || 
             (this.RISPOSTA_TIMESTAMP!=null &&
              this.RISPOSTA_TIMESTAMP.equals(other.getRISPOSTA_TIMESTAMP()))) &&
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
        if (getBOLLA() != null) {
            _hashCode += getBOLLA().hashCode();
        }
        _hashCode += getCONTATORE_EVENTI();
        _hashCode += getCONTATORE_NOTE();
        _hashCode += getESITO();
        if (getLISTA_EVENTI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLISTA_EVENTI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLISTA_EVENTI(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLISTA_NOTE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLISTA_NOTE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLISTA_NOTE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRISPOSTA_TIMESTAMP() != null) {
            _hashCode += getRISPOSTA_TIMESTAMP().hashCode();
        }
        _hashCode += getVERSIONE();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrtTRACKINGBYBRTSHIPMENTIDResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "brtTRACKINGBYBRTSHIPMENTIDResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BOLLA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BOLLA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "spedizione"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTATORE_EVENTI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTATORE_EVENTI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTATORE_NOTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTATORE_NOTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESITO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESITO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LISTA_EVENTI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LISTA_EVENTI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "eventi"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LISTA_NOTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LISTA_NOTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "note"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISPOSTA_TIMESTAMP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RISPOSTA_TIMESTAMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

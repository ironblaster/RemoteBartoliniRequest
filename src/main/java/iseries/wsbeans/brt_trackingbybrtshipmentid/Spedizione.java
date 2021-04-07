/**
 * Spedizione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Spedizione  implements java.io.Serializable {
    private iseries.wsbeans.brt_trackingbybrtshipmentid.Assicurazione ASSICURAZIONE;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.Contrassegno CONTRASSEGNO;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.DatiCONSEGNA DATI_CONSEGNA;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.DatiSPEDIZIONE DATI_SPEDIZIONE;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoDEST DESTINATARIO;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.Merce MERCE;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoMITT MITTENTE;

    private iseries.wsbeans.brt_trackingbybrtshipmentid.Riferimenti RIFERIMENTI;

    public Spedizione() {
    }

    public Spedizione(
           iseries.wsbeans.brt_trackingbybrtshipmentid.Assicurazione ASSICURAZIONE,
           iseries.wsbeans.brt_trackingbybrtshipmentid.Contrassegno CONTRASSEGNO,
           iseries.wsbeans.brt_trackingbybrtshipmentid.DatiCONSEGNA DATI_CONSEGNA,
           iseries.wsbeans.brt_trackingbybrtshipmentid.DatiSPEDIZIONE DATI_SPEDIZIONE,
           iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoDEST DESTINATARIO,
           iseries.wsbeans.brt_trackingbybrtshipmentid.Merce MERCE,
           iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoMITT MITTENTE,
           iseries.wsbeans.brt_trackingbybrtshipmentid.Riferimenti RIFERIMENTI) {
           this.ASSICURAZIONE = ASSICURAZIONE;
           this.CONTRASSEGNO = CONTRASSEGNO;
           this.DATI_CONSEGNA = DATI_CONSEGNA;
           this.DATI_SPEDIZIONE = DATI_SPEDIZIONE;
           this.DESTINATARIO = DESTINATARIO;
           this.MERCE = MERCE;
           this.MITTENTE = MITTENTE;
           this.RIFERIMENTI = RIFERIMENTI;
    }


    /**
     * Gets the ASSICURAZIONE value for this Spedizione.
     * 
     * @return ASSICURAZIONE
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Assicurazione getASSICURAZIONE() {
        return ASSICURAZIONE;
    }


    /**
     * Sets the ASSICURAZIONE value for this Spedizione.
     * 
     * @param ASSICURAZIONE
     */
    public void setASSICURAZIONE(iseries.wsbeans.brt_trackingbybrtshipmentid.Assicurazione ASSICURAZIONE) {
        this.ASSICURAZIONE = ASSICURAZIONE;
    }


    /**
     * Gets the CONTRASSEGNO value for this Spedizione.
     * 
     * @return CONTRASSEGNO
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Contrassegno getCONTRASSEGNO() {
        return CONTRASSEGNO;
    }


    /**
     * Sets the CONTRASSEGNO value for this Spedizione.
     * 
     * @param CONTRASSEGNO
     */
    public void setCONTRASSEGNO(iseries.wsbeans.brt_trackingbybrtshipmentid.Contrassegno CONTRASSEGNO) {
        this.CONTRASSEGNO = CONTRASSEGNO;
    }


    /**
     * Gets the DATI_CONSEGNA value for this Spedizione.
     * 
     * @return DATI_CONSEGNA
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.DatiCONSEGNA getDATI_CONSEGNA() {
        return DATI_CONSEGNA;
    }


    /**
     * Sets the DATI_CONSEGNA value for this Spedizione.
     * 
     * @param DATI_CONSEGNA
     */
    public void setDATI_CONSEGNA(iseries.wsbeans.brt_trackingbybrtshipmentid.DatiCONSEGNA DATI_CONSEGNA) {
        this.DATI_CONSEGNA = DATI_CONSEGNA;
    }


    /**
     * Gets the DATI_SPEDIZIONE value for this Spedizione.
     * 
     * @return DATI_SPEDIZIONE
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.DatiSPEDIZIONE getDATI_SPEDIZIONE() {
        return DATI_SPEDIZIONE;
    }


    /**
     * Sets the DATI_SPEDIZIONE value for this Spedizione.
     * 
     * @param DATI_SPEDIZIONE
     */
    public void setDATI_SPEDIZIONE(iseries.wsbeans.brt_trackingbybrtshipmentid.DatiSPEDIZIONE DATI_SPEDIZIONE) {
        this.DATI_SPEDIZIONE = DATI_SPEDIZIONE;
    }


    /**
     * Gets the DESTINATARIO value for this Spedizione.
     * 
     * @return DESTINATARIO
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoDEST getDESTINATARIO() {
        return DESTINATARIO;
    }


    /**
     * Sets the DESTINATARIO value for this Spedizione.
     * 
     * @param DESTINATARIO
     */
    public void setDESTINATARIO(iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoDEST DESTINATARIO) {
        this.DESTINATARIO = DESTINATARIO;
    }


    /**
     * Gets the MERCE value for this Spedizione.
     * 
     * @return MERCE
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Merce getMERCE() {
        return MERCE;
    }


    /**
     * Sets the MERCE value for this Spedizione.
     * 
     * @param MERCE
     */
    public void setMERCE(iseries.wsbeans.brt_trackingbybrtshipmentid.Merce MERCE) {
        this.MERCE = MERCE;
    }


    /**
     * Gets the MITTENTE value for this Spedizione.
     * 
     * @return MITTENTE
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoMITT getMITTENTE() {
        return MITTENTE;
    }


    /**
     * Sets the MITTENTE value for this Spedizione.
     * 
     * @param MITTENTE
     */
    public void setMITTENTE(iseries.wsbeans.brt_trackingbybrtshipmentid.RecapitoMITT MITTENTE) {
        this.MITTENTE = MITTENTE;
    }


    /**
     * Gets the RIFERIMENTI value for this Spedizione.
     * 
     * @return RIFERIMENTI
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Riferimenti getRIFERIMENTI() {
        return RIFERIMENTI;
    }


    /**
     * Sets the RIFERIMENTI value for this Spedizione.
     * 
     * @param RIFERIMENTI
     */
    public void setRIFERIMENTI(iseries.wsbeans.brt_trackingbybrtshipmentid.Riferimenti RIFERIMENTI) {
        this.RIFERIMENTI = RIFERIMENTI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Spedizione)) return false;
        Spedizione other = (Spedizione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ASSICURAZIONE==null && other.getASSICURAZIONE()==null) || 
             (this.ASSICURAZIONE!=null &&
              this.ASSICURAZIONE.equals(other.getASSICURAZIONE()))) &&
            ((this.CONTRASSEGNO==null && other.getCONTRASSEGNO()==null) || 
             (this.CONTRASSEGNO!=null &&
              this.CONTRASSEGNO.equals(other.getCONTRASSEGNO()))) &&
            ((this.DATI_CONSEGNA==null && other.getDATI_CONSEGNA()==null) || 
             (this.DATI_CONSEGNA!=null &&
              this.DATI_CONSEGNA.equals(other.getDATI_CONSEGNA()))) &&
            ((this.DATI_SPEDIZIONE==null && other.getDATI_SPEDIZIONE()==null) || 
             (this.DATI_SPEDIZIONE!=null &&
              this.DATI_SPEDIZIONE.equals(other.getDATI_SPEDIZIONE()))) &&
            ((this.DESTINATARIO==null && other.getDESTINATARIO()==null) || 
             (this.DESTINATARIO!=null &&
              this.DESTINATARIO.equals(other.getDESTINATARIO()))) &&
            ((this.MERCE==null && other.getMERCE()==null) || 
             (this.MERCE!=null &&
              this.MERCE.equals(other.getMERCE()))) &&
            ((this.MITTENTE==null && other.getMITTENTE()==null) || 
             (this.MITTENTE!=null &&
              this.MITTENTE.equals(other.getMITTENTE()))) &&
            ((this.RIFERIMENTI==null && other.getRIFERIMENTI()==null) || 
             (this.RIFERIMENTI!=null &&
              this.RIFERIMENTI.equals(other.getRIFERIMENTI())));
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
        if (getASSICURAZIONE() != null) {
            _hashCode += getASSICURAZIONE().hashCode();
        }
        if (getCONTRASSEGNO() != null) {
            _hashCode += getCONTRASSEGNO().hashCode();
        }
        if (getDATI_CONSEGNA() != null) {
            _hashCode += getDATI_CONSEGNA().hashCode();
        }
        if (getDATI_SPEDIZIONE() != null) {
            _hashCode += getDATI_SPEDIZIONE().hashCode();
        }
        if (getDESTINATARIO() != null) {
            _hashCode += getDESTINATARIO().hashCode();
        }
        if (getMERCE() != null) {
            _hashCode += getMERCE().hashCode();
        }
        if (getMITTENTE() != null) {
            _hashCode += getMITTENTE().hashCode();
        }
        if (getRIFERIMENTI() != null) {
            _hashCode += getRIFERIMENTI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Spedizione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "spedizione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSICURAZIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ASSICURAZIONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "assicurazione"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRASSEGNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRASSEGNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "contrassegno"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATI_CONSEGNA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATI_CONSEGNA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "datiCONSEGNA"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATI_SPEDIZIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATI_SPEDIZIONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "datiSPEDIZIONE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESTINATARIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESTINATARIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "recapitoDEST"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MERCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "merce"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MITTENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MITTENTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "recapitoMITT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIFERIMENTI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIFERIMENTI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "riferimenti"));
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

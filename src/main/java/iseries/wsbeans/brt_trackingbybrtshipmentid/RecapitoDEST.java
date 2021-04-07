/**
 * RecapitoDEST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class RecapitoDEST  implements java.io.Serializable {
    private java.lang.String CAP;

    private java.lang.String INDIRIZZO;

    private java.lang.String LOCALITA;

    private java.lang.String RAGIONE_SOCIALE;

    private java.lang.String REFERENTE_CONSEGNA;

    private java.lang.String SIGLA_NAZIONE;

    private java.lang.String SIGLA_PROVINCIA;

    private java.lang.String TELEFONO_REFERENTE;

    public RecapitoDEST() {
    }

    public RecapitoDEST(
           java.lang.String CAP,
           java.lang.String INDIRIZZO,
           java.lang.String LOCALITA,
           java.lang.String RAGIONE_SOCIALE,
           java.lang.String REFERENTE_CONSEGNA,
           java.lang.String SIGLA_NAZIONE,
           java.lang.String SIGLA_PROVINCIA,
           java.lang.String TELEFONO_REFERENTE) {
           this.CAP = CAP;
           this.INDIRIZZO = INDIRIZZO;
           this.LOCALITA = LOCALITA;
           this.RAGIONE_SOCIALE = RAGIONE_SOCIALE;
           this.REFERENTE_CONSEGNA = REFERENTE_CONSEGNA;
           this.SIGLA_NAZIONE = SIGLA_NAZIONE;
           this.SIGLA_PROVINCIA = SIGLA_PROVINCIA;
           this.TELEFONO_REFERENTE = TELEFONO_REFERENTE;
    }


    /**
     * Gets the CAP value for this RecapitoDEST.
     * 
     * @return CAP
     */
    public java.lang.String getCAP() {
        return CAP;
    }


    /**
     * Sets the CAP value for this RecapitoDEST.
     * 
     * @param CAP
     */
    public void setCAP(java.lang.String CAP) {
        this.CAP = CAP;
    }


    /**
     * Gets the INDIRIZZO value for this RecapitoDEST.
     * 
     * @return INDIRIZZO
     */
    public java.lang.String getINDIRIZZO() {
        return INDIRIZZO;
    }


    /**
     * Sets the INDIRIZZO value for this RecapitoDEST.
     * 
     * @param INDIRIZZO
     */
    public void setINDIRIZZO(java.lang.String INDIRIZZO) {
        this.INDIRIZZO = INDIRIZZO;
    }


    /**
     * Gets the LOCALITA value for this RecapitoDEST.
     * 
     * @return LOCALITA
     */
    public java.lang.String getLOCALITA() {
        return LOCALITA;
    }


    /**
     * Sets the LOCALITA value for this RecapitoDEST.
     * 
     * @param LOCALITA
     */
    public void setLOCALITA(java.lang.String LOCALITA) {
        this.LOCALITA = LOCALITA;
    }


    /**
     * Gets the RAGIONE_SOCIALE value for this RecapitoDEST.
     * 
     * @return RAGIONE_SOCIALE
     */
    public java.lang.String getRAGIONE_SOCIALE() {
        return RAGIONE_SOCIALE;
    }


    /**
     * Sets the RAGIONE_SOCIALE value for this RecapitoDEST.
     * 
     * @param RAGIONE_SOCIALE
     */
    public void setRAGIONE_SOCIALE(java.lang.String RAGIONE_SOCIALE) {
        this.RAGIONE_SOCIALE = RAGIONE_SOCIALE;
    }


    /**
     * Gets the REFERENTE_CONSEGNA value for this RecapitoDEST.
     * 
     * @return REFERENTE_CONSEGNA
     */
    public java.lang.String getREFERENTE_CONSEGNA() {
        return REFERENTE_CONSEGNA;
    }


    /**
     * Sets the REFERENTE_CONSEGNA value for this RecapitoDEST.
     * 
     * @param REFERENTE_CONSEGNA
     */
    public void setREFERENTE_CONSEGNA(java.lang.String REFERENTE_CONSEGNA) {
        this.REFERENTE_CONSEGNA = REFERENTE_CONSEGNA;
    }


    /**
     * Gets the SIGLA_NAZIONE value for this RecapitoDEST.
     * 
     * @return SIGLA_NAZIONE
     */
    public java.lang.String getSIGLA_NAZIONE() {
        return SIGLA_NAZIONE;
    }


    /**
     * Sets the SIGLA_NAZIONE value for this RecapitoDEST.
     * 
     * @param SIGLA_NAZIONE
     */
    public void setSIGLA_NAZIONE(java.lang.String SIGLA_NAZIONE) {
        this.SIGLA_NAZIONE = SIGLA_NAZIONE;
    }


    /**
     * Gets the SIGLA_PROVINCIA value for this RecapitoDEST.
     * 
     * @return SIGLA_PROVINCIA
     */
    public java.lang.String getSIGLA_PROVINCIA() {
        return SIGLA_PROVINCIA;
    }


    /**
     * Sets the SIGLA_PROVINCIA value for this RecapitoDEST.
     * 
     * @param SIGLA_PROVINCIA
     */
    public void setSIGLA_PROVINCIA(java.lang.String SIGLA_PROVINCIA) {
        this.SIGLA_PROVINCIA = SIGLA_PROVINCIA;
    }


    /**
     * Gets the TELEFONO_REFERENTE value for this RecapitoDEST.
     * 
     * @return TELEFONO_REFERENTE
     */
    public java.lang.String getTELEFONO_REFERENTE() {
        return TELEFONO_REFERENTE;
    }


    /**
     * Sets the TELEFONO_REFERENTE value for this RecapitoDEST.
     * 
     * @param TELEFONO_REFERENTE
     */
    public void setTELEFONO_REFERENTE(java.lang.String TELEFONO_REFERENTE) {
        this.TELEFONO_REFERENTE = TELEFONO_REFERENTE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecapitoDEST)) return false;
        RecapitoDEST other = (RecapitoDEST) obj;
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
            ((this.INDIRIZZO==null && other.getINDIRIZZO()==null) || 
             (this.INDIRIZZO!=null &&
              this.INDIRIZZO.equals(other.getINDIRIZZO()))) &&
            ((this.LOCALITA==null && other.getLOCALITA()==null) || 
             (this.LOCALITA!=null &&
              this.LOCALITA.equals(other.getLOCALITA()))) &&
            ((this.RAGIONE_SOCIALE==null && other.getRAGIONE_SOCIALE()==null) || 
             (this.RAGIONE_SOCIALE!=null &&
              this.RAGIONE_SOCIALE.equals(other.getRAGIONE_SOCIALE()))) &&
            ((this.REFERENTE_CONSEGNA==null && other.getREFERENTE_CONSEGNA()==null) || 
             (this.REFERENTE_CONSEGNA!=null &&
              this.REFERENTE_CONSEGNA.equals(other.getREFERENTE_CONSEGNA()))) &&
            ((this.SIGLA_NAZIONE==null && other.getSIGLA_NAZIONE()==null) || 
             (this.SIGLA_NAZIONE!=null &&
              this.SIGLA_NAZIONE.equals(other.getSIGLA_NAZIONE()))) &&
            ((this.SIGLA_PROVINCIA==null && other.getSIGLA_PROVINCIA()==null) || 
             (this.SIGLA_PROVINCIA!=null &&
              this.SIGLA_PROVINCIA.equals(other.getSIGLA_PROVINCIA()))) &&
            ((this.TELEFONO_REFERENTE==null && other.getTELEFONO_REFERENTE()==null) || 
             (this.TELEFONO_REFERENTE!=null &&
              this.TELEFONO_REFERENTE.equals(other.getTELEFONO_REFERENTE())));
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
        if (getINDIRIZZO() != null) {
            _hashCode += getINDIRIZZO().hashCode();
        }
        if (getLOCALITA() != null) {
            _hashCode += getLOCALITA().hashCode();
        }
        if (getRAGIONE_SOCIALE() != null) {
            _hashCode += getRAGIONE_SOCIALE().hashCode();
        }
        if (getREFERENTE_CONSEGNA() != null) {
            _hashCode += getREFERENTE_CONSEGNA().hashCode();
        }
        if (getSIGLA_NAZIONE() != null) {
            _hashCode += getSIGLA_NAZIONE().hashCode();
        }
        if (getSIGLA_PROVINCIA() != null) {
            _hashCode += getSIGLA_PROVINCIA().hashCode();
        }
        if (getTELEFONO_REFERENTE() != null) {
            _hashCode += getTELEFONO_REFERENTE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecapitoDEST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "recapitoDEST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("REFERENTE_CONSEGNA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REFERENTE_CONSEGNA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGLA_NAZIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIGLA_NAZIONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGLA_PROVINCIA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIGLA_PROVINCIA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELEFONO_REFERENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELEFONO_REFERENTE"));
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

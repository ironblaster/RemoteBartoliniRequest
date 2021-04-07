/**
 * BrtTRACKINGBYBRTSHIPMENTIDInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class BrtTRACKINGBYBRTSHIPMENTIDInput  implements java.io.Serializable {
    private java.lang.String LINGUA_ISO639_ALPHA2;

    private java.lang.String SPEDIZIONE_ANNO;

    private java.lang.String SPEDIZIONE_BRT_ID;

    public BrtTRACKINGBYBRTSHIPMENTIDInput() {
    }

    public BrtTRACKINGBYBRTSHIPMENTIDInput(
           java.lang.String LINGUA_ISO639_ALPHA2,
           java.lang.String SPEDIZIONE_ANNO,
           java.lang.String SPEDIZIONE_BRT_ID) {
           this.LINGUA_ISO639_ALPHA2 = LINGUA_ISO639_ALPHA2;
           this.SPEDIZIONE_ANNO = SPEDIZIONE_ANNO;
           this.SPEDIZIONE_BRT_ID = SPEDIZIONE_BRT_ID;
    }


    /**
     * Gets the LINGUA_ISO639_ALPHA2 value for this BrtTRACKINGBYBRTSHIPMENTIDInput.
     * 
     * @return LINGUA_ISO639_ALPHA2
     */
    public java.lang.String getLINGUA_ISO639_ALPHA2() {
        return LINGUA_ISO639_ALPHA2;
    }


    /**
     * Sets the LINGUA_ISO639_ALPHA2 value for this BrtTRACKINGBYBRTSHIPMENTIDInput.
     * 
     * @param LINGUA_ISO639_ALPHA2
     */
    public void setLINGUA_ISO639_ALPHA2(java.lang.String LINGUA_ISO639_ALPHA2) {
        this.LINGUA_ISO639_ALPHA2 = LINGUA_ISO639_ALPHA2;
    }


    /**
     * Gets the SPEDIZIONE_ANNO value for this BrtTRACKINGBYBRTSHIPMENTIDInput.
     * 
     * @return SPEDIZIONE_ANNO
     */
    public java.lang.String getSPEDIZIONE_ANNO() {
        return SPEDIZIONE_ANNO;
    }


    /**
     * Sets the SPEDIZIONE_ANNO value for this BrtTRACKINGBYBRTSHIPMENTIDInput.
     * 
     * @param SPEDIZIONE_ANNO
     */
    public void setSPEDIZIONE_ANNO(java.lang.String SPEDIZIONE_ANNO) {
        this.SPEDIZIONE_ANNO = SPEDIZIONE_ANNO;
    }


    /**
     * Gets the SPEDIZIONE_BRT_ID value for this BrtTRACKINGBYBRTSHIPMENTIDInput.
     * 
     * @return SPEDIZIONE_BRT_ID
     */
    public java.lang.String getSPEDIZIONE_BRT_ID() {
        return SPEDIZIONE_BRT_ID;
    }


    /**
     * Sets the SPEDIZIONE_BRT_ID value for this BrtTRACKINGBYBRTSHIPMENTIDInput.
     * 
     * @param SPEDIZIONE_BRT_ID
     */
    public void setSPEDIZIONE_BRT_ID(java.lang.String SPEDIZIONE_BRT_ID) {
        this.SPEDIZIONE_BRT_ID = SPEDIZIONE_BRT_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrtTRACKINGBYBRTSHIPMENTIDInput)) return false;
        BrtTRACKINGBYBRTSHIPMENTIDInput other = (BrtTRACKINGBYBRTSHIPMENTIDInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LINGUA_ISO639_ALPHA2==null && other.getLINGUA_ISO639_ALPHA2()==null) || 
             (this.LINGUA_ISO639_ALPHA2!=null &&
              this.LINGUA_ISO639_ALPHA2.equals(other.getLINGUA_ISO639_ALPHA2()))) &&
            ((this.SPEDIZIONE_ANNO==null && other.getSPEDIZIONE_ANNO()==null) || 
             (this.SPEDIZIONE_ANNO!=null &&
              this.SPEDIZIONE_ANNO.equals(other.getSPEDIZIONE_ANNO()))) &&
            ((this.SPEDIZIONE_BRT_ID==null && other.getSPEDIZIONE_BRT_ID()==null) || 
             (this.SPEDIZIONE_BRT_ID!=null &&
              this.SPEDIZIONE_BRT_ID.equals(other.getSPEDIZIONE_BRT_ID())));
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
        if (getLINGUA_ISO639_ALPHA2() != null) {
            _hashCode += getLINGUA_ISO639_ALPHA2().hashCode();
        }
        if (getSPEDIZIONE_ANNO() != null) {
            _hashCode += getSPEDIZIONE_ANNO().hashCode();
        }
        if (getSPEDIZIONE_BRT_ID() != null) {
            _hashCode += getSPEDIZIONE_BRT_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrtTRACKINGBYBRTSHIPMENTIDInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "brtTRACKINGBYBRTSHIPMENTIDInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINGUA_ISO639_ALPHA2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LINGUA_ISO639_ALPHA2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPEDIZIONE_ANNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPEDIZIONE_ANNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPEDIZIONE_BRT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPEDIZIONE_BRT_ID"));
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

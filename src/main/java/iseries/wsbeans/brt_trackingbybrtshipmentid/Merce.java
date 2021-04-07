/**
 * Merce.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Merce  implements java.io.Serializable {
    private int COLLI;

    private java.lang.String NATURA_MERCE;

    private float PESO_KG;

    private float VOLUME_M3;

    public Merce() {
    }

    public Merce(
           int COLLI,
           java.lang.String NATURA_MERCE,
           float PESO_KG,
           float VOLUME_M3) {
           this.COLLI = COLLI;
           this.NATURA_MERCE = NATURA_MERCE;
           this.PESO_KG = PESO_KG;
           this.VOLUME_M3 = VOLUME_M3;
    }


    /**
     * Gets the COLLI value for this Merce.
     * 
     * @return COLLI
     */
    public int getCOLLI() {
        return COLLI;
    }


    /**
     * Sets the COLLI value for this Merce.
     * 
     * @param COLLI
     */
    public void setCOLLI(int COLLI) {
        this.COLLI = COLLI;
    }


    /**
     * Gets the NATURA_MERCE value for this Merce.
     * 
     * @return NATURA_MERCE
     */
    public java.lang.String getNATURA_MERCE() {
        return NATURA_MERCE;
    }


    /**
     * Sets the NATURA_MERCE value for this Merce.
     * 
     * @param NATURA_MERCE
     */
    public void setNATURA_MERCE(java.lang.String NATURA_MERCE) {
        this.NATURA_MERCE = NATURA_MERCE;
    }


    /**
     * Gets the PESO_KG value for this Merce.
     * 
     * @return PESO_KG
     */
    public float getPESO_KG() {
        return PESO_KG;
    }


    /**
     * Sets the PESO_KG value for this Merce.
     * 
     * @param PESO_KG
     */
    public void setPESO_KG(float PESO_KG) {
        this.PESO_KG = PESO_KG;
    }


    /**
     * Gets the VOLUME_M3 value for this Merce.
     * 
     * @return VOLUME_M3
     */
    public float getVOLUME_M3() {
        return VOLUME_M3;
    }


    /**
     * Sets the VOLUME_M3 value for this Merce.
     * 
     * @param VOLUME_M3
     */
    public void setVOLUME_M3(float VOLUME_M3) {
        this.VOLUME_M3 = VOLUME_M3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Merce)) return false;
        Merce other = (Merce) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.COLLI == other.getCOLLI() &&
            ((this.NATURA_MERCE==null && other.getNATURA_MERCE()==null) || 
             (this.NATURA_MERCE!=null &&
              this.NATURA_MERCE.equals(other.getNATURA_MERCE()))) &&
            this.PESO_KG == other.getPESO_KG() &&
            this.VOLUME_M3 == other.getVOLUME_M3();
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
        _hashCode += getCOLLI();
        if (getNATURA_MERCE() != null) {
            _hashCode += getNATURA_MERCE().hashCode();
        }
        _hashCode += new Float(getPESO_KG()).hashCode();
        _hashCode += new Float(getVOLUME_M3()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Merce.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "merce"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COLLI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COLLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NATURA_MERCE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NATURA_MERCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PESO_KG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PESO_KG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VOLUME_M3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VOLUME_M3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

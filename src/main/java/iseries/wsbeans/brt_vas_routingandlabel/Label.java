/**
 * Label.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class Label  implements java.io.Serializable {
    private int dataLength;

    private java.lang.String[] BRTfullParcelID;

    private java.lang.String data;

    public Label() {
    }

    public Label(
           int dataLength,
           java.lang.String[] BRTfullParcelID,
           java.lang.String data) {
           this.dataLength = dataLength;
           this.BRTfullParcelID = BRTfullParcelID;
           this.data = data;
    }


    /**
     * Gets the dataLength value for this Label.
     * 
     * @return dataLength
     */
    public int getDataLength() {
        return dataLength;
    }


    /**
     * Sets the dataLength value for this Label.
     * 
     * @param dataLength
     */
    public void setDataLength(int dataLength) {
        this.dataLength = dataLength;
    }


    /**
     * Gets the BRTfullParcelID value for this Label.
     * 
     * @return BRTfullParcelID
     */
    public java.lang.String[] getBRTfullParcelID() {
        return BRTfullParcelID;
    }


    /**
     * Sets the BRTfullParcelID value for this Label.
     * 
     * @param BRTfullParcelID
     */
    public void setBRTfullParcelID(java.lang.String[] BRTfullParcelID) {
        this.BRTfullParcelID = BRTfullParcelID;
    }

    public java.lang.String getBRTfullParcelID(int i) {
        return this.BRTfullParcelID[i];
    }

    public void setBRTfullParcelID(int i, java.lang.String _value) {
        this.BRTfullParcelID[i] = _value;
    }


    /**
     * Gets the data value for this Label.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this Label.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Label)) return false;
        Label other = (Label) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dataLength == other.getDataLength() &&
            ((this.BRTfullParcelID==null && other.getBRTfullParcelID()==null) || 
             (this.BRTfullParcelID!=null &&
              java.util.Arrays.equals(this.BRTfullParcelID, other.getBRTfullParcelID()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        _hashCode += getDataLength();
        if (getBRTfullParcelID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBRTfullParcelID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBRTfullParcelID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Label.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "label"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRTfullParcelID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRTfullParcelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Data"));
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

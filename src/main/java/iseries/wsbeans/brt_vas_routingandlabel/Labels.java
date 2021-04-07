/**
 * Labels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class Labels  implements java.io.Serializable {
    private int dataLength;

    private java.lang.String BRTfullParcelID;

    private java.lang.String data;

    public Labels() {
    }

    public Labels(
           int dataLength,
           java.lang.String BRTfullParcelID,
           java.lang.String data) {
           this.dataLength = dataLength;
           this.BRTfullParcelID = BRTfullParcelID;
           this.data = data;
    }


    /**
     * Gets the dataLength value for this Labels.
     * 
     * @return dataLength
     */
    public int getDataLength() {
        return dataLength;
    }


    /**
     * Sets the dataLength value for this Labels.
     * 
     * @param dataLength
     */
    public void setDataLength(int dataLength) {
        this.dataLength = dataLength;
    }


    /**
     * Gets the BRTfullParcelID value for this Labels.
     * 
     * @return BRTfullParcelID
     */
    public java.lang.String getBRTfullParcelID() {
        return BRTfullParcelID;
    }


    /**
     * Sets the BRTfullParcelID value for this Labels.
     * 
     * @param BRTfullParcelID
     */
    public void setBRTfullParcelID(java.lang.String BRTfullParcelID) {
        this.BRTfullParcelID = BRTfullParcelID;
    }


    /**
     * Gets the data value for this Labels.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this Labels.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Labels)) return false;
        Labels other = (Labels) obj;
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
              this.BRTfullParcelID.equals(other.getBRTfullParcelID()))) &&
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
            _hashCode += getBRTfullParcelID().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Labels.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "labels"));
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

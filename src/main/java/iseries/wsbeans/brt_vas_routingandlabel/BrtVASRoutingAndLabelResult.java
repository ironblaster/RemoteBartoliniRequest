/**
 * BrtVASRoutingAndLabelResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class BrtVASRoutingAndLabelResult  implements java.io.Serializable {
    private iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelResponse BRT_VAS_RoutingAndLabelResponse;

    public BrtVASRoutingAndLabelResult() {
    }

    public BrtVASRoutingAndLabelResult(
           iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelResponse BRT_VAS_RoutingAndLabelResponse) {
           this.BRT_VAS_RoutingAndLabelResponse = BRT_VAS_RoutingAndLabelResponse;
    }


    /**
     * Gets the BRT_VAS_RoutingAndLabelResponse value for this BrtVASRoutingAndLabelResult.
     * 
     * @return BRT_VAS_RoutingAndLabelResponse
     */
    public iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelResponse getBRT_VAS_RoutingAndLabelResponse() {
        return BRT_VAS_RoutingAndLabelResponse;
    }


    /**
     * Sets the BRT_VAS_RoutingAndLabelResponse value for this BrtVASRoutingAndLabelResult.
     * 
     * @param BRT_VAS_RoutingAndLabelResponse
     */
    public void setBRT_VAS_RoutingAndLabelResponse(iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelResponse BRT_VAS_RoutingAndLabelResponse) {
        this.BRT_VAS_RoutingAndLabelResponse = BRT_VAS_RoutingAndLabelResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrtVASRoutingAndLabelResult)) return false;
        BrtVASRoutingAndLabelResult other = (BrtVASRoutingAndLabelResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRT_VAS_RoutingAndLabelResponse==null && other.getBRT_VAS_RoutingAndLabelResponse()==null) || 
             (this.BRT_VAS_RoutingAndLabelResponse!=null &&
              this.BRT_VAS_RoutingAndLabelResponse.equals(other.getBRT_VAS_RoutingAndLabelResponse())));
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
        if (getBRT_VAS_RoutingAndLabelResponse() != null) {
            _hashCode += getBRT_VAS_RoutingAndLabelResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrtVASRoutingAndLabelResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "brtVASRoutingAndLabelResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRT_VAS_RoutingAndLabelResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRT_VAS_RoutingAndLabelResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "routingAndLabelResponse"));
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

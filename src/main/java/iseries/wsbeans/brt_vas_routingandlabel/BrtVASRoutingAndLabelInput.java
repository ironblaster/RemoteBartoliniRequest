/**
 * BrtVASRoutingAndLabelInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class BrtVASRoutingAndLabelInput  implements java.io.Serializable {
    private iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelRequest BRT_VAS_RoutingAndLabelRequest;

    public BrtVASRoutingAndLabelInput() {
    }

    public BrtVASRoutingAndLabelInput(
           iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelRequest BRT_VAS_RoutingAndLabelRequest) {
           this.BRT_VAS_RoutingAndLabelRequest = BRT_VAS_RoutingAndLabelRequest;
    }


    /**
     * Gets the BRT_VAS_RoutingAndLabelRequest value for this BrtVASRoutingAndLabelInput.
     * 
     * @return BRT_VAS_RoutingAndLabelRequest
     */
    public iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelRequest getBRT_VAS_RoutingAndLabelRequest() {
        return BRT_VAS_RoutingAndLabelRequest;
    }


    /**
     * Sets the BRT_VAS_RoutingAndLabelRequest value for this BrtVASRoutingAndLabelInput.
     * 
     * @param BRT_VAS_RoutingAndLabelRequest
     */
    public void setBRT_VAS_RoutingAndLabelRequest(iseries.wsbeans.brt_vas_routingandlabel.RoutingAndLabelRequest BRT_VAS_RoutingAndLabelRequest) {
        this.BRT_VAS_RoutingAndLabelRequest = BRT_VAS_RoutingAndLabelRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrtVASRoutingAndLabelInput)) return false;
        BrtVASRoutingAndLabelInput other = (BrtVASRoutingAndLabelInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRT_VAS_RoutingAndLabelRequest==null && other.getBRT_VAS_RoutingAndLabelRequest()==null) || 
             (this.BRT_VAS_RoutingAndLabelRequest!=null &&
              this.BRT_VAS_RoutingAndLabelRequest.equals(other.getBRT_VAS_RoutingAndLabelRequest())));
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
        if (getBRT_VAS_RoutingAndLabelRequest() != null) {
            _hashCode += getBRT_VAS_RoutingAndLabelRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrtVASRoutingAndLabelInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "brtVASRoutingAndLabelInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRT_VAS_RoutingAndLabelRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRT_VAS_RoutingAndLabelRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "routingAndLabelRequest"));
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

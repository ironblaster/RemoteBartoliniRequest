/**
 * RoutingAndLabelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class RoutingAndLabelRequest  implements java.io.Serializable {
    private iseries.wsbeans.brt_vas_routingandlabel.Validation validation;

    private int APIVersion;

    private java.lang.String featureCode;

    private iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB shipmentData;

    private iseries.wsbeans.brt_vas_routingandlabel.InKeyValue[] inputParameters;

    public RoutingAndLabelRequest() {
    }

    public RoutingAndLabelRequest(
           iseries.wsbeans.brt_vas_routingandlabel.Validation validation,
           int APIVersion,
           java.lang.String featureCode,
           iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB shipmentData,
           iseries.wsbeans.brt_vas_routingandlabel.InKeyValue[] inputParameters) {
           this.validation = validation;
           this.APIVersion = APIVersion;
           this.featureCode = featureCode;
           this.shipmentData = shipmentData;
           this.inputParameters = inputParameters;
    }


    /**
     * Gets the validation value for this RoutingAndLabelRequest.
     * 
     * @return validation
     */
    public iseries.wsbeans.brt_vas_routingandlabel.Validation getValidation() {
        return validation;
    }


    /**
     * Sets the validation value for this RoutingAndLabelRequest.
     * 
     * @param validation
     */
    public void setValidation(iseries.wsbeans.brt_vas_routingandlabel.Validation validation) {
        this.validation = validation;
    }


    /**
     * Gets the APIVersion value for this RoutingAndLabelRequest.
     * 
     * @return APIVersion
     */
    public int getAPIVersion() {
        return APIVersion;
    }


    /**
     * Sets the APIVersion value for this RoutingAndLabelRequest.
     * 
     * @param APIVersion
     */
    public void setAPIVersion(int APIVersion) {
        this.APIVersion = APIVersion;
    }


    /**
     * Gets the featureCode value for this RoutingAndLabelRequest.
     * 
     * @return featureCode
     */
    public java.lang.String getFeatureCode() {
        return featureCode;
    }


    /**
     * Sets the featureCode value for this RoutingAndLabelRequest.
     * 
     * @param featureCode
     */
    public void setFeatureCode(java.lang.String featureCode) {
        this.featureCode = featureCode;
    }


    /**
     * Gets the shipmentData value for this RoutingAndLabelRequest.
     * 
     * @return shipmentData
     */
    public iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB getShipmentData() {
        return shipmentData;
    }


    /**
     * Sets the shipmentData value for this RoutingAndLabelRequest.
     * 
     * @param shipmentData
     */
    public void setShipmentData(iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB shipmentData) {
        this.shipmentData = shipmentData;
    }


    /**
     * Gets the inputParameters value for this RoutingAndLabelRequest.
     * 
     * @return inputParameters
     */
    public iseries.wsbeans.brt_vas_routingandlabel.InKeyValue[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this RoutingAndLabelRequest.
     * 
     * @param inputParameters
     */
    public void setInputParameters(iseries.wsbeans.brt_vas_routingandlabel.InKeyValue[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public iseries.wsbeans.brt_vas_routingandlabel.InKeyValue getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, iseries.wsbeans.brt_vas_routingandlabel.InKeyValue _value) {
        this.inputParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingAndLabelRequest)) return false;
        RoutingAndLabelRequest other = (RoutingAndLabelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validation==null && other.getValidation()==null) || 
             (this.validation!=null &&
              this.validation.equals(other.getValidation()))) &&
            this.APIVersion == other.getAPIVersion() &&
            ((this.featureCode==null && other.getFeatureCode()==null) || 
             (this.featureCode!=null &&
              this.featureCode.equals(other.getFeatureCode()))) &&
            ((this.shipmentData==null && other.getShipmentData()==null) || 
             (this.shipmentData!=null &&
              this.shipmentData.equals(other.getShipmentData()))) &&
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters())));
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
        if (getValidation() != null) {
            _hashCode += getValidation().hashCode();
        }
        _hashCode += getAPIVersion();
        if (getFeatureCode() != null) {
            _hashCode += getFeatureCode().hashCode();
        }
        if (getShipmentData() != null) {
            _hashCode += getShipmentData().hashCode();
        }
        if (getInputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingAndLabelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "routingAndLabelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Validation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "validation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APIVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "APIVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FeatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShipmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "headerVAB"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "inKeyValue"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

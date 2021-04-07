/**
 * RoutingAndLabelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_vas_routingandlabel;

public class RoutingAndLabelResponse  implements java.io.Serializable {
    private int APIVersion;

    private java.lang.String currentTimeItaly;

    private java.lang.String currentTimeUTC;

    private iseries.wsbeans.brt_vas_routingandlabel.ErrorInfo errorInfo;

    private iseries.wsbeans.brt_vas_routingandlabel.OutKeyValue[] outputValues;

    private iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB[] shipmentData;

    private iseries.wsbeans.brt_vas_routingandlabel.Labels[] labels;

    private iseries.wsbeans.brt_vas_routingandlabel.Label[] label;

    private java.lang.String disclaimer;

    public RoutingAndLabelResponse() {
    }

    public RoutingAndLabelResponse(
           int APIVersion,
           java.lang.String currentTimeItaly,
           java.lang.String currentTimeUTC,
           iseries.wsbeans.brt_vas_routingandlabel.ErrorInfo errorInfo,
           iseries.wsbeans.brt_vas_routingandlabel.OutKeyValue[] outputValues,
           iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB[] shipmentData,
           iseries.wsbeans.brt_vas_routingandlabel.Labels[] labels,
           iseries.wsbeans.brt_vas_routingandlabel.Label[] label,
           java.lang.String disclaimer) {
           this.APIVersion = APIVersion;
           this.currentTimeItaly = currentTimeItaly;
           this.currentTimeUTC = currentTimeUTC;
           this.errorInfo = errorInfo;
           this.outputValues = outputValues;
           this.shipmentData = shipmentData;
           this.labels = labels;
           this.label = label;
           this.disclaimer = disclaimer;
    }


    /**
     * Gets the APIVersion value for this RoutingAndLabelResponse.
     * 
     * @return APIVersion
     */
    public int getAPIVersion() {
        return APIVersion;
    }


    /**
     * Sets the APIVersion value for this RoutingAndLabelResponse.
     * 
     * @param APIVersion
     */
    public void setAPIVersion(int APIVersion) {
        this.APIVersion = APIVersion;
    }


    /**
     * Gets the currentTimeItaly value for this RoutingAndLabelResponse.
     * 
     * @return currentTimeItaly
     */
    public java.lang.String getCurrentTimeItaly() {
        return currentTimeItaly;
    }


    /**
     * Sets the currentTimeItaly value for this RoutingAndLabelResponse.
     * 
     * @param currentTimeItaly
     */
    public void setCurrentTimeItaly(java.lang.String currentTimeItaly) {
        this.currentTimeItaly = currentTimeItaly;
    }


    /**
     * Gets the currentTimeUTC value for this RoutingAndLabelResponse.
     * 
     * @return currentTimeUTC
     */
    public java.lang.String getCurrentTimeUTC() {
        return currentTimeUTC;
    }


    /**
     * Sets the currentTimeUTC value for this RoutingAndLabelResponse.
     * 
     * @param currentTimeUTC
     */
    public void setCurrentTimeUTC(java.lang.String currentTimeUTC) {
        this.currentTimeUTC = currentTimeUTC;
    }


    /**
     * Gets the errorInfo value for this RoutingAndLabelResponse.
     * 
     * @return errorInfo
     */
    public iseries.wsbeans.brt_vas_routingandlabel.ErrorInfo getErrorInfo() {
        return errorInfo;
    }


    /**
     * Sets the errorInfo value for this RoutingAndLabelResponse.
     * 
     * @param errorInfo
     */
    public void setErrorInfo(iseries.wsbeans.brt_vas_routingandlabel.ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }


    /**
     * Gets the outputValues value for this RoutingAndLabelResponse.
     * 
     * @return outputValues
     */
    public iseries.wsbeans.brt_vas_routingandlabel.OutKeyValue[] getOutputValues() {
        return outputValues;
    }


    /**
     * Sets the outputValues value for this RoutingAndLabelResponse.
     * 
     * @param outputValues
     */
    public void setOutputValues(iseries.wsbeans.brt_vas_routingandlabel.OutKeyValue[] outputValues) {
        this.outputValues = outputValues;
    }

    public iseries.wsbeans.brt_vas_routingandlabel.OutKeyValue getOutputValues(int i) {
        return this.outputValues[i];
    }

    public void setOutputValues(int i, iseries.wsbeans.brt_vas_routingandlabel.OutKeyValue _value) {
        this.outputValues[i] = _value;
    }


    /**
     * Gets the shipmentData value for this RoutingAndLabelResponse.
     * 
     * @return shipmentData
     */
    public iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB[] getShipmentData() {
        return shipmentData;
    }


    /**
     * Sets the shipmentData value for this RoutingAndLabelResponse.
     * 
     * @param shipmentData
     */
    public void setShipmentData(iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB[] shipmentData) {
        this.shipmentData = shipmentData;
    }

    public iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB getShipmentData(int i) {
        return this.shipmentData[i];
    }

    public void setShipmentData(int i, iseries.wsbeans.brt_vas_routingandlabel.HeaderVAB _value) {
        this.shipmentData[i] = _value;
    }


    /**
     * Gets the labels value for this RoutingAndLabelResponse.
     * 
     * @return labels
     */
    public iseries.wsbeans.brt_vas_routingandlabel.Labels[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this RoutingAndLabelResponse.
     * 
     * @param labels
     */
    public void setLabels(iseries.wsbeans.brt_vas_routingandlabel.Labels[] labels) {
        this.labels = labels;
    }

    public iseries.wsbeans.brt_vas_routingandlabel.Labels getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, iseries.wsbeans.brt_vas_routingandlabel.Labels _value) {
        this.labels[i] = _value;
    }


    /**
     * Gets the label value for this RoutingAndLabelResponse.
     * 
     * @return label
     */
    public iseries.wsbeans.brt_vas_routingandlabel.Label[] getLabel() {
        return label;
    }


    /**
     * Sets the label value for this RoutingAndLabelResponse.
     * 
     * @param label
     */
    public void setLabel(iseries.wsbeans.brt_vas_routingandlabel.Label[] label) {
        this.label = label;
    }

    public iseries.wsbeans.brt_vas_routingandlabel.Label getLabel(int i) {
        return this.label[i];
    }

    public void setLabel(int i, iseries.wsbeans.brt_vas_routingandlabel.Label _value) {
        this.label[i] = _value;
    }


    /**
     * Gets the disclaimer value for this RoutingAndLabelResponse.
     * 
     * @return disclaimer
     */
    public java.lang.String getDisclaimer() {
        return disclaimer;
    }


    /**
     * Sets the disclaimer value for this RoutingAndLabelResponse.
     * 
     * @param disclaimer
     */
    public void setDisclaimer(java.lang.String disclaimer) {
        this.disclaimer = disclaimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingAndLabelResponse)) return false;
        RoutingAndLabelResponse other = (RoutingAndLabelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.APIVersion == other.getAPIVersion() &&
            ((this.currentTimeItaly==null && other.getCurrentTimeItaly()==null) || 
             (this.currentTimeItaly!=null &&
              this.currentTimeItaly.equals(other.getCurrentTimeItaly()))) &&
            ((this.currentTimeUTC==null && other.getCurrentTimeUTC()==null) || 
             (this.currentTimeUTC!=null &&
              this.currentTimeUTC.equals(other.getCurrentTimeUTC()))) &&
            ((this.errorInfo==null && other.getErrorInfo()==null) || 
             (this.errorInfo!=null &&
              this.errorInfo.equals(other.getErrorInfo()))) &&
            ((this.outputValues==null && other.getOutputValues()==null) || 
             (this.outputValues!=null &&
              java.util.Arrays.equals(this.outputValues, other.getOutputValues()))) &&
            ((this.shipmentData==null && other.getShipmentData()==null) || 
             (this.shipmentData!=null &&
              java.util.Arrays.equals(this.shipmentData, other.getShipmentData()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              java.util.Arrays.equals(this.label, other.getLabel()))) &&
            ((this.disclaimer==null && other.getDisclaimer()==null) || 
             (this.disclaimer!=null &&
              this.disclaimer.equals(other.getDisclaimer())));
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
        _hashCode += getAPIVersion();
        if (getCurrentTimeItaly() != null) {
            _hashCode += getCurrentTimeItaly().hashCode();
        }
        if (getCurrentTimeUTC() != null) {
            _hashCode += getCurrentTimeUTC().hashCode();
        }
        if (getErrorInfo() != null) {
            _hashCode += getErrorInfo().hashCode();
        }
        if (getOutputValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisclaimer() != null) {
            _hashCode += getDisclaimer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingAndLabelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "routingAndLabelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APIVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "APIVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTimeItaly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentTimeItaly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTimeUTC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentTimeUTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "errorInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutputValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "outKeyValue"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShipmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "headerVAB"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "labels"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_vas_routingandlabel.wsbeans.iseries/", "label"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclaimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Disclaimer"));
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

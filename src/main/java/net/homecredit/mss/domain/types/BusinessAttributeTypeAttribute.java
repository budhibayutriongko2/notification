/**
 * BusinessAttributeTypeAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.homecredit.mss.domain.types;

public class BusinessAttributeTypeAttribute  implements java.io.Serializable {
    /* Message business attribute type (CONTRACT_NUM, CUID, EMPLOYEE_CODE,
     * SALESPOINT_CODE, GATEWAY_TEMPLATE_ID, SAS_MESSAGE_TYPE, SAS_TEMPLATE_ID,...).
     * May be restricted by configuration for specific list of types. */
    private java.lang.String type;

    private java.lang.String value;

    public BusinessAttributeTypeAttribute() {
    }

    public BusinessAttributeTypeAttribute(
           java.lang.String type,
           java.lang.String value) {
           this.type = type;
           this.value = value;
    }


    /**
     * Gets the type value for this BusinessAttributeTypeAttribute.
     * 
     * @return type   * Message business attribute type (CONTRACT_NUM, CUID, EMPLOYEE_CODE,
     * SALESPOINT_CODE, GATEWAY_TEMPLATE_ID, SAS_MESSAGE_TYPE, SAS_TEMPLATE_ID,...).
     * May be restricted by configuration for specific list of types.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this BusinessAttributeTypeAttribute.
     * 
     * @param type   * Message business attribute type (CONTRACT_NUM, CUID, EMPLOYEE_CODE,
     * SALESPOINT_CODE, GATEWAY_TEMPLATE_ID, SAS_MESSAGE_TYPE, SAS_TEMPLATE_ID,...).
     * May be restricted by configuration for specific list of types.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the value value for this BusinessAttributeTypeAttribute.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this BusinessAttributeTypeAttribute.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessAttributeTypeAttribute)) return false;
        BusinessAttributeTypeAttribute other = (BusinessAttributeTypeAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessAttributeTypeAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://homecredit.net/mss/domain/types", ">BusinessAttributeType>attribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://homecredit.net/mss/domain/types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://homecredit.net/mss/domain/types", "value"));
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

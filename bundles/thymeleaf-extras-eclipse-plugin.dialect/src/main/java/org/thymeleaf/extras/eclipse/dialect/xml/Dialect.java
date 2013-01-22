//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.18 at 11:58:13 PM NZDT 
//


package org.thymeleaf.extras.eclipse.dialect.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Information about a dialect and its processors.
 * 				
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="attribute-processor" type="{http://www.thymeleaf.org/extras/dialect}AttributeProcessor"/>
 *           &lt;element name="element-processor" type="{http://www.thymeleaf.org/extras/dialect}ElementProcessor"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="prefix" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespace-uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processors"
})
@XmlRootElement(name = "dialect")
public class Dialect {

    @XmlElements({
        @XmlElement(name = "attribute-processor", type = AttributeProcessor.class),
        @XmlElement(name = "element-processor", type = ElementProcessor.class)
    })
    protected List<Processor> processors;
    @XmlAttribute(name = "prefix", required = true)
    protected String prefix;
    @XmlAttribute(name = "namespace-uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String namespaceUri;

    /**
     * Gets the value of the processors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeProcessor }
     * {@link ElementProcessor }
     * 
     * 
     */
    public List<Processor> getProcessors() {
        if (processors == null) {
            processors = new ArrayList<Processor>();
        }
        return this.processors;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the namespaceUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceUri() {
        return namespaceUri;
    }

    /**
     * Sets the value of the namespaceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceUri(String value) {
        this.namespaceUri = value;
    }
    
	/**
	 * Returns if this dialect is equal to another.
	 * 
	 * @param other The other dialect to compare against.
	 * @return <tt>true</tt> if the other object is a dialect and the share the
	 * 		   same namespace.
	 */
	@Override
	public boolean equals(Object other) {

		return other instanceof Dialect && namespaceUri.equals(((Dialect)other).namespaceUri);
	}
					
}

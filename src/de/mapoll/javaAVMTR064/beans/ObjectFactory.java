//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.11 um 12:26:24 PM CET 
//


package de.mapoll.javaAVMTR064.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mapoll.javaAVMTR064.beans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Scpd_QNAME = new QName("urn:dslforum-org:service-1-0", "scpd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mapoll.javaAVMTR064.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScpdType }
     * 
     */
    public ScpdType createScpdType() {
        return new ScpdType();
    }

    /**
     * Create an instance of {@link SpecVersionType }
     * 
     */
    public SpecVersionType createSpecVersionType() {
        return new SpecVersionType();
    }

    /**
     * Create an instance of {@link ArgumentType }
     * 
     */
    public ArgumentType createArgumentType() {
        return new ArgumentType();
    }

    /**
     * Create an instance of {@link ArgumentListType }
     * 
     */
    public ArgumentListType createArgumentListType() {
        return new ArgumentListType();
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link ActionListType }
     * 
     */
    public ActionListType createActionListType() {
        return new ActionListType();
    }

    /**
     * Create an instance of {@link StateVariableType }
     * 
     */
    public StateVariableType createStateVariableType() {
        return new StateVariableType();
    }

    /**
     * Create an instance of {@link ServiceStateTableType }
     * 
     */
    public ServiceStateTableType createServiceStateTableType() {
        return new ServiceStateTableType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScpdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dslforum-org:service-1-0", name = "scpd")
    public JAXBElement<ScpdType> createScpd(ScpdType value) {
        return new JAXBElement<ScpdType>(_Scpd_QNAME, ScpdType.class, null, value);
    }

}

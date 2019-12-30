package org.freedesktop.xjbgen.xml.type;

import javax.xml.bind.annotation.XmlAttribute;

import org.freedesktop.xjbgen.xml.XjbModule;

public class XjbXidType extends XjbTypeElement<XjbModule> {

    @XmlAttribute(name = "name")
    private String xmlName;

    static int BYTE_SIZE = Integer.BYTES;

    @Override
    public int byteSize() {
        return BYTE_SIZE;
    }

    @Override
    public String getXmlName() {
        return xmlName;
    }
}
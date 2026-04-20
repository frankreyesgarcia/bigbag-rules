/* Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.apache.bval.jsr.xml;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.UnmarshallerHandler;
import org.junit.Test;
public class Demo {
    @org.junit.Test
    public void test1() throws java.lang.Exception {
        jakarta.xml.bind.JAXBContext jc = jakarta.xml.bind.JAXBContext.newInstance(org.apache.bval.jsr.xml.ObjectFactory.class);
        // Set the parent XMLReader on the XMLFilter
        javax.xml.parsers.SAXParserFactory spf = javax.xml.parsers.SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        javax.xml.parsers.SAXParser sp = spf.newSAXParser();
        org.xml.sax.XMLReader xr = sp.getXMLReader();
        // Set UnmarshallerHandler as ContentHandler on XMLFilter
        jakarta.xml.bind.Unmarshaller unmarshaller = jc.createUnmarshaller();
        jakarta.xml.bind.UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
        xr.setContentHandler(unmarshallerHandler);
        // Parse the XML
        org.xml.sax.InputSource xml = new org.xml.sax.InputSource(getClass().getResourceAsStream("/sample-validation2.xml"));
        xr.parse(xml);
        jakarta.xml.bind.JAXBElement<org.apache.bval.jsr.xml.ValidationConfigType> result = ((jakarta.xml.bind.JAXBElement<org.apache.bval.jsr.xml.ValidationConfigType>) (unmarshallerHandler.getResult()));
        java.lang.System.out.println(result.getValue());
    }
}

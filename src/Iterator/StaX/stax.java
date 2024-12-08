package Iterator.StaX;

import javax.xml.namespace.QName;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.*;

public class stax {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        // 1. XMLEventReader 객체를 만드는 팩토리 객체를 얻는다.
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        // 2. XMLEventReader 객체를 만든다.
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("book.xml"));

        // 3. 이터레이터 순회한다.
        while(reader.hasNext()) {
            // <books> 엘리먼트를 캡쳐하여 그 영역을 표현하는 XMLEvent 인스턴스를 생성
            XMLEvent nextEvent = reader.nextEvent();

            // 엘리먼트에 자식 엘리먼트가 있을 경우
            if(nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement(); // <book>
                QName name = startElement.getName();
                if(name.getLocalPart().equals("book")) {
                    // 엘리먼트의 속성을 얻는다. <book title=""/>
                    Attribute title = startElement.getAttributeByName(new QName("title"));
                    System.out.println(title.getValue());
                }
            }
        }
    }
}

package cn.itcast.jaxp;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;


//ʹ��jaxp�޸Ľڵ�
public class Test_jaxp_04 {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.��������������
		 * 2.���ݽ�����������������
		 * 3.����xml������document
		 * 4.�õ�sex item����
		 * 5.�޸�sex�����ֵ setTextContent����
		 * 6.��дxml
		 * */

		//��������������
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		
		//����������
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		//�õ�document
		Document document= builder.parse("src/person.xml");
		
		//�õ�sex
		Node sex1=document.getElementsByTagName("sex").item(0);
		//�޸�sexֵ
		sex1.setTextContent("nan");
		//��дxml
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/person.xml"));
	}

}

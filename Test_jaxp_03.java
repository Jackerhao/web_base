package cn.itcast.jaxp;
//ʹ��jaxp��ӽڵ�
import javax.xml.parsers.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;


public class Test_jaxp_03 {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.��������������
		 * 2.���ݽ�����������������
		 * 3.����xml������document
		 * 4.�õ���һ��p1
		 *  -�õ�����p1��ʹ��item�����±�õ�
		 *  5.����sex��ǩ
		 *  6.�����ı�createTextNode
		 *  7.���ı���ӵ�sex����appendChild
		 *  8.��sex��ӵ���һ��p1����
		 *  9.��дxml
		 */
       //��������������
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		//����������
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		//�õ�document
		Document document=builder.parse("src/person.xml");
		//�õ�����p1
		NodeList list=document.getElementsByTagName("p1");
		//�õ���һ��p1
		Node p1=list.item(0);
		//������ǩ
		Element sex1=document.createElement("sex");
		//�����ı�
		Text text1=document.createTextNode("nv");
		//���ı����sex1��
		sex1.appendChild(text1);
		//��sex1��ӵ�p1��
		p1.appendChild(sex1);
		//��дxml
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/person.xml"));
		
		
		
		
	}

}

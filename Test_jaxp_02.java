package cn.itcast.jaxp;
//ʹ��jaxp��ѯĳ���ڵ�
import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test_jaxp_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 1.��������������
		 * 2.����������
		 * 3.����xml����document
		 * 4.�õ�����nameԪ��
		 * 5.ʹ�÷��ؼ���,���淽��item�±��ȡ����Ԫ��
		 * 6.�õ������ֵʹ��getTextContent����
		 */
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		Document document=builder.parse("src/person.xml");
		NodeList list=document.getElementsByTagName("name");
		Node name1=list.item(1);
		String s=name1.getTextContent();
		System.out.println(s);
		

	}

}

package cn.itcast.jaxp;
//ʹ��jaxpɾ���ڵ�<sex>nan</sex>�ڵ�

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

public class Test_jaxp_05 {
  /**
   * 1.��������������
   * 2.���ݽ�����������������
   * 3.����xml������document
   * 
   * 4.��ȡsexԪ��
   * 5.��ȡsex�ĸ��ڵ�
   * 6.ɾ��ʹ�ø��ڵ�ɾ��removeChild����
   * 7.��дxml
   * 
   */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//��������������
				DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
				
				//����������
				DocumentBuilder builder=builderFactory.newDocumentBuilder();
				
				//�õ�document
				Document document= builder.parse("src/person.xml");
				
				//�õ�sexԪ��
				Node sex1=document.getElementsByTagName("sex").item(0);
	            //�õ�sex1�ĸ��ڵ�
				Node p1=sex1.getParentNode();
				//ɾ������
				p1.removeChild(sex1);
				//��д
				TransformerFactory transformerFactory=TransformerFactory.newInstance();
				Transformer transformer=transformerFactory.newTransformer();
				transformer.transform(new DOMSource(document),new StreamResult("src/person.xml"));
	}

}

package cn.itcast.jaxp;


import javax.xml.parsers.*;

import org.w3c.dom.*;


//��ѯ����nameԪ�ص�ֵ
public class Test_jaxp_01 {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.��������������
		 * 2.���ݽ�������������������
		 * 3.����xml����document
		 * 4.�õ�����nameԪ��
		 * 5.���ؼ���,�������ϣ��õ�ÿ��nameԪ��
		 */
		//��������������
    DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
       //����������
        DocumentBuilder builder=builderFactory.newDocumentBuilder();
        //����xml����document
        Document document=builder.parse("src/person.xml");
        //�õ�nameԪ��
        NodeList list=document.getElementsByTagName("name");
        //��������
        for(int i=0;i<list.getLength();i++){
        	Node name1=list.item(i);//�õ�ÿһ��nameԪ��
        	
        	//�õ�nameԪ�������ֵ
        	String s=name1.getTextContent();
        	System.out.println(s);
        }
        
		

	}

}

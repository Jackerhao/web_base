package cn.itcast.jaxp;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

//�����ڵ�,������Ԫ�����ƴ�ӡ����
public class Test_jaxp_06 {

	/**
	   * 1.��������������
	   * 2.���ݽ�����������������
	   * 3.����xml������document
	   * 
	   * =====ʹ�õݹ�ʵ��=====
	   * 4.�õ����ڵ�
	   * 5.�õ����ڵ��ӽڵ�
	   * 6.�õ����ڵ��ӽڵ���ӽڵ�
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
		
		//��дһ������ʵ�ֱ�������
		list1(document);
	}
     
	//�����ݹ�ķ���
	private static void list1(Node node) {
		//�ж���Ԫ������ʱ��Ŵ�ӡ
		if(node.getNodeType()==Node.ELEMENT_NODE){
			System.out.println(node.getNodeName());
		}
       
		//�õ�һ���ӽڵ�
		NodeList list=node.getChildNodes();
		//����list
		for(int i=0;i<list.getLength();i++){
			//�õ�ÿһ���ڵ�
			Node node1=list.item(i);
			//�����õ�node1���ӽڵ�
			list1(node1);
		}
		
		
	}

}

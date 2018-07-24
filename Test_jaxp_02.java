package cn.itcast.jaxp;
//使用jaxp查询某个节点
import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test_jaxp_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 1.创建解析器工厂
		 * 2.创建解析器
		 * 3.解析xml返回document
		 * 4.得到所有name元素
		 * 5.使用返回集合,里面方法item下标获取具体元素
		 * 6.得到具体的值使用getTextContent方法
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

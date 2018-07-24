package cn.itcast.jaxp;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

//遍历节点,把所有元素名称打印出来
public class Test_jaxp_06 {

	/**
	   * 1.创建解析器工厂
	   * 2.根据解析工厂创建解析器
	   * 3.解析xml，返回document
	   * 
	   * =====使用递归实现=====
	   * 4.得到根节点
	   * 5.得到根节点子节点
	   * 6.得到根节点子节点的子节点
	   * 
	   */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建解析器工厂
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		
		//创建解析器
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		//得到document
		Document document= builder.parse("src/person.xml");
		
		//编写一个方法实现遍历操作
		list1(document);
	}
     
	//遍历递归的方法
	private static void list1(Node node) {
		//判断是元素类型时候才打印
		if(node.getNodeType()==Node.ELEMENT_NODE){
			System.out.println(node.getNodeName());
		}
       
		//得到一层子节点
		NodeList list=node.getChildNodes();
		//遍历list
		for(int i=0;i<list.getLength();i++){
			//得到每一个节点
			Node node1=list.item(i);
			//继续得到node1的子节点
			list1(node1);
		}
		
		
	}

}

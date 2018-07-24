package cn.itcast.jaxp;
//使用jaxp添加节点
import javax.xml.parsers.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;


public class Test_jaxp_03 {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.创建解析器工厂
		 * 2.根据解析工厂创建解析器
		 * 3.解析xml，返回document
		 * 4.得到第一个p1
		 *  -得到所有p1，使用item方法下标得到
		 *  5.创建sex标签
		 *  6.创建文本createTextNode
		 *  7.把文本添加到sex下面appendChild
		 *  8.把sex添加到第一个p1下面
		 *  9.回写xml
		 */
       //创建解析器工厂
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		//创建解析器
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		//得到document
		Document document=builder.parse("src/person.xml");
		//得到所有p1
		NodeList list=document.getElementsByTagName("p1");
		//得到第一个p1
		Node p1=list.item(0);
		//创建标签
		Element sex1=document.createElement("sex");
		//创建文本
		Text text1=document.createTextNode("nv");
		//把文本添加sex1下
		sex1.appendChild(text1);
		//把sex1添加到p1下
		p1.appendChild(sex1);
		//回写xml
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/person.xml"));
		
		
		
		
	}

}

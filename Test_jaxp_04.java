package cn.itcast.jaxp;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;


//使用jaxp修改节点
public class Test_jaxp_04 {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.创建解析器工厂
		 * 2.根据解析工厂创建解析器
		 * 3.解析xml，返回document
		 * 4.得到sex item方法
		 * 5.修改sex里面的值 setTextContent方法
		 * 6.回写xml
		 * */

		//创建解析器工厂
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		
		//创建解析器
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		//得到document
		Document document= builder.parse("src/person.xml");
		
		//得到sex
		Node sex1=document.getElementsByTagName("sex").item(0);
		//修改sex值
		sex1.setTextContent("nan");
		//回写xml
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/person.xml"));
	}

}

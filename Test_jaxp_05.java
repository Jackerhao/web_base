package cn.itcast.jaxp;
//使用jaxp删除节点<sex>nan</sex>节点

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

public class Test_jaxp_05 {
  /**
   * 1.创建解析器工厂
   * 2.根据解析工厂创建解析器
   * 3.解析xml，返回document
   * 
   * 4.获取sex元素
   * 5.获取sex的父节点
   * 6.删除使用父节点删除removeChild方法
   * 7.回写xml
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
				
				//得到sex元素
				Node sex1=document.getElementsByTagName("sex").item(0);
	            //得到sex1的父节点
				Node p1=sex1.getParentNode();
				//删除操作
				p1.removeChild(sex1);
				//回写
				TransformerFactory transformerFactory=TransformerFactory.newInstance();
				Transformer transformer=transformerFactory.newTransformer();
				transformer.transform(new DOMSource(document),new StreamResult("src/person.xml"));
	}

}

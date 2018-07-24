package cn.itcast.jaxp;


import javax.xml.parsers.*;

import org.w3c.dom.*;


//查询所有name元素的值
public class Test_jaxp_01 {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.创建解析器工厂
		 * 2.根据解析器工厂创建解析器
		 * 3.解析xml返回document
		 * 4.得到所有name元素
		 * 5.返回集合,遍历集合，得到每个name元素
		 */
		//创建解析器工厂
    DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
       //创建解析器
        DocumentBuilder builder=builderFactory.newDocumentBuilder();
        //解析xml返回document
        Document document=builder.parse("src/person.xml");
        //得到name元素
        NodeList list=document.getElementsByTagName("name");
        //遍历集合
        for(int i=0;i<list.getLength();i++){
        	Node name1=list.item(i);//得到每一个name元素
        	
        	//得到name元素里面的值
        	String s=name1.getTextContent();
        	System.out.println(s);
        }
        
		

	}

}

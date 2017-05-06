package com.qiqiao.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.qiqiao.model.Attach;
import com.sun.xml.internal.ws.api.ha.StickyFeature;


public class ReadXmlUtil {
	private static Document doc = null;
	private static File file = null;
	static{
		SAXReader reader = new SAXReader();
		try{
			File file = new File (ReadXmlUtil.class.getResource("/config.xml").getFile());
			doc = reader.read(file);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取imagePath节点下的元素内容
	 * 
	 * @param node imagePath节点下的节点名称
	 * 
	 * @return
	 */
	public static String getImagePathNode(String node) {
		Element root = doc.getRootElement();
		Element element = root.element("imagePath").element(node);
		String imagePath = element.getText();
		return imagePath;
	}
	
	/**
	 * 获取name节点下的元素内容
	 * 
	 * @param node name节点下的节点名称
	 * 
	 * @return
	 */
	public static String getNameNode(String node) {
		Element root = doc.getRootElement();
		Element element = root.element("name").element(node);
		String name = element.getText();
		return name;
	}
	
	//设置图片路径
	public static void setImagePathNode(String node , String path) throws Exception {
		Element root = doc.getRootElement();
		Element element = root.element("imagePath").element(node);
		element.setText(path);
		XMLWriter writer = new XMLWriter(new FileWriter(file));
		writer.write(doc);
		writer.close();
	}
	//设置参数值
	public static void setNameNode(String node,String name) throws Exception {
		Element root = doc.getRootElement();
		Element element = root.element("name").element(node);
		element.setText(name);
		OutputFormat outFmt = new OutputFormat("\t", true);
		outFmt.setEncoding("UTF-8");
		XMLWriter writer = new XMLWriter(new FileOutputStream(file),outFmt);
		writer.write(doc);
		writer.close();
	}
	
}

package com.qiqiao.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


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
	 * 鑾峰彇imagePath鑺傜偣涓嬬殑鍏冪礌鍐呭
	 * 
	 * @param node imagePath鑺傜偣涓嬬殑鑺傜偣鍚嶇О
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
	 * 鑾峰彇name鑺傜偣涓嬬殑鍏冪礌鍐呭
	 * 
	 * @param node name鑺傜偣涓嬬殑鑺傜偣鍚嶇О
	 * 
	 * @return
	 */
	public static String getNameNode(String node) {
		Element root = doc.getRootElement();
		Element element = root.element("name").element(node);
		String name = element.getText();
		return name;
	}
	
	//璁剧疆鍥剧墖璺緞
	public static void setImagePathNode(String node , String path) throws Exception {
		Element root = doc.getRootElement();
		Element element = root.element("imagePath").element(node);
		element.setText(path);
		XMLWriter writer = new XMLWriter(new FileWriter(file));
		writer.write(doc);
		writer.close();
	}
	//璁剧疆鍙傛暟鍊�
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

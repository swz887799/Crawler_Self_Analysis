package com.peng.spider;

import java.awt.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class ApiUse {
	public static void main(String[] args) throws Exception {
		//模拟chorme浏览器，其他浏览器请修改BrowserVersion.后面
		WebClient  webClient=new WebClient(BrowserVersion.CHROME);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		HtmlPage page=webClient.getPage("http://www.yanyulin.info");
		//从烟雨林个个博客上获取标签hed的内容
		//HtmlDivision div=(HtmlDivision)page.getElementById("hed");
		//System.out.println(div.asXml());
		//同样可以打印出hed的内容,//div中//表示搜索整个文档中的div,并将这些div
		//放入list中，然后获取第一个div
		//final HtmlDivision div = (HtmlDivision) page.getByXPath("//div").get(0);
		//System.out.println(div.asXml());
		java.util.List<HtmlAnchor> achList=page.getAnchors();
		for(HtmlAnchor ach:achList){
			System.out.println(ach.getHrefAttribute());
		}
	    webClient.closeAllWindows();		
		
		
	}
}

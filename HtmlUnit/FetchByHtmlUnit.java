package com.peng.spider;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class FetchByHtmlUnit {
public static void main(String[] args) throws Exception {
	final WebClient webClient=new WebClient();
	webClient.getOptions().setCssEnabled(false);
	webClient.getOptions().setJavaScriptEnabled(false);
	final HtmlPage page=webClient.getPage("http://www.yanyulin.info");
	System.out.println(page.asText());
	webClient.closeAllWindows();
}
}

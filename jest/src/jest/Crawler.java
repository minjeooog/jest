package jest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {

	static public String execute(String url){

		Document doc = null;        //Document에는 페이지의 전체 소스가 저장된다

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//select를 이용하여 원하는 태그를 선택한다. select는 원하는 값을 가져오기 위한 중요한 기능이다.
		//Elements element = doc.select(".ui-tabs-panel ui-widget-content ui-corner-bottom");    
		//doc.select(".ui-tabs-panel ui-widget-content ui-corner-bottom");    
		//doc.select("#main");

		
		//Element hotNews2 = doc.select("ul.word_ul").get(0);

		//Elements element = doc.select("div.ui-tabs-panel ui-widget-content ui-corner-bottom");    

		//Iterator<Element> ie1 = element.select("ul.word_ul").iterator();
		//System.out.println(e.getElementsByAttribute("href").attr("href"));
		String result = "";
		
		for(int i=0 ; i<doc.select("ul.word_ul").size() ; i++) {
			Element hotNews = doc.select("ul.word_ul").get(i).select("li").get(0);
			//Element hotNews2 = doc.select("h3.word_h3").get(i);
			
			String original = hotNews.toString();
			//original = hotNews2.toString();
			String extract = original.substring(4, original.length()-5);
			//System.out.println(hotNews2.toString());
			result += extract+"\n";
		}

		//System.out.println(hotNews2.toString());

		
		//Iterator을 사용하여 하나씩 값 가져오기0
		//Iterator<Element> ie1 = element.select("h3.word_h3").iterator();
		//Iterator<Element> ie2 = element.select("ul.word_ul").iterator();
		        
		//while (ie1.hasNext()) {
			//System.out.println(ie1.next().text()+"\t"+ie2.next().text());
		//}
		return result;

	}

}

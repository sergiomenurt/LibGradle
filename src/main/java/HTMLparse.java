import sun.net.ftp.FtpClient;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import static java.lang.Math.log;

public class HTMLparse {

    Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/9828ef4989632378cb01f05c18a0ca3a47781f777d705291ec60422ef13d871c").get();
        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");

        for (Element headline : newsHeadlines) {

            log("%s\n\t%s",headline.attr("title"), headline.absUrl("href"));
        }
    }
}

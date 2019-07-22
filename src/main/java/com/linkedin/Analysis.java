package com.linkedin;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.http.cookie.Cookie;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.io.IOException;
import java.net.ConnectException;
import java.util.Date;
import java.util.Map;

import static org.jsoup.Jsoup.connect;

public class Analysis {

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://www.linkedin.com/in/nitiprabhu")
                .userAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Mobile Safari/537.36")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Accept-Language", "en-US,en;q=0.9")
                .ignoreHttpErrors(true)
                .ignoreContentType(true)
                .header("Accept", "*/*")
                .get();

        System.out.println(document);
        String text = document.tagName("meta").text();
        System.out.println(text);
//        }
    }




}

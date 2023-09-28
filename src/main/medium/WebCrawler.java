package main.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: 1236. Web Crawler
 * Date: 8/25/2023
 * Difficulty: Medium
 * Understanding: Almost
 * Topics: String, DFS, BFS
 * Companies: Bloomberg, Microsoft, Amazon
 */
public class WebCrawler {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        List<String> list = new ArrayList<>();
        String hostname = startUrl.substring(7);
        int index = hostname.indexOf('/');
        if (index != -1) {
            hostname = startUrl.substring(0, index);
        }
        list.add(startUrl);
        dfs(startUrl, htmlParser, list, hostname);
        return list;
    }

    public void dfs(String startUrl, HtmlParser htmlParser, List<String> list, String hostname) {
        for (String url: htmlParser.getUrls(startUrl)) {
            System.out.println(url);
            if (!list.contains(url) && url.contains(hostname)) {
                list.add(url);
                dfs(url, htmlParser, list, hostname);
            }
        }
        return;
    }

    public class HtmlParser {
        public List<String> getUrls(String url) {
            return new ArrayList<>();
        }
    }
}

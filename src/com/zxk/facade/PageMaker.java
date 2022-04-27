package com.zxk.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class PageMaker {
    private PageMaker(){}
    public static void makeWelcomePage(String mail,String filename){
        try {
            Properties properties = Database.getProperties(filename);
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("something");
            htmlWriter.paragraph("....");
            htmlWriter.mail(mail,"...");
            htmlWriter.close();
            // 调用两个类的方法实现功能
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

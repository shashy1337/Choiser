package com.mycompany.KiparoProj.Service;

import com.mycompany.KiparoProj.helper.Choisable;
import com.mycompany.KiparoProj.model.NewsModel;

public class JsonXmlService {

    private final Choisable jsonExecutor, xmlExecutor;

    public JsonXmlService(Choisable jsonExecutor, Choisable xmlExecutor){
        this.jsonExecutor = jsonExecutor;
        this.xmlExecutor = xmlExecutor;
    }

    public void startJson(){
        prettyPrint((NewsModel) jsonExecutor.getData());
    }

    public void startXml(){
        prettyPrint((NewsModel) xmlExecutor.getData());
    }

    private void prettyPrint(NewsModel newsModel){
        newsModel.getNews().forEach(
                news -> System.out.println(String.format("|%s|%s|%s|%s|%s|%s|%s|",
                        newsModel.getName(), newsModel.getLocation(),
                        news.getId(), news.getTitle(),
                        news.getKeywords(), news.getDate(),
                        news.getDescription())));
    }
}

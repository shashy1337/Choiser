package com.mycompany.KiparoProj.App;

import com.mycompany.KiparoProj.Executors.JsonExecutor;
import com.mycompany.KiparoProj.Executors.XMLExecutor;
import com.mycompany.KiparoProj.Service.JsonXmlService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        JsonExecutor jsonExecutor = new JsonExecutor("https://api2.kiparo.com/static/it_news.json");
        XMLExecutor xmlExecutor = new XMLExecutor("https://api2.kiparo.com/static/it_news.xml");
        JsonXmlService jsonXmlService = new JsonXmlService(jsonExecutor, xmlExecutor);
        Scanner scanner = new Scanner(System.in);
        loop: while (true){
            System.out.println("1 - Введите 1 чтобы скачать новости из JSON");
            System.out.println("2 - Введите 2 чтобы скачать новости из XML");
            System.out.println("3 - Введите 3 чтобы выйти из приложения");
            switch (scanner.nextInt()){
                case 1 -> jsonXmlService.startJson();
                case 2 -> jsonXmlService.startXml();
                case 3 -> {
                    break loop;
                }
                default -> System.out.println("Ой, введено неверное значение!");
            }
        }
    }
}

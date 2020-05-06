package ru.arsakhanov.lesson20;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.*;

public class JsonUtils {

    public static final Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Метод для получения данных по указанной ссылке
     *
     * @param url - ссылка в виде объекта URL (Uniform Resource Locator)
     * @return содержимое страницы на указанной ссылке в @param url
     */

    public static String parseUrl(URL url) {
        if (url == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        // открываем соедиение к указанному URL
        // помощью конструкции try-with-resources
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine;
            // построчно считываем результат в объект StringBuilder
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            logr.log(Level.WARNING, "Ошибка соединения");
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


    /**
     * В этом методе парсим некоторые данные о пагоде
     * @param resultJson String, который хранит в себе информацию из ссылки URL, т.е. данные Json
     */
    public static void parseCurrentWeatherJson(String resultJson) {

        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);
        try{
            FileHandler fileHandler = new FileHandler("resources//MyLogFile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logr.addHandler(fileHandler);
        }catch (IOException e) {
            System.err.println("File logger is not working" + e);
        }

        try {
            // конвертируем строку с Json в JSONObject для дальнейшего его парсинга
            JSONObject weatherJsonObject = (JSONObject) JSONValue.parseWithException(resultJson);

            JSONObject weatherWind = (JSONObject) weatherJsonObject.get("wind");

            // получаем название города, для которого смотрим погоду
            System.out.println("Название города: " + weatherJsonObject.get("name"));
            logr.log(Level.INFO,"Получаем название города = London");

            // получаем массив элементов для поля weather
            /* ... "weather": [
            {
                "id": 500,
                    "main": "Rain",
                    "description": "light rain",
                    "icon": "10d"
            }
            ], ... */
            JSONArray weatherArray = (JSONArray) weatherJsonObject.get("weather");
            logr.log(Level.INFO,"Выводим данные из ключа-массива weather");

            // достаем из массива первый элемент
            JSONObject weatherData = (JSONObject) weatherArray.get(0);

            // печатаем текущую погоду в консоль
            System.out.println("Погода на данный момент: " + weatherData.get("main"));
            logr.log(Level.INFO,"Выводим данные ключа main из массива weather");
            // и описание к ней
            System.out.println("Более детальное описание погоды: " + weatherData.get("description"));
            logr.log(Level.INFO,"Выводим данные ключа description из массива weather");

            System.out.println("Скорость ветра: " + weatherWind.get("speed"));
            logr.log(Level.INFO,"Выводим данные о скорости ветра");

        } catch (ParseException e) {
            logr.log(Level.WARNING,"Ошибка парсинга Json");
            e.printStackTrace();
        }
    }

    // создаем объект URL из указанной в параметре строки
    public static URL createUrl(String link) {
        try {
            return new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

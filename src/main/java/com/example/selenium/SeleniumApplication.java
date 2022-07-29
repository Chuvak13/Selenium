package com.example.selenium;

import com.google.gson.Gson;
import gs.common.json_funcs;
import gs.common.selenium_funcs;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SeleniumApplication {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://krisha.kz/prodazha/");
        System.out.println("Подключение к главной странице ...");
        //Document doc = Jsoup.parse(webDriver.getPageSource());
        List<C_Loc> c_locList = new ArrayList<>();
        WebElement startLocation = webDriver.findElement(By.className("region-dropdown-label"));
        startLocation.click();
        System.out.println("start");
        C_Loc c_loc_1, c_loc_2, c_loc_3;
        WebElement select1WebElement = selenium_funcs.silentFindElement(webDriver, "//select[@data-level=2]");
        String name, name1, name3;
        String dataType1;
        if (select1WebElement != null) {
            WebElement select2WebElement, select3WebElement;
            List<WebElement> select1WebElementChilds = select1WebElement.findElements(By.tagName("option"));
            for (WebElement select1WebElementChild : select1WebElementChilds) {
                name = selenium_funcs.silentGetAttribute(select1WebElementChild, "data-name");
                dataType1 = selenium_funcs.silentGetAttribute(select1WebElementChild, "data-type");
                if (name.equals("Весь Казахстан") || name.equals("Зарубежная недвижимость")) {
                    continue;
                }
                c_loc_1 = new C_Loc();
                c_loc_1.setParent_id(1);
                if (dataType1.equals("region")) {
                    c_loc_1.setIs_region(true);
                    c_loc_1.setIs_city(false);
                } else if (dataType1.equals("city")) {
                    c_loc_1.setIs_region(false);
                    c_loc_1.setIs_city(true);
                }
                c_loc_1.setIs_aul(false);
                c_loc_1.setIs_country(false);
                c_loc_1.setIs_grp(false);
                c_loc_1.setIs_settlement(false);
                c_loc_1.setIs_station(false);
                c_loc_1.setIs_village(false);
                c_loc_1.setParent_id_str(null);
                c_loc_1.setName(selenium_funcs.silentGetAttribute(select1WebElementChild, "data-name"));
                c_loc_1.setLat(Double.valueOf(selenium_funcs.silentGetAttribute(select1WebElementChild, "data-lat")));
                c_loc_1.setLon(Double.valueOf(selenium_funcs.silentGetAttribute(select1WebElementChild, "data-lon")));
                c_locList.add(c_loc_1);
                select1WebElementChild.click();
                Thread.sleep(3000);


                select2WebElement = selenium_funcs.silentFindElement(webDriver, "//select[@data-level=3]");
                List<WebElement> select2WebElementChilds = select2WebElement.findElements(By.tagName("option"));
                int iii = 0;
                for (WebElement select2WebElementChild : select2WebElementChilds) {
                    name1 = selenium_funcs.silentGetText(select2WebElementChild);

                    if (name1.equals("Все районы") || name1.equals("Все города") || iii==1) {
                        if(iii==1){
                            iii=0;
                        }
                        continue;
                    }
                    c_loc_2 = new C_Loc();
                    c_loc_2.setIs_region(false);
                    c_loc_2.setIs_city(false);
                    c_loc_2.setIs_aul(false);
                    c_loc_2.setIs_country(false);
                    c_loc_2.setIs_grp(false);
                    c_loc_2.setIs_settlement(false);
                    c_loc_2.setIs_station(false);
                    c_loc_2.setIs_village(false);
                    c_loc_2.parent_id_str = (c_loc_1.getName() + ";" + c_loc_1.getLat() + ";" + c_loc_1.getLon());
                    c_loc_2.setName(selenium_funcs.silentGetAttribute(select2WebElementChild, "data-name"));
                    if(c_loc_2.getName().equals("Бабатай") || c_loc_2.getName().equals("Таргап")){
                        iii++;
                    }
                    c_loc_2.setLat(Double.valueOf(selenium_funcs.silentGetAttribute(select2WebElementChild, "data-lat")));
                    c_loc_2.setLon(Double.valueOf(selenium_funcs.silentGetAttribute(select2WebElementChild, "data-lon")));
                    c_locList.add(c_loc_2);
                    select2WebElementChild.click();
                    Thread.sleep(3000);


                    select3WebElement = selenium_funcs.silentFindElement(webDriver, "//select[@data-level=4]");
                    if (select3WebElement != null) {
                        List<WebElement> select3WebElementChilds = select3WebElement.findElements(By.tagName("option"));

                        for (WebElement select3WebElementChild : select3WebElementChilds) {
                            name3 = selenium_funcs.silentGetText(select3WebElementChild);
                            if (name3.equals("Все микрорайоны") || name3.equals("")) {
                                continue;
                            }
                            c_loc_3 = new C_Loc();
                            c_loc_3.setIs_region(false);
                            c_loc_3.setIs_city(false);
                            c_loc_3.setIs_aul(false);
                            c_loc_3.setIs_country(false);
                            c_loc_3.setIs_grp(false);
                            c_loc_3.setIs_settlement(false);
                            c_loc_3.setIs_station(false);
                            c_loc_3.setIs_village(false);
                            c_loc_3.parent_id_str = (c_loc_2.getName() + ";" + c_loc_2.getLat() + ";" + c_loc_2.getLon());
                            c_loc_3.setName(selenium_funcs.silentGetAttribute(select3WebElementChild, "data-name"));
                            c_loc_3.setLat(Double.valueOf(selenium_funcs.silentGetAttribute(select3WebElementChild, "data-lat")));
                            c_loc_3.setLon(Double.valueOf(selenium_funcs.silentGetAttribute(select3WebElementChild, "data-lon")));
                            c_locList.add(c_loc_3);
                            select3WebElementChild.click();
                            Thread.sleep(2000);
                        }
                    }
                }
            }

        }
        c_locList.forEach(System.out::println);
        webDriver.close();


        JSONObject jsonObject = new JSONObject();
        for (C_Loc c_loc : c_locList) {
            try {
                if (c_loc.getParent_id() == null) {
                    jsonObject.put("parent_id_str", c_loc.parent_id_str);
                } else {
                    jsonObject.put("parent_id", c_loc.getParent_id());
                }
                jsonObject.put("is_aul", c_loc.getIs_aul());
                jsonObject.put("is_village", c_loc.getIs_village());
                jsonObject.put("is_station", c_loc.getIs_station());
                jsonObject.put("is_city", c_loc.getIs_city());
                jsonObject.put("is_country", c_loc.getIs_country());
                jsonObject.put("is_grp", c_loc.getIs_grp());
                jsonObject.put("is_settlement", c_loc.getIs_settlement());
                jsonObject.put("is_region", c_loc.getIs_region());
                jsonObject.put("name", c_loc.getName());
                jsonObject.put("lat", c_loc.getLat());
                jsonObject.put("lon", c_loc.getLon());
                json_funcs.get_json_string_response("http://localhost:7000/core-api/c_loc/parse_c_loc", 60, 60,
                        "POST", jsonObject.toString().getBytes(StandardCharsets.UTF_8), "application/json");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


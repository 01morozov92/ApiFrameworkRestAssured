package impl;

import api.YandexForecasts;
import config.TestConfig;
import io.restassured.http.Header;
import io.restassured.response.ValidatableResponse;
import lombok.extern.log4j.Log4j2;
import service.YandexService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static context.RunContext.RUN_CONTEXT;
import static io.restassured.RestAssured.given;

@Log4j2
public class YandexServiceImpl implements YandexService {
    TestConfig testConfig = new TestConfig();
    final Header header = new Header("X-Yandex-API-Key", "fd29a046-23cc-4519-b4a8-c4b78f9f22b0");

    @Override
    public List<YandexForecasts> getForecasts(String url) {
        String URL = testConfig.getURL_YANDEX() + url;
        List<YandexForecasts> forecasts = new ArrayList<>();

        ValidatableResponse response = given().header(header).log().everything()
                .get(URL).then().log().ifError();

        RUN_CONTEXT.put("response", response);

        try {
            forecasts = response.extract().jsonPath().getList("forecasts.", YandexForecasts.class);
        } catch (Exception e){
            log.error("Forecasts request exception: " + Arrays.toString(e.getStackTrace()));
        }
        return forecasts;
    }
}

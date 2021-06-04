package steps;

import impl.YandexServiceImpl;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import service.YandexService;

import static context.RunContext.RUN_CONTEXT;

public class MyStepdefs {
    YandexService yandexService = new YandexServiceImpl();

    @Дано("получаем погоду {string} запрос")
    public void getArticlesFromRequest(String url) {
        yandexService.getForecasts(url);
    }

    @Тогда("Статус ответа = {string}")
    public void responseStatus(String status) {
        ValidatableResponse response = RUN_CONTEXT.get("response", ValidatableResponse.class);
        int actualStatus = response.extract().statusCode();
        int expectStatus = Integer.parseInt(status);

        Assert.assertEquals(expectStatus, actualStatus);
    }
}

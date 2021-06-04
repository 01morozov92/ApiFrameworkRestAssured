package service;

import api.YandexForecasts;

import java.util.List;

public interface YandexService {
    List<YandexForecasts> getForecasts(String url);

}

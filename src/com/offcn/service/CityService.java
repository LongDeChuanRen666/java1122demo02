package com.offcn.service;

import com.offcn.daen.City;

import java.util.List;

public interface CityService {
    List<City> selectCityByCountrId(int countryId);
}

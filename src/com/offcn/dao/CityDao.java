package com.offcn.dao;

import com.offcn.daen.City;

import java.util.List;

public interface CityDao {
    List<City> selectCityByCountrId(int countryId);
}

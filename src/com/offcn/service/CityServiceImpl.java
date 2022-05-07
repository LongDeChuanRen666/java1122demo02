package com.offcn.service;

import com.offcn.daen.City;
import com.offcn.dao.CityDao;
import com.offcn.dao.CityDaoImpl;

import java.util.List;

public class CityServiceImpl implements CityService {
     CityDao cd =new CityDaoImpl();
    @Override
    public List<City> selectCityByCountrId(int countryId) {
        return cd.selectCityByCountrId(countryId);
    }
}

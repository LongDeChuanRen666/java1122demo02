package com.offcn.service;

import com.offcn.daen.Country;
import com.offcn.dao.CountryDao;
import com.offcn.dao.CountryDaoImpl;

import java.util.List;

public class CountryServiceImpl implements CountryService {
    CountryDao cd =new CountryDaoImpl();
    @Override
    public List<Country> selectAllCountry() {
        return cd.selectAllCountry();
    }
}

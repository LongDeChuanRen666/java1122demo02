package com.offcn.dao;

import com.offcn.daen.City;
import com.offcn.daen.Country;
import com.offcn.utils.Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public List<City> selectCityByCountrId(int countryId) {
        List<City> list =null;
        QueryRunner qr = new QueryRunner(Utils.getDataSource());
        String sql="select id,name from city where country_id=?";
        try {
            list = qr.query(sql,new BeanListHandler<>(City.class),countryId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

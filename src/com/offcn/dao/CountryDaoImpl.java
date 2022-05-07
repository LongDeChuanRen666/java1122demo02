package com.offcn.dao;

import com.offcn.daen.Country;
import com.offcn.utils.Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CountryDaoImpl implements CountryDao{
    @Override
    public List<Country> selectAllCountry() {
        List<Country> list =null;
        QueryRunner qr = new QueryRunner(Utils.getDataSource());
        String sql="select * from country";
        try {
            list=qr.query(sql, new BeanListHandler<>(Country.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

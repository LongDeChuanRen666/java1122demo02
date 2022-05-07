package com.offcn.servlet;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.offcn.daen.City;
import com.offcn.service.CityService;
import com.offcn.service.CityServiceImpl;
import com.offcn.service.CountryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String countryId = request.getParameter("countryId");
        CityService cs =new CityServiceImpl();
        List<City> list = cs.selectCityByCountrId(Integer.parseInt(countryId));
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer =response.getWriter();
        ObjectMapper mapper =new ObjectMapper();
        String s = mapper.writeValueAsString(list);
        writer.print(s);


    }
}

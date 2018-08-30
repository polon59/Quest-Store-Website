package com.codecool.app.controler;

import com.codecool.app.model.FactoryDAO;
import com.codecool.app.model.ManagerDAO;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

import java.io.IOException;

public class ManagerControler implements HttpHandler {

    private final int firstOnList = 0;
    private final int secondOnList = 1;
    private final int thirdOnList = 2;
    private final int fourthOnList = 3;

    private ManagerDAO managerDAO = new FactoryDAO().getManagerDAO();
    private String[] uri;
    private JtwigModel = JtwigModel.newModel();

    public ManagerControler() {

    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println(httpExchange.getRequestMethod());
        System.out.println(httpExchange.getRequestURI());

        String response = "";
        String method = httpExchange.getRequestMethod();
        String URI = httpExchange.getRequestURI().toString();
        this.uri = Common.parseUri();

        if (method.equals("GET") && uri.length == 2) {

        }


    }
}

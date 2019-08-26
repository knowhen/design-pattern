package com.when.design_pattern.mvc_pattern.controller;

import com.when.design_pattern.mvc_pattern.model.BeatModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: when
 * @create: 2019-06-24  11:54
 * @Description: TODO:
 **/
public class DJViewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BeatModel beatModel =
                (BeatModel) getServletContext().getAttribute("beatModel");

        String bpm = request.getParameter("bpm");
        if (bpm == null) {
            bpm = beatModel.getBpm() + "";
        }

        String set = request.getParameter("set");
        if (set != null) {
            int bpmNumber = 90;
            bpmNumber = Integer.parseInt(bpm);
            beatModel.setBpm(bpmNumber);
        }

        String decrease = request.getParameter("decrease");
        if (decrease != null) {
            beatModel.setBpm(beatModel.getBpm() - 1);
        }
        String increase = request.getParameter("increase");
        if (increase != null) {
            beatModel.setBpm(beatModel.getBpm() + 1);
        }
        String on = request.getParameter("on");
        if (on != null) {
            beatModel.on();
        }
        String off = request.getParameter("off");
        if (off != null) {
            beatModel.off();
        }

        request.setAttribute("beatModel", beatModel);

        RequestDispatcher dispatcher =
                request.getRequestDispatcher("/djview.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void init() throws ServletException {
        BeatModel model = new BeatModel();
        model.initialize();
        getServletContext().setAttribute("beatModel", model);
    }
}

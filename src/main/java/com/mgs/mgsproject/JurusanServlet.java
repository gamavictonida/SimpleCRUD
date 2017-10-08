/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgs.mgsproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User HP
 */
@WebServlet(name = "JurusanServlet", urlPatterns = {"/JurusanServlet"})
public class JurusanServlet extends HttpServlet {

    static JurusanService js = new JurusanService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if(action.equals("update")){
            int idJurusan = Integer.parseInt(request.getParameter("idJurusan"));
            request.setAttribute("jurusan", js.getJurusanById(idJurusan));
            request.getRequestDispatcher("UpdateJurusan.jsp").forward(request, response);
            
        }
        if(action.equals("delete")){
            js.deleteJurusan(Integer.parseInt(request.getParameter("idJurusan")));
            request.setAttribute("listJurusan", js.getAllJurusans());
        request.getRequestDispatcher("TabelJurusan.jsp").forward(request, response);
        }
        else{
        request.setAttribute("listJurusan", js.getAllJurusans());
        request.getRequestDispatcher("TabelJurusan.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("idJurusan").equals("")){
            Jurusan jurusan = new Jurusan();
        jurusan.setNamaJurusan(request.getParameter("namaJurusan"));
        
        js.createJurusan(jurusan);
        }
        else{
            Jurusan jurusan = new Jurusan();
            jurusan.setNamaJurusan(request.getParameter("namaJurusan"));
            
            js.updateJurusan(jurusan, request.getParameter("idJurusan"));
        }
        request.setAttribute("listJurusan", js.getAllJurusans());
        
        request.getRequestDispatcher("TabelJurusan.jsp").forward(request, response);
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

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
@WebServlet(name = "MahasiswaServlet", urlPatterns = {"/MahasiswaServlet"})
public class MahasiswaServlet extends HttpServlet {

   
static MahasiswaService ms = new MahasiswaService();
        
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if(action.equals("update")){
            int nim = Integer.parseInt(request.getParameter("nim"));
            request.setAttribute("mahasiswa", ms.getMahasiswaById(nim));
            request.getRequestDispatcher("UpdateMahasiswa.jsp").forward(request, response);
        }
        if(action.equals("delete")){
            ms.deleteUser(Integer.parseInt(request.getParameter("nim")));
            request.setAttribute("listMahasiswa", ms.getAllMahasiswas());
        request.getRequestDispatcher("TabelMahasiswa.jsp").forward(request, response);
        }
        else{
            request.setAttribute("listMahasiswa", ms.getAllMahasiswas());
        request.getRequestDispatcher("TabelMahasiswa.jsp").forward(request, response);
        
        }
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("nim").equals("")){
            
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(request.getParameter("nama"));
        mahasiswa.setAlamat(request.getParameter("alamat"));
        ms.createMahasiswa(mahasiswa);
        }
        else{
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(request.getParameter("nama"));
            mahasiswa.setAlamat(request.getParameter("alamat"));
            ms.updateUser(mahasiswa, request.getParameter("nim"));
        }
        
       
       request.setAttribute("listMahasiswa", ms.getAllMahasiswas());
       request.getRequestDispatcher("TabelMahasiswa.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IAutomobileDAO;
import java.util.List;
import models.Automobile;

/**
 *
 * @author USUARIO
 */
public class AutomobileDAO implements IAutomobileDAO {

    @Override
    public void insertAutomobile(Automobile automobile) throws Exception {
        try {
            System.out.println("Automobile insertado: " + automobile);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void updateAutomobile(Automobile automobile) throws Exception {
        try {
            //metodo
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void deleteAutomobile(int id) throws Exception {
        try {
            //metodo
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Automobile readAutomobile(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Automobile> listAutomobiles() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

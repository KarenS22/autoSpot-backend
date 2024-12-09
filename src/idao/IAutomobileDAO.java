package idao;

import java.util.List;
import models.Automobile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public interface IAutomobileDAO {
    public void insertAutomobile(Automobile automobile) throws Exception;
    public void updateAutomobile(Automobile automobile) throws Exception;
    public void deleteAutomobile(int id) throws Exception;
    public Automobile readAutomobile(int id) throws Exception;
    public List<Automobile> listAutomobiles() throws Exception;
    
    
}

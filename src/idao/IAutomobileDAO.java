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
    public void updateAutomobile(Automobile automobile);
    public void deleteAutomobile(int id);
    public Automobile readAutomobile (int id);
    public List<Automobile> listAutomobiles ();
    
    
}

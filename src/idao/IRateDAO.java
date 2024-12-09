/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import models.Rate;

/**
 *
 * @author USUARIO
 */
public interface IRateDAO {
    public void insertAutomobile(Rate rate);
    public void updateAutomobile(Rate rate);
    public void deleteAutomobile(int id);
    public Rate readAutomobile (int id);
    public List<Rate> listAutomobiles ();
    
}

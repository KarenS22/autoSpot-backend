/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import models.Contract;

/**
 *
 * @author USUARIO
 */
public interface IContractDAO {
    public void insertContract(Contract contract);
    public void updateContract(Contract contract);
    public Contract readContract (int id);
    public List<Contract> listContracts ();
    
}


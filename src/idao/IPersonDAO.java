/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import models.Person;

/**
 *
 * @author USUARIO
 */
public interface IPersonDAO {
    public void insertPerson(Person person);
    public void updatePerson(Person person);
    public void deletePerson(int id);
    public Person readPerson (int id);
    public List<Person> listPersons ();
    
}

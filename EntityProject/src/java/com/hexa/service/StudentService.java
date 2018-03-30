/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import com.hexa.entity.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="stubean1", mappedName="stubean2")

public class StudentService implements StudentRemote {
    
    @PersistenceContext(name ="EntityProjectPU")
    private EntityManager em;
    @Override
    public List<Student> getStudent() {
        Query qry = em.createQuery("from Student s");
        List<Student> lst = qry.getResultList();
        return lst;
    }
    
   
}

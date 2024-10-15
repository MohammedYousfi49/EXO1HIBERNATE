/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entities.Employe;
import entities.EmployeTache;
import entities.EmployeTachePk;
import entities.Tache;
import java.util.Date;
import service.EmployeService;
import service.EmployeTacheService;
import service.TacheService;

/**
 *
 * @author PC
 */
public class TestEmployeTache {
    public static void main(String[] args) {
        EmployeTacheService ets = new EmployeTacheService();
        TacheService ts = new TacheService();
        EmployeService es = new EmployeService();
        
        Tache t1 = ts.findById(1);
        Tache t2 = ts.findById(2);
        Employe e = es.findById(5);
        ets.create(new EmployeTache(new EmployeTachePk(t1.getId(), e.getId(), new Date("2022/12/12"))
                ,new Date()));
        ets.create(new EmployeTache(new EmployeTachePk(t2.getId(), e.getId(), new Date("2023/01/11"))
                ,new Date()));
        
    }
}

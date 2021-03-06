/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Ordering;

/**
 *
 * @author Саня
 */
@Stateless
public class OrderingFacade extends AbstractFacade<Ordering> implements OrderingFacadeLocal {

    @PersistenceContext(unitName = "Agency-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderingFacade() {
        super(Ordering.class);
    }
    
}

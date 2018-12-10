package com.joaomanoel.hotel.services;

import com.joaomanoel.hotel.model.Reserva;
import com.joaomanoel.hotel.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ReservaService extends AbstractCrudService<Reserva> {

    @Inject
    private GenericDao<Reserva> dao;

    @Override
    protected GenericDao<Reserva> getDao() {
        return dao;
    }

}


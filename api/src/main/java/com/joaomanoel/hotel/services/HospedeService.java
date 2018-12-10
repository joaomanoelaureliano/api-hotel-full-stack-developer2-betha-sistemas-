package com.joaomanoel.hotel.services;

import com.joaomanoel.hotel.model.Hospede;
import com.joaomanoel.hotel.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class HospedeService extends AbstractCrudService<Hospede> {

    @Inject
    private GenericDao<Hospede> dao;

    @Override
    protected GenericDao<Hospede> getDao() {
        return dao;
    }

}


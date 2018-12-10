package com.joaomanoel.contrato.services;

import com.joaomanoel.contrato.model.Contrato;
import com.joaomanoel.contrato.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ContratoService extends AbstractCrudService<Contrato> {
    
    @Inject
    private GenericDao<Contrato> dao;

    @Override
    protected GenericDao<Contrato> getDao() {
        return dao;
    }
    
}

package com.joaomanoel.hotel.services;

import com.joaomanoel.hotel.model.Hotel;
import com.joaomanoel.hotel.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

    @Stateless
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public class HotelService extends AbstractCrudService<Hotel> {

        @Inject
        private GenericDao<Hotel> dao;

        @Override
        protected GenericDao<Hotel> getDao() {
            return dao;
        }

    }


package com.joaomanoel.hotel.rest.resources;

import com.joaomanoel.hotel.model.Hospede;
import com.joaomanoel.hotel.rest.AbstractCrudResource;
import com.joaomanoel.hotel.services.AbstractCrudService;
import com.joaomanoel.hotel.services.HospedeService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("hospedes")
public class HospedeResource extends AbstractCrudResource<Hospede> {

    @Inject
    private HospedeService service;

    @Override
    protected AbstractCrudService<Hospede> getService() {
        return service;
    }

}

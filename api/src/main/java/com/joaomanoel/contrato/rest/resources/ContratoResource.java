package com.joaomanoel.contrato.rest.resources;

import com.joaomanoel.contrato.model.Contrato;
import com.joaomanoel.contrato.rest.AbstractCrudResource;
import com.joaomanoel.contrato.services.AbstractCrudService;
import com.joaomanoel.contrato.services.ContratoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("contratos")
public class ContratoResource extends AbstractCrudResource<Contrato> {

    @Inject
    private ContratoService service;

    @Override
    protected AbstractCrudService<Contrato> getService() {
        return service;
    }

}

package com.joaomanoel.hotel.rest.resources;

import com.joaomanoel.hotel.model.Reserva;
import com.joaomanoel.hotel.rest.AbstractCrudResource;
import com.joaomanoel.hotel.services.AbstractCrudService;
import com.joaomanoel.hotel.services.ReservaService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("reservas")
public class ReservaResource extends AbstractCrudResource<Reserva> {

    @Inject
    private ReservaService service;

    @Override
    protected AbstractCrudService<Reserva> getService() {
        return service;
    }

}

package com.joaomanoel.hotel.rest.resources;

import com.joaomanoel.hotel.model.Hotel;
import com.joaomanoel.hotel.rest.AbstractCrudResource;
import com.joaomanoel.hotel.services.AbstractCrudService;
import com.joaomanoel.hotel.services.HotelService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("hotel")
public class HotelResource extends AbstractCrudResource<Hotel> {

    @Inject
    private HotelService service;

    @Override
    protected AbstractCrudService<Hotel> getService() {
        return service;
    }

}

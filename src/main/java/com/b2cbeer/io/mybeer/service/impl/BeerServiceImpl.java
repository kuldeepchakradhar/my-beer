package com.b2cbeer.io.mybeer.service.impl;

import com.b2cbeer.io.mybeer.service.BeerService;
import com.b2cbeer.io.mybeer.web.modal.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Chimpam")
                .beerStyle("alve")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
            log.debug("updating beer object");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting beering object");
    }


}

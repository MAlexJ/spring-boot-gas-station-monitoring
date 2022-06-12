package com.malexj.services;

import com.malexj.model.Vendor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    public List<Vendor> findAll() {
        return List.of( //
                new Vendor("WOG", null),  //
                new Vendor("OKKO", null) //
        );
    }
}

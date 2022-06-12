package com.malexj.controllers;


import com.malexj.model.Vendor;
import com.malexj.model.api.VendorResponse;
import com.malexj.services.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest/v1")
public class ApiRestController {

    private final VendorService vendorService;

    @GetMapping("/vendors")
    public ResponseEntity<VendorResponse> getProviders() {
        List<Vendor> vendors = vendorService.findAll();
        return ResponseEntity.ok(new VendorResponse(vendors, vendors.size()));
    }

}

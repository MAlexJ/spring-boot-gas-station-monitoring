package com.malexj.model.api;

import com.malexj.model.Vendor;

import java.util.List;

public record VendorResponse(List<Vendor> vendors, int total) {
}

package com.malexj.model;

import java.util.List;

public record Vendor(String name, List<Station> stations) {
}

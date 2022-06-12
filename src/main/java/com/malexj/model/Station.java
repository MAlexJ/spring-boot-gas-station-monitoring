package com.malexj.model;

/**
 * {
 * "link": "https://api.wog.ua/fuel_stations/807",
 * "city": "Могилів-Подільський",
 * "coordinates": {
 * "longitude": 27.796942,
 * "latitude": 48.451743
 * },
 * "name": "Вінницька обл., м.Могилів-Подільський, вул.Пушкіна, 74",
 * "id": 807
 * }
 */
public record Station(Integer id, String link, String city, String name, Coordinates coordinates) {
}

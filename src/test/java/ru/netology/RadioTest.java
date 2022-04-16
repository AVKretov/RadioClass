package ru.netology;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {

    @Test
    void setStationUnderLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.setStation(-1));
    }

    @Test
    void setStationOverLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.setStation(15));
    }

    @Test
    void setStationNormal() {
        Radio radio = new Radio();
        assertEquals(5, radio.setStation(5));
    }

    @Test
    void nextNormal() {
        Radio radio = new Radio();
        radio.setStation(3);
        radio.next();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void nextCritical() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevCritical() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void prevNormal() {
        Radio radio = new Radio();
        radio.setStation(4);
        radio.prev();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void increaseVolumeNormal() {
        Radio radio = new Radio();
        radio.setVolume(3);
        radio.increaseVolume();
        assertEquals(4, radio.getCurrentVolume());

    }

    @Test
    void increaseVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeNormal() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    void setVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
}
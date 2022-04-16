package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int setVolume(int volume) {
        if (volume > 10) {
            return currentVolume;
        }
        if (volume < 0) {
            return currentVolume;
        }
        this.currentVolume = volume;

        return volume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int setStation(int station) {
        if (station > 9) {
            return currentStation;
        }
        if (station < 0) {
            return currentStation;
        }
        this.currentStation = station;

        return station;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        {
            currentVolume = currentVolume - 1;
        }
    }


}
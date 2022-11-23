package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int numberOfRadioStations = 10;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return this.numberOfRadioStations;
    }

    public int getFirstRadioStation() {
        return this.firstRadioStation;
    }

    public int getLastRadioStation() {
        return this.lastRadioStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > this.lastRadioStation) {
            newCurrentRadioStation = this.firstRadioStation;
        }

        if (newCurrentRadioStation < this.firstRadioStation) {
            newCurrentRadioStation = this.lastRadioStation;
        }

        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > this.maxVolume) {
            newCurrentVolume = this.maxVolume;
        }

        if (newCurrentVolume < this.minVolume) {
            newCurrentVolume = this.minVolume;
        }

        this.currentVolume = newCurrentVolume;
    }
}

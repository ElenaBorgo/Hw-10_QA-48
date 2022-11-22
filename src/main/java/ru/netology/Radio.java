package ru.netology;

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

    public Radio() {
        this.numberOfRadioStations = getNumberOfRadioStations();
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > lastRadioStation) {
            newCurrentRadioStation = firstRadioStation;
        }
        if (newCurrentRadioStation < firstRadioStation) {
            newCurrentRadioStation = lastRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }
}

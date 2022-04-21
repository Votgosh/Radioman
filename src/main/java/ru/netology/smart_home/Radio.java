package ru.netology.smart_home;

public class Radio {
    private int currentStatusStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentStatusVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int sumRadioStation) {
        this.maxRadioStation = sumRadioStation - 1;
    }

    public int getCurrentStatusStation() {
        return currentStatusStation;
    }

    public void setCurrentStatusStation(int currentStatusStation) {
        if (currentStatusStation < minRadioStation) {
            return;
        }
        if (currentStatusStation > maxRadioStation) {
            return;
        }
        this.currentStatusStation = currentStatusStation;
    }

    public void next() { //станции вперед
        this.currentStatusStation = currentStatusStation + 1;
        if (currentStatusStation > maxRadioStation) {
            this.currentStatusStation = minRadioStation;
        }
    }

    public void prev() { //станции назад
        this.currentStatusStation = currentStatusStation - 1;
        if (currentStatusStation < minRadioStation) {
            this.currentStatusStation = maxRadioStation;
        }
    }

    public void stationIn(int stationIn) { //выбрать станцию
        if (stationIn < 0) {
            return;
        }
        if (stationIn > 9) {
            return;
        }
        this.currentStatusStation = stationIn;
    }

    public int getCurrentStatusVolume() {
        return currentStatusVolume;
    }

    public void setCurrentStatusVolume(int currentStatusVolume) {
        this.currentStatusVolume = currentStatusVolume;
    }

    public void volumeUp() {//прибавление
        this.currentStatusVolume = currentStatusVolume + 1;
        if (currentStatusVolume > maxVolume) {
            this.currentStatusVolume = minVolume;
        }
    }

    public void volumeDown() {//убавление
        this.currentStatusVolume = currentStatusVolume - 1;
        if (currentStatusVolume < minVolume) {
            this.currentStatusVolume = maxVolume;
        }
    }
}

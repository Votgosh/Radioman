package ru.netology.smart_home;

public class Radio {
    private int currentStatusStation;
    private int currentStatusVolume;

    public int getCurrentStatusStation() {
        return currentStatusStation;
    }

    public void setCurrentStatusStation(int currentStatusStation) {
        this.currentStatusStation = currentStatusStation;
    }

    public void next() { //станции вперед
        this.currentStatusStation = currentStatusStation + 1;
        if (currentStatusStation == 10) {
            this.currentStatusStation = 0;
        }
    }

    public void prev() { //станции назад
        this.currentStatusStation = currentStatusStation - 1;
        if (currentStatusStation == -1) {
            this.currentStatusStation = 9;
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
        if (currentStatusVolume == 11) {
            this.currentStatusVolume = 10;
        }
    }

    public void volumeDown() {//убавление
        this.currentStatusVolume = currentStatusVolume - 1;
        if (currentStatusVolume == -1) {
            this.currentStatusVolume = 0;
        }
    }
}

package ru.netology.smart_home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    public void setCurrentStationInitialStation() {
        Radio cond = new Radio();

        int expected = 0;
        cond.setCurrentStatusStation(13);

        assertEquals(expected, cond.getCurrentStatusStation());
    }

    @Test
    public void setCurrentStationOrderStation() {
        int sumStation = 40;
        Radio cond = new Radio(sumStation);

        int expected = 13;
        cond.setCurrentStatusStation(13);

        assertEquals(expected, cond.getCurrentStatusStation());
    }

    @Test
    public void getCurrentStatusStation() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(5);

        int expected = 5;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStatusStation() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(4);

        int expected = 4;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStatusStationReturn() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(0);
        cond.next();

        int expected = 1;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextTen() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(9);
        cond.next();

        int expected = 0;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(5);
        cond.prev();

        int expected = 4;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevFail() {
        Radio cond = new Radio();
        cond.setCurrentStatusStation(0);
        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationIn() {
        Radio cond = new Radio();
        cond.stationIn(5);

        int expected = 5;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationInFailNull() {
        Radio cond = new Radio();
        cond.stationIn(-1);

        int expected = 0;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationInFailNine() {
        Radio cond = new Radio();
        cond.stationIn(10);

        int expected = 0;
        int actual = cond.getCurrentStatusStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStatusVolume() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(6);

        int expected = 6;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStatusVolume() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(7);

        int expected = 7;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(0);
        cond.volumeUp();

        int expected = 1;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMax() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(10);
        cond.volumeUp();

        int expected = 11;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMinVolume() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(101);
        cond.volumeUp();

        int expected = 0;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(5);
        cond.volumeDown();

        int expected = 4;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeDownMax() {
        Radio cond = new Radio();
        cond.setCurrentStatusVolume(0);
        cond.volumeDown();

        int expected = 100;
        int actual = cond.getCurrentStatusVolume();

        assertEquals(expected, actual);
    }
}
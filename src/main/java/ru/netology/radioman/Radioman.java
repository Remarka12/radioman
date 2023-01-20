package ru.netology.radioman;
public class Radioman {
    private int currentVolume;
    private int numberStation;
    private int maxNumber;
    private int countOfStation;
    private int maxVolume = 100;

    public Radioman() {
        maxNumber = 9;
    }
    public Radioman(int countOfStation) {
        maxNumber = countOfStation - 1;
        this.countOfStation = countOfStation;
    }


    public int getNumberStation() {
        return numberStation;
    }

    public void setStation(int newNumberStation) {
        if (newNumberStation > maxNumber) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        this.numberStation = newNumberStation;
    }

    public int next() {

        if (numberStation != maxNumber) {
            numberStation++;
        } else {
            numberStation = 0;
        }
        return numberStation;
    }

    public int prev() {
        if (numberStation != 0) {
            numberStation--;
        } else {
            numberStation = maxNumber;
        }
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume ) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}



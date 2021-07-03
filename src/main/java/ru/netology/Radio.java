package ru.netology;

public class Radio {
    public int numberMax;
    public int FINAL_NUMBER_MIN = 0;
    public int FINAL_VOLUME_MAX = 100;
    public int FINAL_VOLUME_MIN = 0;
    public boolean on = false;

    public int number; //current value of the station number
    public int volume; //current value of the sound volume


    public Radio() {
        this.numberMax = 10;
        this.number = FINAL_NUMBER_MIN;
        this.volume = FINAL_VOLUME_MAX;
        this.volume = FINAL_VOLUME_MIN;
        this.on = false;
    }

    public Radio(
            int numberMax
    ) {
        this.numberMax = numberMax;
        this.number = FINAL_NUMBER_MIN;
        this.volume = FINAL_VOLUME_MIN;
        this.on = false;
    }

    public void setNumber(int number) {
        if (number >= FINAL_NUMBER_MIN && number <= numberMax)
            this.number = number;
    }

    public void setNumberNext() {
        if (number == numberMax) {
            number = FINAL_NUMBER_MIN;
        } else {
            number = number + 1;
        }
    }

    public void setNumberPrev() {
        if (number == FINAL_NUMBER_MIN) {
            number = numberMax;
        } else {
            number = number - 1;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setVolumePlus() {
        if (volume < FINAL_VOLUME_MAX) {
            volume = volume + 1;
        }
    }

    public void setVolumeMinus() {
        if (volume > FINAL_VOLUME_MIN) {
            volume = volume - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

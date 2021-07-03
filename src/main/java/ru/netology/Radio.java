package ru.netology;

public class Radio {
    public int numberStation = 10;
    public int FINAL_NUMBER_MAX = numberStation - 1;
    public int FINAL_NUMBER_MIN = 0;
    public int FINAL_VOLUME_MAX = 100;
    public int FINAL_VOLUME_MIN = 0;
    public boolean on = false;

    public int number = FINAL_NUMBER_MIN; //current value of the station number
    public int volume = FINAL_VOLUME_MIN; //current value of the sound volume


    public Radio() {
    }

    public Radio(
            int numberStation
    ) {
        this.numberStation = numberStation;
        this.FINAL_NUMBER_MAX = numberStation - 1;
    }

    public void setNumber(int number) {
        if (number >= FINAL_NUMBER_MIN && number <= FINAL_NUMBER_MAX)
            this.number = number;
    }

    public void setNumberNext() {
        if (number == FINAL_NUMBER_MAX) {
            number = FINAL_NUMBER_MIN;
        } else {
            number = number + 1;
        }
    }

    public void setNumberPrev() {
        if (number == FINAL_NUMBER_MIN) {
            number = FINAL_NUMBER_MAX;
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

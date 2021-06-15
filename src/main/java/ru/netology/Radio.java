package ru.netology;

public class Radio {
    int FINAL_NUMBER_MAX = 9;
    int FINAL_NUMBER_MIN = 0;
    int FINAL_VOLUME_MAX = 10;
    int FINAL_VOLUME_MIN = 0;

    int number = FINAL_NUMBER_MIN;
    int volume = FINAL_VOLUME_MIN;
    boolean on = false;

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

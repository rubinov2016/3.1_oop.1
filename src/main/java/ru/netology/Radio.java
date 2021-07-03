package ru.netology;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@RequiredArgsConstructor
//@Builder

public class Radio {
    //@NonNull
    int numberMax = 10;
    int FINAL_NUMBER_MIN = 0;
    int FINAL_VOLUME_MAX = 100;
    int FINAL_VOLUME_MIN = 0;
    boolean on = false;
    int number; //current value of the station number
    int volume; //current value of the sound volume


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

    //   public int getNumber() {
    //      return number;
    // }

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

    //  public int getVolume() {
    //      return volume;
    //  }

//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }
}

package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetNumberMin() {
        Radio radio = new Radio();
        int number;
        number = radio.FINAL_NUMBER_MIN;
        radio.setNumber(number);
        assertEquals(number, radio.getNumber());
    }

    @Test
    public void shouldSetNumberMax() {
        Radio radio = new Radio();
        int number;
        number = radio.numberMax;
        radio.setNumber(number);
        assertEquals(number, radio.getNumber());
    }

    @Test
    public void shouldSetNumberMid() {
        Radio radio = new Radio();
        int number;
        number = radio.FINAL_NUMBER_MIN + 3;
        radio.setNumber(number);
        assertEquals(number, radio.getNumber());
    }

    @Test
    public void shouldSetNumberLessMin() {
        Radio radio = new Radio();
        int numberMin = radio.FINAL_NUMBER_MIN;
        int numberOut = numberMin - 1;
        radio.setNumber(numberMin);
        radio.setNumber(numberOut);
        assertEquals(numberMin, radio.getNumber());
    }

    @Test
    public void shouldSetNumberMoreMax() {
        Radio radio = new Radio();
        int numberMax = radio.numberMax;
        int numberOut = numberMax + 1;
        radio.setNumber(numberMax);
        radio.setNumber(numberOut);
        assertEquals(numberMax, radio.getNumber());
    }

    @Test
    public void shouldSetNumberNextMin() {
        Radio radio = new Radio();
        int number;
        number = radio.FINAL_NUMBER_MIN;
        radio.setNumber(number);
        radio.setNumberNext();
        assertEquals(number + 1, radio.getNumber());
    }

    @Test
    public void shouldSetNumberNextMid() {
        Radio radio = new Radio();
        int number;
        number = radio.FINAL_NUMBER_MIN + 2;
        radio.setNumber(number);
        radio.setNumberNext();
        assertEquals(number + 1, radio.getNumber());
    }

    @Test
    public void shouldSetNumberNextMax() {
        Radio radio = new Radio();
        int number;
        number = radio.numberMax;
        radio.setNumber(number);
        radio.setNumberNext();
        assertEquals(radio.FINAL_NUMBER_MIN, radio.getNumber());
    }

    @Test
    public void shouldSetNumberPrevMin() {
        Radio radio = new Radio();
        int number;
        number = radio.FINAL_NUMBER_MIN;
        radio.setNumber(number);
        radio.setNumberPrev();
        assertEquals(radio.numberMax, radio.getNumber());
    }

    @Test
    public void shouldSetNumberPrevMid() {
        Radio radio = new Radio();
        int number;
        number = radio.FINAL_NUMBER_MIN + 2;
        radio.setNumber(number);
        radio.setNumberPrev();
        assertEquals(number - 1, radio.getNumber());
    }

    @Test
    public void shouldSetNumberPrevMax() {
        Radio radio = new Radio();
        int number;
        number = radio.numberMax;
        radio.setNumber(number);
        radio.setNumberPrev();
        assertEquals(number - 1, radio.getNumber());
    }

    @Test
    public void shouldSetVolumePlusMin() {
        Radio radio = new Radio();
        radio.volume = radio.FINAL_VOLUME_MIN;
        radio.setVolumePlus();
        assertEquals(radio.FINAL_VOLUME_MIN + 1, radio.getVolume());
    }

    @Test
    public void shouldSetVolumePlusMid() {
        Radio radio = new Radio();
        radio.volume = radio.FINAL_VOLUME_MIN + 2;
        radio.setVolumePlus();
        assertEquals(radio.FINAL_VOLUME_MIN + 3, radio.getVolume());
    }

    @Test
    public void shouldSetVolumePlusMax() {
        Radio radio = new Radio();
        radio.volume = radio.FINAL_VOLUME_MAX;
        radio.setVolumePlus();
        assertEquals(radio.FINAL_VOLUME_MAX, radio.getVolume());
    }

    @Test
    public void shouldSetVolumeMinusMin() {
        Radio radio = new Radio();
        radio.volume = radio.FINAL_VOLUME_MIN;
        radio.setVolumeMinus();
        assertEquals(radio.FINAL_VOLUME_MIN, radio.getVolume());
    }

    @Test
    public void shouldSetVolumeMinusMid() {
        Radio radio = new Radio();
        radio.volume = radio.FINAL_VOLUME_MIN + 2;
        radio.setVolumeMinus();
        assertEquals(radio.FINAL_VOLUME_MIN + 1, radio.getVolume());
    }

    @Test
    public void shouldSetVolumeMinusMax() {
        Radio radio = new Radio();
        radio.volume = radio.FINAL_VOLUME_MAX;
        radio.setVolumeMinus();
        assertEquals(radio.FINAL_VOLUME_MAX - 1, radio.getVolume());
    }

    @Test
    public void shouldIsOnTrue() {
        Radio radio = new Radio();
        radio.setOn(true);
        assertEquals(true, radio.isOn());
    }
    @Test
    public void shouldIsOnFalse() {
        Radio radio = new Radio();
        radio.setOn(false);
        assertEquals(false, radio.isOn());
    }

    @Test
    public void shouldSetOnTrue() {
        Radio radio = new Radio();
        radio.setOn(true);
        assertEquals(true, radio.isOn());
    }

    @Test
    public void shouldSetOnFalse() {
        Radio radio = new Radio();
        radio.setOn(false);
        assertEquals(false, radio.isOn());
    }
}
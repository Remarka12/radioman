package ru.netology.radioman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiomanTest {
    @Test

    public void souldSetStation() {

        Radioman radio = new Radioman();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetUncorrectStation() {
        Radioman radio = new Radioman();
        radio.setStation(-10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldOnNext() {

        Radioman radio = new Radioman();
        radio.setStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextAfterMax() {

        Radioman radio = new Radioman();
        radio.setStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldOnPrev() {

        Radioman radio = new Radioman();
        radio.setStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldOnPrevAfterMin() {

        Radioman radio = new Radioman();
        radio.setStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldSetVolume() {

        Radioman radio = new Radioman();
        radio.setVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldNotSetUncorrectVolume(){

        Radioman radio = new Radioman();
        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldAddVolume() {

        Radioman radio = new Radioman();
        radio.setVolume(9);
        radio.increaseVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldStopAddVolume() {

        Radioman radio = new Radioman();
        radio.setVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldDownVolume() {

        Radioman radio = new Radioman();
        radio.setVolume(5);

        radio.downVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopDownVolume() {
        Radioman radio = new Radioman();
        radio.setVolume(0);

        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinusVolume(){
        Radioman radio = new Radioman();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

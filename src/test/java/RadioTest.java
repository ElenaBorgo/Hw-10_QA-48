import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void numberOfStations() {
        Radio radio = new Radio(50);

        Assertions.assertEquals(50, radio.getNumberOfRadioStations());
    }

    @Test
    public void ifForgotNumberOfStations() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberOfRadioStations());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetLastRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(radio.getLastRadioStation());

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetFirstRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(radio.getFirstRadioStation());

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(50);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(58);

        Assertions.assertEquals(58, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(115);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
}
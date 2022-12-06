import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void numberOfStations() {
        Radio radio = new Radio(50);

        Assertions.assertEquals(50, radio.getNumberOfRadioStations());
    }

    @Test
    public void ifForgotNumberOfStations() {
        Assertions.assertEquals(10, radio.getNumberOfRadioStations());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentRadioStation(7);

        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetLastRadioStation() {
        radio.setCurrentRadioStation(radio.getLastRadioStation());

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetFirstRadioStation() {
        radio.setCurrentRadioStation(radio.getFirstRadioStation());

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        radio.setCurrentRadioStation(50);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(58);

        Assertions.assertEquals(58, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        radio.setCurrentVolume(115);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
}
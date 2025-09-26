package adapter.adapers;

import adapter.speed_classes.MilesPerHour;
import adapter.speed_interface.SpeedConversionInterface;

public class SpeedObjectAdapter implements SpeedConversionInterface {
    private MilesPerHour milesPerHour;

    public SpeedObjectAdapter(MilesPerHour milesPerHour) {
        this.milesPerHour = milesPerHour;
    }

    @Override
    public double getSpeedKmh() {
        return milesPerHour.getSpeedMh()*1.60934;
    }

}

package adapter.adapers;

import adapter.speed_classes.MilesPerHour;
import adapter.speed_interface.SpeedConversionInterface;

public class SpeedClassAdapter extends MilesPerHour implements SpeedConversionInterface {

    public SpeedClassAdapter(MilesPerHour milesPerHour) {
        super(milesPerHour.getSpeedMh());
    }

    @Override
    public double getSpeedKmh() {
        return getSpeedMh() * 1.60934;
    }

}

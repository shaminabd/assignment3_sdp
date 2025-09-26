package adapter.adapers;

import adapter.speed_classes.KilometerPerHour;
import adapter.speed_classes.MilesPerHour;

public class SpeedClassAdapter extends KilometerPerHour {
    private MilesPerHour milesPerHour;

    public SpeedClassAdapter(MilesPerHour milesPerHour) {
        super(milesPerHour.getSpeedMh() * 1.60934);
        this.milesPerHour = milesPerHour;
    }

    @Override
    public double getSpeedKmh() {
        return milesPerHour.getSpeedMh()*1.60934;
    }

}

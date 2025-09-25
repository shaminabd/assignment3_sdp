package class_adapter;

import class_adapter.speed_classes.KilometerPerHour;
import class_adapter.speed_classes.MilesPerHour;

public class SpeedAdapter extends KilometerPerHour {
    private MilesPerHour milesPerHour;

    public SpeedAdapter(MilesPerHour milesPerHour) {
        super(milesPerHour.getSpeedMh() * 1.60934);
        this.milesPerHour = milesPerHour;
    }

    @Override
    public double getSpeedKmh() {
        return milesPerHour.getSpeedMh()*1.60934;
    }

}

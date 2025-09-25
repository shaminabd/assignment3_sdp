package class_adapter;

import class_adapter.speed_classes.KilometerPerHour;

public class KazakhRoadLimit {
    private double speedLimit;

    public KazakhRoadLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public double getSpeedLimitKmh() {
        return speedLimit;
    }

    public boolean isSpeedLimitReached(KilometerPerHour kmh) {
        return this.speedLimit >= 30 && this.speedLimit <= 60 && this.speedLimit <= kmh.getSpeedKmh();
    }
}

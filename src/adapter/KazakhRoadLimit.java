package adapter;

import adapter.speed_classes.KilometerPerHour;

public class KazakhRoadLimit {
    private double speedLimit;

    public KazakhRoadLimit(KilometerPerHour speedLimit) {
        this.speedLimit = speedLimit.getSpeedKmh();
    }

    public double getSpeedLimitKmh() {
        return speedLimit;
    }

    public boolean isSpeedLimitReached() {
        return this.speedLimit >= 30 && this.speedLimit <= 60;
    }
}

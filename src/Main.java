import class_adapter.KazakhRoadLimit;
import class_adapter.SpeedAdapter;
import class_adapter.speed_classes.KilometerPerHour;
import class_adapter.speed_classes.MilesPerHour;

public class Main {
    public static void main(String[] args) {
        KazakhRoadLimit speed1 = new KazakhRoadLimit(30);
        KazakhRoadLimit speed2 = new KazakhRoadLimit(60);
        KazakhRoadLimit speed3 = new KazakhRoadLimit(90);
        KilometerPerHour speed4 = new KilometerPerHour(60);

        System.out.println("~Class adapter~");
        System.out.println();
        System.out.println("Is speed 1 with the 30 km per hour safe in city? "+speed1.isSpeedLimitReached(speed4));
        System.out.println("Is speed 2 with the 60 km per hour safe in city? "+speed2.isSpeedLimitReached(speed4));
        System.out.println("Is speed 3 with the 90 km per hour safe in city? "+speed3.isSpeedLimitReached(speed4));

        MilesPerHour speed5 = new MilesPerHour(35);
        MilesPerHour speed6 = new MilesPerHour(40);
        SpeedAdapter adapter1 = new SpeedAdapter(speed5);
        SpeedAdapter adapter2 = new SpeedAdapter(speed6);

        System.out.println();
        System.out.println("Show speed5 in miles per hours: "+speed5.getSpeedMh());
        System.out.println("Show speed6 in miles per hours: "+speed6.getSpeedMh());
        System.out.println("Show speed5 in km hours: "+adapter1.getSpeedKmh());
        System.out.println("Show speed6 in km hours: "+adapter2.getSpeedKmh());

        KazakhRoadLimit speed5_In_Kmh = new KazakhRoadLimit(adapter1.getSpeedKmh());
        KazakhRoadLimit speed6_In_Kmh = new KazakhRoadLimit(adapter2.getSpeedKmh());
        System.out.println();
        System.out.println("Is speed 5 with " + speed5_In_Kmh.getSpeedLimitKmh() + " km per hour safe in city? " + speed5_In_Kmh.isSpeedLimitReached(speed4));
        System.out.println("Is speed 6 with " + speed6_In_Kmh.getSpeedLimitKmh() + " km per hour safe in city? " + speed6_In_Kmh.isSpeedLimitReached(speed4));
    }
}
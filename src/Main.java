import adapter.KazakhRoadLimit;
import adapter.adapers.SpeedClassAdapter;
import adapter.adapers.SpeedObjectAdapter;
import adapter.speed_classes.KilometerPerHour;
import adapter.speed_classes.MilesPerHour;

public class Main {
    public static void main(String[] args) {
        KazakhRoadLimit speed1 = new KazakhRoadLimit(new KilometerPerHour(30));
        KazakhRoadLimit speed2 = new KazakhRoadLimit(new KilometerPerHour(60));
        KazakhRoadLimit speed3 = new KazakhRoadLimit(new KilometerPerHour(90));

        System.out.println("~Class adapter~");
        System.out.println();
        System.out.println("Is speed 1 with the 30 km per hour safe in city? "+speed1.isSpeedLimitReached());
        System.out.println("Is speed 2 with the 60 km per hour safe in city? "+speed2.isSpeedLimitReached());
        System.out.println("Is speed 3 with the 90 km per hour safe in city? "+speed3.isSpeedLimitReached());

        MilesPerHour speed5 = new MilesPerHour(35);
        MilesPerHour speed6 = new MilesPerHour(40);
        SpeedClassAdapter adapter1 = new SpeedClassAdapter(speed5);
        SpeedClassAdapter adapter2 = new SpeedClassAdapter(speed6);

        System.out.println();
        System.out.println("Show speed5 in miles per hours: "+speed5.getSpeedMh());
        System.out.println("Show speed6 in miles per hours: "+speed6.getSpeedMh());
        System.out.println("Show speed5 in km hours: "+adapter1.getSpeedKmh());
        System.out.println("Show speed6 in km hours: "+adapter2.getSpeedKmh());

        KazakhRoadLimit speed5_In_Kmh = new KazakhRoadLimit(new KilometerPerHour(adapter1.getSpeedKmh()));
        KazakhRoadLimit speed6_In_Kmh = new KazakhRoadLimit(new KilometerPerHour(adapter2.getSpeedKmh()));
        System.out.println();
        System.out.println("Is speed 5 with " + speed5_In_Kmh.getSpeedLimitKmh() + " km per hour safe in city? " + speed5_In_Kmh.isSpeedLimitReached());
        System.out.println("Is speed 6 with " + speed6_In_Kmh.getSpeedLimitKmh() + " km per hour safe in city? " + speed6_In_Kmh.isSpeedLimitReached());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("~Object adapter~");
        System.out.println();
        SpeedObjectAdapter adapter1_1 = new SpeedObjectAdapter(speed5);
        SpeedObjectAdapter adapter2_1 = new SpeedObjectAdapter(speed6);

        KazakhRoadLimit speed5_In_Kmh_1 = new KazakhRoadLimit(new KilometerPerHour(adapter1_1.getSpeedKmh()));
        KazakhRoadLimit speed6_In_Kmh_2 = new KazakhRoadLimit(new KilometerPerHour(adapter2_1.getSpeedKmh()));
        System.out.println();
        System.out.println("Is speed 5 with " + speed5_In_Kmh_1.getSpeedLimitKmh() + " km per hour safe in city? " + speed5_In_Kmh_1.isSpeedLimitReached());
        System.out.println("Is speed 6 with " + speed6_In_Kmh_2.getSpeedLimitKmh() + " km per hour safe in city? " + speed6_In_Kmh_2.isSpeedLimitReached());

    }
}
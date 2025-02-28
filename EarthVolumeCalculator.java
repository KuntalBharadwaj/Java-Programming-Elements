public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm / 1.609;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

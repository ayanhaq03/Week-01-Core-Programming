public class VolumeOfEarth {
    public static void main(String[] args) {
        // radius of the Earth in kilometers
        double radiusKm = 6378;
        
        // Converting the radius to miles 
        double radiusMiles = radiusKm * 0.621371;
        
        // Calculating volume of earth
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Calculating the volume of Earth in miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                           " and in cubic miles is " + volumeMiles3);
    }
}

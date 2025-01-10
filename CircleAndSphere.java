
public class CircleAndSphere {
    // Immutable constant for pi
    private static final double PI = 3.14159;

    // Mutable variable for radius
    private double radius;

    // Constructor to initialize radius
    public CircleAndSphere(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Method to calculate area of the circle
    public double calculateAreaOfCircle() {
        return PI * radius * radius;
    }

    // Method to calculate volume of the sphere
    public double calculateVolumeOfSphere() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    // Method to calculate surface area of the sphere
    public double calculateSurfaceAreaOfSphere() {
        return 4 * PI * radius * radius;
    }

    // Method to display all calculations
    public void displayCalculations() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference of Circle: " + calculateCircumference());
        System.out.println("Area of Circle: " + calculateAreaOfCircle());
        System.out.println("Volume of Sphere: " + calculateVolumeOfSphere());
        System.out.println("Surface Area of Sphere: " + calculateSurfaceAreaOfSphere());
    }

    // Main method
    public static void main(String[] args) {
        // Create an object with an initial radius
        CircleAndSphere shape = new CircleAndSphere(5.0);

        // Display calculations for the initial radius
        System.out.println("Calculations for Radius 5.0:");
        shape.displayCalculations();

        // Update the radius
        System.out.println("\nUpdating radius to 7.0...");
        shape.setRadius(7.0);

        // Display calculations for the updated radius
        System.out.println("Calculations for Radius 7.0:");
        shape.displayCalculations();
    }
}


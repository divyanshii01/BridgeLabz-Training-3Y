class CircleClass {
    double radius;

    // Default constructor calls parameterized one
    CircleClass() {
        this(1.0);
    }

    // Parameterized constructor
    CircleClass(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

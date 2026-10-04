public record Triangle(double a, double b, double c) {
    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Sides of a triangle can't be negative");
        }
        if (!Triangle.areValidTriangleSides(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
    }

    private static boolean areValidTriangleSides(double a, double b, double c) {
        var max = Math.max(a, Math.max(b, c));
        var sum = a + b + c;

        return sum - max > max;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        var semiPerim = getPerimeter() * 0.5;

        return Math.sqrt(semiPerim * (semiPerim - a) * (semiPerim - b) * (semiPerim - c));
    }

    public boolean isEquilateral(){
        return a == b && b == c;
    }
}

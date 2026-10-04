class Main {
    public static void main(String[] args) {
        var triangle = new Triangle(3, 4, 5);

        System.out.println(triangle);
        System.out.println("isEquilateral: " + triangle.isEquilateral());
        System.out.println("area: " + triangle.getArea());
    }
}

public class ShapeLab {
    public static void main(String[] args) {
        printHeader();

        double circleRadius = 4.0;
        double circleArea = calculateCircleArea(circleRadius);
        System.out.printf(
                "Circle area | radius=%.1f | value=%.4f%n",
                circleRadius,
                circleArea
        );

        double circlePerimeter = calculateCirclePerimeter(circleRadius);
        System.out.printf(
                "Circle perimeter | radíus=%.1f | value=%.6f%n", circleRadius, circlePerimeter
        ) ;
        double triangleBase = 6.0;
        double triangleHeight = 5.0;
        double triangleArea = calculateTriangleArea (
                triangleBase,
                triangleHeight
        );

        System.out.printf(
                "Triangle area | base=%.1f height=%.1f | value=%.4f%n",
                triangleBase,
                triangleHeight,
                triangleArea
        );

        double sideOne = 3.0;
        double sideTwo = 4.0;
        double sideThree = 5.0;
        double trianglePerimeter = calculateTrianglePerimeter(
                sideOne,
                sideTwo,
                sideThree
        );

        System.out.printf(
                "Triangle perimeter | sides=%.1f,%.1f,%.1f | value=%.4f%n",
                sideOne,
                sideTwo,
                sideThree,
                trianglePerimeter

        );

        double rectangleLength = 8.0;
        double rectangleWidth = 3.0;
        double rectangleArea = calculateRectangleArea(
                rectangleLength,
                rectangleWidth
        ) ;

        System.out.printf(
                "Rectangle area | length=%.1f width=%.1f | value-%4f%n",
                rectangleLength,
                rectangleWidth,
                rectangleArea
        );

        System.out.println();
        int circleCount = 3;
        int triangleCount = 2;
        int rectangleCount = 4;
        double totalArea = calculateTotalShapeArea(
                circleCount,
                triangleCount,
                rectangleCount
        );
        System.out .printf(
        "Batch area | circles=%d triangles=%d rectangles=%d | value=%.6f%n",
                circleCount,
                triangleCount,
                rectangleCount,
                totalArea
        );
    }

    public static void printHeader() {
        System.out.println("Parth");
        System.out.println("COP2047");
        System.out.println("Lab 3 - Shape Method Calls");
        System.out.println();
    }

    public static double calculateCircleArea(double circleRadius) {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    public static double calculateCirclePerimeter(double circleRadius) {
        return 2 * Math.PI * circleRadius;
    }

    public static double calculateTriangleArea(
            double base,
            double height
    ){
        return .5 * base * height;
    }

    public static double calculateTrianglePerimeter(
            double sideOne,
            double sideTwo,
            double sideThree
    ){
        return sideOne + sideTwo + sideThree;
    }

    public static double calculateRectangleArea(
            double length,
            double width
    ){
        return length * width;
    }

    public static double calculateTotalShapeArea(
            int circleCount,
            int triangleCount,
            int rectangleCount
    ){
        return ShapeBatchCalculator.calculateTotalArea(
                circleCount,
                triangleCount,
                rectangleCount
        );
    }
}

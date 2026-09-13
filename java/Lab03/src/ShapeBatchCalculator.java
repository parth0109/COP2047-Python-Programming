public class ShapeBatchCalculator {
    public static double calculateTotalArea(
            int circleCount,
            int triangleCount,
            int rectangleCount
    ){
        double circleRadius = 4.0;
        double triangleBase = 6.0;
        double triangleHeight = 5.0;
        double rectangleLength = 8.0;
        double rectangleWidth = 3.0;

        double oneCircleArea = ShapeLab.calculateCircleArea(circleRadius);
        double oneTriangleArea = ShapeLab.calculateTriangleArea(triangleBase, triangleHeight);
        double oneRectangleArea = ShapeLab.calculateRectangleArea(rectangleWidth, rectangleLength);
        double totalCircleArea = circleCount * oneCircleArea;
        double totalTriangleArea = triangleCount * oneTriangleArea;
        double totalRectangleArea = rectangleCount * oneRectangleArea;
        return totalCircleArea + totalTriangleArea + totalRectangleArea;
    }













}

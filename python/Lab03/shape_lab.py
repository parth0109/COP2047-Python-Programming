import math
import shape_batch_calculator

def main() -> None:
    print_header()

    circle_radius: float = 4.0
    circle_area: float = calculate_circle_area(circle_radius)
    print(
        f"Circle area | radius={circle_radius:.1f} | "
        f"value={circle_area:.4f}"
    )

    circle_perimeter: float = calculate_circle_perimeter(circle_radius)
    print(
        f"Circle perimeter | radius={circle_radius:.1f} | "
        f"value={circle_perimeter:.4f}"
    )

    triangle_base: float = 4.0
    triangle_height: float = 5.0
    triangle_area: float = calculate_triangle_area(
        triangle_base,
        triangle_height
    )
    print(
        f"Triangle area | base={triangle_base:.1f} | "
        f"height={triangle_height:.1f} | value={triangle_area:.4f}"
    )

    side_one: float = 3.0
    side_two: float = 4.0
    side_three: float = 5.0
    triangle_perimeter: float = calculate_triangle_perimeter(
        side_one,
        side_two,
        side_three
    )
    print(
        f"Triangle perimeter | sides=({side_one:.1f}, "
        f"{side_two:.1f}, {side_three:.1f}) | "
        f"value={triangle_perimeter:.4f}"
    )

    rectangle_length: float = 8.0
    rectangle_width: float = 3.0
    rectangle_area: float = calculate_rectangle_area(
        rectangle_length,
        rectangle_width
    )
    print(
        f"Rectangle area | length={rectangle_length:.1f} | "
        f"width={rectangle_width:.1f} | value={rectangle_area:.4f}"
    )
    print()

    circle_count: int = 3
    triangle_count: int = 2
    rectangle_count: int = 4
    total_area: float = calculate_total_shape_area(
        circle_count,
        triangle_count,
        rectangle_count
    )
    print(
        f"Batch area | circles={circle_count} | "
        f"triangles={triangle_count} | rectangles={rectangle_count} | "
        f"value={total_area:.4f}"
    )

def print_header() -> None:
    print("Your Name")
    print("COP2047")
    print("Lab 3 - Shape Method Calls")
    print()

def calculate_circle_area(radius: float) -> float:
    return math.pi * radius * radius

def calculate_circle_perimeter(radius: float) -> float:
    return 2 * math.pi * radius

def calculate_triangle_area(base: float, height: float) -> float:
    return 0.5 * base * height

def calculate_triangle_perimeter(
    side_one: float,
    side_two: float,
    side_three: float
) -> float:
    return side_one + side_two + side_three

def calculate_rectangle_area(length: float, width: float) -> float:
    return length * width

def calculate_total_shape_area(
    circle_count: int,
    triangle_count: int,
    rectangle_count: int
) -> float:
    return shape_batch_calculator.calculate_total_area(
        circle_count,
        triangle_count,
        rectangle_count,
        calculate_circle_area,
        calculate_triangle_area,
        calculate_rectangle_area
    )

if __name__ == "__main__":
    main()
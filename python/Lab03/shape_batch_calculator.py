from collections.abc import Callable

def calculate_total_area(
        circle_count: int,
        triangle_count: int,
        rectangle_count: int,
        calculate_circle_area: Callable[[float], float],
        calculate_triangle_area: Callable[[float, float], float],
        calculate_rectangle_area: Callable[[float, float], float],
) -> float:
    circle_radius: float = 4.0
    triangle_base: float = 6.0
    triangle_height: float = 5.0
    rectangle_length: float = 8.0
    rectangle_width: float = 3.0

    one_circle_area: float = calculate_circle_area(circle_radius)
    one_triangle_area: float = calculate_triangle_area(
        triangle_base,
        triangle_height
    )
    one_rectangle_area: float = calculate_rectangle_area(
        rectangle_length,
        rectangle_width
    )

    total_circle_area: float = circle_count * one_circle_area
    total_triangle_area: float = triangle_count * one_triangle_area
    total_rectangle_area: float = rectangle_count * one_rectangle_area

    return total_circle_area + total_triangle_area + total_rectangle_area
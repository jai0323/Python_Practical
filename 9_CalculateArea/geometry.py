import math

# Square functions
def square_area(side):
    return side ** 2

def square_perimeter(side):
    return 4 * side

# Cube functions
def cube_surface_area(side):
    return 6 * (side ** 2)

def cube_volume(side):
    return side ** 3

# Circle functions
def circle_area(radius):
    return math.pi * (radius ** 2)

def circle_circumference(radius):
    return 2 * math.pi * radius

# Cylinder functions
def cylinder_surface_area(radius, height):
    return 2 * math.pi * radius * (radius + height)

def cylinder_volume(radius, height):
    return math.pi * (radius ** 2) * height

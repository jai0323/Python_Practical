	# Write a python program which contains user defined functions as a ‘module’ to calculate area, perimeter or surface area, volume for various shapes like square, cube, circle, cylinder. The user defined functions should accept the values for calculation as parameters and calculated values should be returned. Import the module and use appropriate functions. 

import geometry

def main():
    print("Choose a shape to calculate:")
    print("1. Square")
    print("2. Cube")
    print("3. Circle")
    print("4. Cylinder")
    choice = int(input("Enter your choice (1-4): "))

    if choice == 1:  # Square
        side = float(input("Enter the side length of the square: "))
        print(f"Area: {geometry.square_area(side)}")
        print(f"Perimeter: {geometry.square_perimeter(side)}")
    
    elif choice == 2:  # Cube
        side = float(input("Enter the side length of the cube: "))
        print(f"Surface Area: {geometry.cube_surface_area(side)}")
        print(f"Volume: {geometry.cube_volume(side)}")
    
    elif choice == 3:  # Circle
        radius = float(input("Enter the radius of the circle: "))
        print(f"Area: {geometry.circle_area(radius)}")
        print(f"Circumference: {geometry.circle_circumference(radius)}")
    
    elif choice == 4:  # Cylinder
        radius = float(input("Enter the radius of the cylinder: "))
        height = float(input("Enter the height of the cylinder: "))
        print(f"Surface Area: {geometry.cylinder_surface_area(radius, height)}")
        print(f"Volume: {geometry.cylinder_volume(radius, height)}")
    
    else:
        print("Invalid choice!")


main()

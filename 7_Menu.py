import math
while(True):
    print("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder\n6. log10(x)\n7. sin(x)\n8. cos(x)\n9. Exit1")
    c = int(input("Enter choice:"))

    if(c<6):
        a=int(input("Enter first number"))
        b=int(input("Enter first number"))
        if(c==1):
            print("Addition : ", a+b);
        elif(c==2):
            print("Subtraction : ",a-b);
        elif(c==3):
            print("Multiplication : ",a*b);
        elif(c==4):
            print("Division : ",a/b);
        elif(c==5):
            print("Remainder : ",a%b);

    elif(c>5):
        a=int(input("Enter first number"))
        if(c==6):
            print("log10(x) : ",math.log(a));
        elif(c==7):
            print("Sin(x) : ", math.sin(a));
        elif(c==8):
            print("cos(x) : ", math.cos(a));

    else:
        print("Exit")
        break;
        

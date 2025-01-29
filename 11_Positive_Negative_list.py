list = [-1,1,2,2,-3,3,4,5,-8,-6,-7]
posInt = []
negInt = []

for i in range(len(list)):
    if(list[i]>=0):
        posInt.append(list[i])
    else:
        negInt.append(list[i])

print("Positive Integer = ", posInt)
print("Negative Integer = ", negInt)
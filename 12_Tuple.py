my_tuple = (10, 20, 30, 20, 40)

print("Length of the tuple:", len(my_tuple))

print("Count of 20 in the tuple:", my_tuple.count(20))

print("Index of 30 in the tuple:", my_tuple.index(30))

sorted_list = sorted(my_tuple)
print("Sorted tuple as a list:", sorted_list)

print("Minimum element in the tuple:", min(my_tuple))

print("Maximum element in the tuple:", max(my_tuple))

tuple1 = (10, 20, 30)
tuple2 = (10, 20, 40)

if tuple1 < tuple2:
    print("tuple1 is less than tuple2")
elif tuple1 > tuple2:
    print("tuple1 is greater than tuple2")
else:
    print("tuple1 is equal to tuple2")

reversed_tuple = tuple(reversed(my_tuple))
print("Reversed tuple:", reversed_tuple)

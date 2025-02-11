my_tuple = ((1,2),(3,4),(5,6),(7,8),(9,10))

def sumOfInnerTuple(my_tuple):
    sum_tup =[]
    for tup in my_tuple:
        s = sum(tup)
        sum_tup.append(s)
    return sum_tup

result= sumOfInnerTuple(my_tuple)
print("Sum of inner tuples :", result)



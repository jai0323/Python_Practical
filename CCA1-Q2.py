my_tuple = ((1,2),(3,4),(5,6),(7,8),(9,10))

def makeSingleTuple(my_tuple):
    single_tup =[]
    for tup in my_tuple:
        for i in tup:
            single_tup.append(i) 
    return single_tup

result= makeSingleTuple(my_tuple)
print("Single tuple :", result)
         
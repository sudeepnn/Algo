a,b,c=map(int,input("entre the three numbers").split(" "))
if(a>b):
    if(a>c):
        print("{} is greater no".format(a))
    else:
        print("{} is greater no".format(c))
else:
    if(b>c):
        print("{} is greater no".format(b))
    else:
        print("{} is greater no".format(c))

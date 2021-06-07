""" Computational Mathematics Numerical Integration Assignment
    Ardelia Shaula """


def f(x):
    return 1 - 1*x -4*x**3 + 2*x**5

def int_f(x):
    return 1 - 1*x**3/3 -4*x**4/4 + 2*x**5/5

# return 1 - 1*x**2/2 -4*x**3/3 + 2*x**4/4
#b ( trapezoid rule )
def trapezoid(a,b):
    return (b-a)*(f(a)+f(b))/2

#c ( trapezoid rule n )
def trapezoidC(a,b,n):
    return (b-a)*(f(a)+f(b))/2

def trapezoid_m(a,b,n):
    h = (b-a)/n
    x = a
    s = 0
    for i in range (1,n):
        # x = x + h
        s = s + f(a + i *h)
    return (b-a)*(f(a)+ 3*s+f(b))/(2*n)

print(" a)" , trapezoid(-2,4))
print(" b)",  trapezoidC(-2,4,4))
print(" c)",  trapezoid_m(-2,4,4))

#b) Result: 5280
#c) Result: 5280

# def simpson(f, a, b, n):
#     h=(b-a)/n
#     k=0.0
#     x=a + h
#     for i in range(1,n/2 + 1):
#         k += 4*f(x)
#         x += 2*h

#     x = a + 2*h
#     for i in range(1,n/2):
#         k += 2*f(x)
#         x += 2*h
#     return (h/3)*(f(a)+f(b)+k)

# simpson 1/3

def simpson1_3(a,b):
    h = (b-a)/2
    return h*(f(a)+4*f(a+b)/2)+f(b)/6

# multiple simpson 1/3

def simpson_1_3m(a,b,n):
    
    h = (b-a) / n
    x = a
    s = 0
    for i in range(1,n):
        x = x + h
        if i % 2 ==0:
            m = 2
        else:
            m = 4
        s = s + m* f(x)
    return (b-a)* (f(a)+ s + f(b)) / (3*n)

# print(simpson1_3(-2,4))
# print(simpson_1_3m(-2,4,4))
# print(int_f(4)-int_f(-2))


# simpson 3/8 

def simpson3_8(a,b):
    h = (b-a)/3
    return 3*h*(f(a)+3*(a+h)+3*f(a+2*h)+f(b))/8

def simpson38m(a, b, n):
    h = (b-a) / n
    x = a
    s = 0 
    for i in range(1,n ):
        x = x + h 
        if i % 3 == 0:
            m = 2
        else:
            m = 3
        s = s+ m*f(x)
    return 3*h*(f(a)+s+f(b))/8 



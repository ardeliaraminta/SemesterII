# Euler's method 
def f(x,y):
    return (2* x**3 + 12*x**2 + 20*x * y)

# s is step
def eulerMethod( x0, y, s, x ):
    temp = -0
 
    # Iterating till the point at which we need approximation
    while x0 < x:
        temp = y
        y = y + s * f(x0, y)
        x0 = x0 + s
 
    print("solution at x = ", x, " is ", y )
     
x0 = 0
y0 = 1# step to change
 

eulerMethod(x0, y0, 1, 0.5)
eulerMethod(x0, y0, 2, 0.5)
eulerMethod(x0, y0, 4, 0.5)
eulerMethod(x0, y0, 8, 0.5)
eulerMethod(x0, y0, 16, 0.5)
def f(x,y):
  return -2* x**3 + 12*x**2 - 20*x+ + 8.5

def eular(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt-x)/n
  for i in range(0,n):
    x = x + h
    y = y + f(x,y)*h
    xi.append(x)
    yi.append(y)
  return xi,yi

def heun(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt-x)/n
  for i in range(0,n):
    k1 = f(x,y)
    k2 = f(x+h,y+k1*h)
    y = y + (k1+k2)*h/2
    xi.append(x+(i+1)*h)
    yi.append(y)
  return xi,yi

def midpoint(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt-x)/n 

  for i in range(0,n):
    x = x + h
    y = y + f(x,y) * h
    xi.append(x)
    yi.append(y)
  return xi, y

def ralston(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt -x)/n

  for i in range(0,n):
    k1 = f(x,y)
    k2 = f(x+3*h/4, y+3*k1/4)
    y = y + (k1/3+5*k2/3)*h
    xi.append(x+(i+1)*h)
    yi.append(y)
  return xi, yi  

def range_kutta4(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt -x)/n
  for i in range(0,n):
    k1 = f(x,y)
    k2 = f(x+h/2, y +k1*h/2)
    k3 = f(x+h/2, y +k2*h/2)
    k4 = f(x+h, y +k3*h)
    y = y + (k1+2*k2+2*k3+k4)*h/6
    xi.append(x+(i+i)*h)
    yi.append(y)
  return xi, yi 

x = 0 #x0
y = 1 #y0
xt = 0.5

xi, yEular = eular(x,y,xt,n)
xi, yHeun = heun(x,y,xt,n)
xi, yRalston = ralston(x,y,xt,n)
xi, yr4 = range_kutta4(x,y,xt,n)

print("Exact Solution: ", 3.751521-yEular[1])
print("Eular:", yEular[1], "True error:",3.751521-yEular[1])
print("Ralston:", yRalston[1],  "True error:",3.751521-yRalston[1])
print("Heun:", yr4[1],  "True error:",3.751521-yr4[1])
print("Heun:", yHeun[1],  "True error:",3.751521-yHeun[1])


print("Exact Solution: ", 3.751521-yEular[1])
print("Eular:", yEular[2], "True error:",3.751521-yEular[2])
print("Ralston:", yRalston[2],  "True error:",3.751521-yRalston[2])
print("Heun:", yr4[2],  "True error:",3.751521-yr4[2])
print("Heun:", yHeun[2],  "True error:",3.751521-yHeun[2])

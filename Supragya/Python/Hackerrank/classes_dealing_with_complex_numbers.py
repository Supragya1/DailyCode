# Day42_Q2.py
''' Classes: Dealing with Complex Numbers Hackerrank'''
import math

class Complex(object):
    def __init__(self, real, imaginary):
        self.number = complex(real, imaginary)
        self.real = self.number.real
        self.imaginary = self.number.imag

    def __add__(self, no):
        res = self.number + complex(no.real, no.imaginary)
        return Complex(res.real, res.imag)

    def __sub__(self, no):
        res = self.number - complex(no.real, no.imaginary)
        return Complex(res.real, res.imag)

    def __mul__(self, no):
        res = self.number * complex(no.real, no.imaginary)
        return Complex(res.real, res.imag)

    def __truediv__(self, no):
        res = self.number / complex(no.real, no.imaginary)
        return Complex(res.real, res.imag)

    def mod(self):
        res = abs(self.number)
        return Complex(res.real, res.imag)
    
    def __str__(self):
        if self.imaginary == 0:
            result = "%.2f+0.00i" % (self.real)
        elif self.real == 0:
            result = "0.00+%.2fi" % (self.imaginary) if self.imaginary >= 0 else "0.00-%.2fi" % (abs(self.imaginary))
        elif self.imaginary > 0:
            result = "%.2f+%.2fi" % (self.real, self.imaginary)
        else:
            result = "%.2f-%.2fi" % (self.real, abs(self.imaginary))
    
        return result

if __name__ == '__main__':
    c = map(float, input().split())
    d = map(float, input().split())
    x = Complex(*c)
    y = Complex(*d)
    print(*map(str, [x+y, x-y, x*y, x/y, x.mod(), y.mod()]), sep='\n')
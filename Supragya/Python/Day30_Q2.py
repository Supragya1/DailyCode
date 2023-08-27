''' Shape and Reshape Hackerrank '''
import numpy

c = numpy.array(list(map(int, input().split())))
print(numpy.reshape(c,(3,3)))

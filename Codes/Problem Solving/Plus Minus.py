#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the plusMinus function below.
def plusMinus(n,arr):
    a=0
    b=0
    c=0
    for i in range(n):
        if(arr[i]>0):
            a=a+1
        if(arr[i]<0):
            b=b+1
        if(arr[i]==0):
            c=c+1        
    print(float(a/n))
    print(float(b/n))
    print(float(c/n))

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(n,arr)

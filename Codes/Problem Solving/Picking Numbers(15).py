#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    # Write your code here 
    freq = {} 
    for i in range(n): 
        if (a[i] in freq): 
            freq[a[i]] += 1
        else: 
            freq[a[i]] = 1
    ans = 0
    for key, value in freq.items(): 
        if (key+1 in freq) :     
            ans = max(ans, freq[key] + freq[key + 1]) 
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()

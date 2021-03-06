#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.
def isBalanced(s):
    stack = []
    closer = {'{': '}', '[': ']', '(': ')'}
    for bracket in s:
        if bracket in {'}',']',')'}:
            if not stack or closer[stack.pop()] != bracket:
                return "NO"
        else:
            stack.append(bracket)
    return "NO" if stack else "YES"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        s = input()

        result = isBalanced(s)

        fptr.write(result + '\n')

    fptr.close()

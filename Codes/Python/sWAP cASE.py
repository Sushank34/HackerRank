def swap_case(s):
    arr=""
    for i in range(0,len(s)):
        if s[i].isupper()==True:
            arr+=(s[i].lower())
        else:
            arr+=(s[i].upper())    
    return arr

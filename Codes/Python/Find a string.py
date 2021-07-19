def count_substring(string, sub_string):
    x=0
    for i in range(0,len(string)):
        if(sub_string[0:]==string[i:i+len(sub_string)]):
            x=x+1
        else:
            x=x 
    return x

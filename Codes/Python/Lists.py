if __name__ == '__main__':
    N = int(input())
    list=[]
    for i in range(0,N):
        s=input()
        if "insert" in s:
            x=s.split()
            list.insert(int(x[1]),int(x[2]))
        elif "remove" in s:
            x=s.split()
            list.remove(int(x[1]))
        elif "append" in s:
            x=s.split()
            list.append(int(x[1]))
        elif "sort" in s:
            list.sort()
        elif "pop" in s:
            list.pop()
        elif "reverse" in s:
            list.reverse()
        elif "print" in s:
            print(list)

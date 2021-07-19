if __name__ == '__main__':
    s = input()
    def strValidators(validators, string):
        for validator in validators:
            if validator in dir(str):
                yield any(getattr(char, validator)() for char in string)

    v = ['isalnum', 'isalpha', 'isdigit', 'islower', 'isupper']
    for boolean in strValidators(v, s):
        print(boolean)

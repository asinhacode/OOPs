print("Hello World")
print(2+3)


# cannot mix int and character
# variable declaration
character_name = "John"
character_age = "35"

print("There once was a man name " + character_name)
print("He was " + character_age + " years old.")

# Types of variable
character_name = "Sinha"
character_age = 28
character_height = 5.10
isMale = True

# Escape Sequence
print("He said, \"I am who I am\"")

# Funtions of string
phrase = "I am, who I am."
print(phrase.lower().isupper())

#  length of the string
print(len(phrase))

# 4th character
print(phrase[3])

# index of a character
print(phrase.index("m"))

# replace
print(phrase.replace("I am", "Who I am"))

# Numbers
pos = 2
decimal = 2.9
neg = -2

print(pos)
print(decimal)
print(neg)

print(pos * neg)

# using numbers with strings
print(str(neg) + " trying to turn it into a " + str(pos))

# absolute values
print(abs(neg))

# convert a number into a string
troubled_twos = str(neg)
print("I am " + troubled_twos)

# some more functions
print(pow(pos, -4))
print(min(pos, neg))
print(round(pow(pos,neg)))

# importing library
from math import *
print(ceil(decimal)) # from math library

# math is a module


# ask for user input
name = input("Enter your name: ")
print("Hello " + name)

# input() always a string
age = input("Enter your age: ")
print("You are: " + age)

# convert age into a number.
age = int(age)
print("Double your age: " )
print(2 * age)
print("You are: " + str(age))

# float
age = float(age) + 0.3
print("Double your age: " )
print(2 * age)

# madlib
adjective = input("Enter an adjective: ")
noun = input("Enter a noun: ")
noun2 = input("Enter a noun2: ")

print(noun + " is a " + adjective + " " + noun2)

# importing library
from math import *

# arrays, lists
friends = ["Apple", "NoOne", "Myself"]
mixture = ["I am ", 98, " years old."]
print(mixture)
print(mixture[0] + str(mixture[1]) + mixture[2])

# print partial numbers
prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37]
print(prime[4:])

# print using negative indexes
print(prime[-6:])
print(prime[-1]) # last element

# range
print(prime[4:9])

# out of range
# print(prime[43])

# extending an array with another array
even = [2, 4, 6, 8]
odd = [1, 3, 5, 7, 9]

print(even)
print(odd)

# increase the list
odd.extend(even)
print(odd)

# extending by copying itself
odd.extend(odd)
print(odd)

print(even)

# append : add right at the end of the list
even.append(10)
print(even)

# insert at a particular index
# first number, the index where the value goes in
even.insert(0, 0)
print(even)

even.insert(-1, 12)
print(even)

# remove the second last element
even.remove(12) # have to specify the value not the index number of the list
print(even)

# remove the last element.
# instead of specifying the value, use the index
even.pop()
print(even)

# remove the first index
even.pop(0)
print(even)

# find the index of the value provided
print(even.index(6))


num1 = input("Enter first number: ") # STRINGS
num2 = input("Enter second number: ")

# Convert String into an Int

addition = int(num1) + int(num2);
subtraction = int(num1) - int(num2);
multiply = int(num1) * int(num2);
division = int(num1) / int(num2);

print(addition)
print(subtraction)
print(multiply)
print(division)

odd = [1, 3 , 5, 7, 9, 11, 13, 15, 17, 19]
even = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

print(odd)
print("Sixth Element: " + str(odd[5]))

# extend the array by adding another array
odd.extend(even)
print(odd)

even.extend(odd)
print(even)

# extend can be used with different value types
wierd = ["Anu", "Pam"]
even.extend(wierd)
print(even)

# insertion
even.insert(13, "sixty")
print(even)

even.extend(odd)
even.extend(odd)

# count a number of times 8 is present in list even
print(even.count(8))

print(even)

# reverse a list
even.reverse()
print(even);

# copy a list
even_copy = even.copy()
even_copy.reverse()
print(even_copy)

# get part of the array
print(even_copy[65:])

# tuples: can't add or change it
# they are immutable
coordinates = (0, -1)
print(coordinates)

# accessing individual coordinate
print(coordinates[0] + 2 + coordinates[1])

# add values
co1 = [(0, 1), (10, 11), (3,3), (5,1)]

# accessing different parts of tuple
print(co1[1][1])

co2 = [(0, 100,3), (10, 11,12), (3,3,6), (5,1,-1)]
print(co2[0][1])

# functions and conditional logic
def cigar_party(cigars, is_weekend):
  if is_weekend and cigars > 39:
    return True
    
  elif (cigars > 39 and cigars < 61):
    return True
    
  else:
    return False

  # FUNCTIONS
# declare with :
def say_hi():
  print("Hello User!")
  print("How are you today?")

# add arguments
def say_hi_modified(name):
    print("Hello " + name)
    print("How are you today?")

# return something
def cube(num):
    return num * num * num



# call the function
say_hi()
say_hi_modified("Sinner")

# return values
cubedValue = cube(80)
print(cubedValue)

# conditional logic
TRUE1 = False
FALSE1 = True

if TRUE1:
    print("MALE")

else:
    print("FEMALE")

def findMax(n1, n2, n3):
    temp = n1
    if temp < n2:
        temp = n2

    if temp < n3:
        temp = n3

    return temp

print(findMax(136, 15, 70))

# version 1
def calculator(n1, op, n2):
    if op == "+":
        return int(n1) + int(n2)

    elif op == "-":
        return int(n1) - int(n2)

    elif op == "*":
        return int(n1) * int(n2)

    elif op == "%":
        return int(n1) % int(n2)
    else:
        return int(n1) / int(n2)




n1 = input("Enter number:\t")
op = input("Enter operator:\t")
n2 = input("Enter number:\t")

print(calculator(n1,op,n2))

# version 2
def calculator(n1, op, n2):
    if op == "+":
        return n1 + n2

    elif op == "-":
        return n1 - n2

    elif op == "*":
        return n1 * n2

    elif op == "%":
        return n1 % n2
    else:
        return n1 / n2



# add float to reduce conversion on each
n1 = float(input("Enter number:\t"))
op = input("Enter operator:\t")
n2 = float(input("Enter number:\t"))

print(calculator(n1,op,n2))

# DICTIONARY
monthConversion ={
    "M": "MONDAY", "T": "TUESDAY", "W": "WEDNESDAY", "J": "THURSDAY", "F": "FRIDAY", "S": "SATURDAY", "D": "SUNDAY"
}

print(monthConversion["D"])
print(monthConversion["J"])
print(monthConversion["S"])
print(monthConversion["F"])

print(monthConversion.get("T"))

# introduction to loops
i = 0
while i < 10:
    print("Hello World: " + str(i))
    i += 1
    
# GUESS GAME
secret = 7
guess = " "

while guess != secret:
    guess = int(input("Enter your choice:\t"))

print("CORRECT!")

# GUESS GAME, version 2

secret = 7
guess = " "
guess_count = 0

# version 2 with guess count
while guess != secret:
    guess = int(input("Enter your choice:\t"))
    if guess < secret:
        print("LOW")

    else:
        print("HIGH")

    guess_count += 1


print("CORRECT!")
print(guess_count)




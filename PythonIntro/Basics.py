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






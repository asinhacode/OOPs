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

# A single line comment

# add 2 numbers
print(-10 + 11)

# variables make sense the moment you assign values to them.
myName = "notImportant"

# print part of name
print(myName[2:])

# convert to upper
print(myName.upper())

# create a list
natural = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(natural)

# print part of the list
print(natural[2:6])

# adding to the end
natural.append(10)
print(natural.reverse())

# insert at a particular index
natural.insert(0, -1)
print(natural)

# add a layer of complexity
complexity = {2: 'u', 0: 'A', 1: 'n', 3: 'p', 4: 'a', 5: 'm'}
print(complexity)

# add individual members
print(complexity[0] + complexity[1] + complexity[2] + complexity[3] + complexity[4] + complexity[5])

# use the get method
print(complexity.get(5))

# add another element
complexity[6] = '.'
print(complexity)


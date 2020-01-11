import turtle
import tkinter

me_turtle = turtle.Turtle() # declare object

# made an octagon
i = 0
while i < 8:
    me_turtle.forward(100)
    me_turtle.right(45)  # change direction
    i += 1

tkinter.mainloop()

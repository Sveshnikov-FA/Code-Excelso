import random
import curses
import winsound

s = curses.initscr()
curses.curs_set(0)
screenHeight, screenWidth = s.getmaxyx()
curses.start_color()
curses.use_default_colors()
w = curses.newwin(screenHeight, screenWidth, 0, 0)
w.keypad(1)
w.timeout(100)

snek_x = int(screenWidth/4)
snek_y = int(screenHeight/2)
snek = [
    [snek_y, snek_x],
    [snek_y, snek_x-1],
    [snek_y, snek_x-2]
]

snek_food = [int(screenHeight/2), int(screenWidth/2)]
w.addch(int(snek_food[0]), int(snek_food[1]), curses.ACS_DIAMOND)
key = curses.KEY_RIGHT
curses.init_pair(1, curses.COLOR_BLUE, curses.COLOR_BLACK)


def mvmt(key):
    next_key = w.getch()
    key = key if next_key == -1 else next_key
    if snek[0][0] in [screenHeight, 0] or snek[0][1] in [0, screenWidth] or snek[0] in snek[1:]:
        end_of_game()

    new_head = [snek[0][0], snek[0][1]]

    if key == curses.KEY_DOWN:
        new_head[0] += 1
    if key == curses.KEY_UP:
        new_head[0] -= 1
    if key == curses.KEY_LEFT:
        new_head[1] -= 1
    if key == curses.KEY_RIGHT:
        new_head[1] += 1
    snek.insert(0, new_head)
    return key


def replace_snek_food(snek_food):
    if snek[0][0] == snek_food[0] and snek[0][1] == snek_food[1]:
        winsound.Beep(2000,250)
        snek_food = None
        while snek_food is None:
            snek_food = [
                random.randint(1, screenHeight-1),
                random.randint(1, screenWidth-1)
            ]
        w.addch(int(snek_food[0]), int(snek_food[1]), curses.ACS_DIAMOND)
    else:
        tail = snek.pop()
        w.addch(int(tail[0]), int(tail[1]), ' ')
    return snek_food


def end_of_game():
    print("You scored " + str(len(snek)-3))
    tl = 500
    winsound.Beep(1500, tl)
    winsound.Beep(750, tl)
    curses.endwin()
    quit()

while True:
    key = mvmt(key)
    snek_food = replace_snek_food(snek_food)
    try:
        w.addch(int(snek[0][0]), int(snek[0][1]), curses.ACS_CKBOARD,curses.color_pair(1))
    except curses.error:
        end_of_game()
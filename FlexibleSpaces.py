import sys
rl = 0

for index, line in enumerate(sys.stdin):
    if index % 2 is 0:
        # save the room length
        rl = int(line.split()[0])
        continue

    wall_list = [0]
    for wall in line.split():
        wall_list.append(int(wall))
    wall_list.append(rl)

    output_list = []
    for i, wall in enumerate(wall_list):
        if i is 0:
            continue
        if i+1 >= len(wall_list):
            continue
        for j, other_wall in enumerate(wall_list[:i]):
            output_list.append(i - j)

    output_list = list(set(output_list)).sort()
    for item in output_list:
       print(item, sep='', end=' ')
    exit()
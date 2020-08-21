template = {
    'A 12': 0, 'A 3': 0, 'A 6': 0, 'A 9': 0,
    'B 12': 0, 'B 3': 0, 'B 6': 0, 'B 9': 0,
    'C 12': 0, 'C 3': 0, 'C 6': 0, 'C 9': 0,
    'D 12': 0, 'D 3': 0, 'D 6': 0, 'D 9': 0,
}
prices = [100, 75, 50, 25]

sessions = []
tests = int(input())  # 5
for i, T in enumerate(range(tests)):
    requests = int(input())  # 12, 7, 2, 1, *
    if requests == 0:
        sessions[i].append([])
    for j, N in enumerate(range(requests)):
        if j == 0:
            sessions.append([])
        session = input()
        print(sessions)
        print(i)
        sessions[i].append(session)

tables = {}
for i, session in enumerate(sessions):
    tables[i+1] = template.copy()
    for s in session:
        tables[i+1][s] += 1

new_tables = {}
for k, v in tables.items():
    new_tables[k] = {}
    list_d = list(tables[k].items())
    list_d.sort(key=lambda i: i[1])
    for j in list(reversed(list_d)):
        key = new_tables[k].get(j[0], None)
        if key is None:
            l = [i[0] for i in list(new_tables[k].keys())]
            if j[0][0] not in l:
                new_tables[k][j[0]] = j[1]

days = {}
for k, v in new_tables.items():
    days[k] = 0
    count = 0
    for k1, v1 in v.items():
        time = k1.split(' ')[-1]
        if v1 == 0:
            days[k] -= 100
        else:
            days[k] += prices[count] * v1
        count += 1

total_cost = 0
answer = ''
for day, price in days.items():
    total_cost += price
    answer += str(price) + ' '

result = answer + str(total_cost)
print(result)
def calculate_student_id(scores):
    humanities_building = 508
    international_building = 108
    engineering_building = 212
    itbt_building = 305
    haengwon_park_building = 707
    postal_code = 4763

    korean, math, english, inquiry, second_language = 0, 0, 0, 0, 0
    if len(scores) >= 1:
        korean = scores[0]
    if len(scores) >= 2:
        math = scores[1]
    if len(scores) >= 3:
        english = scores[2]
    if len(scores) >= 4:
        inquiry = scores[3]
    if len(scores) == 5:
        second_language = scores[4]

    if korean > english:
        first_part = (korean - english) * humanities_building
    else:
        first_part = (english - korean) * international_building

    if math > inquiry:
        second_part = (math - inquiry) * engineering_building
    else:
        second_part = (inquiry - math) * itbt_building

    third_part = second_language * haengwon_park_building

    student_id = (first_part + second_part + third_part) * postal_code
    return student_id

T = int(input())
scores = list(map(int, input().split()))

print(calculate_student_id(scores))

def solution(str1, str2):
    answer = ''
    
    state = True
    
    index1 = 0
    index2 = 0
    
    for i in range(len(str1)+len(str2)):
        if state and len(str1) > index1 :
            answer += str1[index1]
            index1 += 1
            state = False
        elif not state and len(str2) > index2 :
            answer += str2[index2]
            index2 += 1
            state = True
    return answer
def solution(numlist, n):
    # 버블 정렬을 사용하여 numlist를 직접 정렬합니다.
    # 리스트의 길이만큼 반복합니다.
    list_len = len(numlist)
    for i in range(list_len):
        # 마지막 i개의 원소는 이미 정렬되었으므로 제외하고 반복합니다.
        for j in range(0, list_len - i - 1):
            # 인접한 두 원소 num1, num2를 가져옵니다.
            num1 = numlist[j]
            num2 = numlist[j+1]
            
            # n과의 거리를 계산합니다.
            dist1 = abs(n - num1)
            dist2 = abs(n - num2)
            
            # 정렬 조건 확인:
            # 1. num2가 num1보다 n에 더 가깝거나 (dist2 < dist1)
            # 2. 거리가 같으면서 num2가 num1보다 클 때 (dist1 == dist2 and num2 > num1)
            # 두 원소의 위치를 바꿉니다.
            if dist2 < dist1 or (dist1 == dist2 and num2 > num1):
                numlist[j], numlist[j+1] = numlist[j+1], numlist[j]
    
    # 정렬된 리스트를 반환합니다.
    return numlist
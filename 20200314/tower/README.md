## 01. 이해 : 
    탑 꼭대기에서 보낸 신호는 신호를 보낸 탑보다 높은 탑에서만 수신한다.
    한 번 수신된 신호는 다른 탑으로 송신되지 않는다.
    신호는 왼쪽부터 오른쪽으로 진행
    탑의 높이를 담은 배열 heights가 매개변수로 주어질 때 각 탑이 쏜 신호를 어느 탑에서 받았는지 기록한 배열을 return.
    신호를 수신하는 탑이 없으면 0으로 표시한다.
## 02. 계획 : 
    처음 들어온 receiver list를 마지막부터 하나씩 꺼내서 수신탑보다 값이 더 큰 수가 나올 때 까지 값을 삭제한다
    해당 값의 index를 list에 저장한다
    만약 더 큰 수가 없으면 0을 리턴한다
    
## 03. 실행 

## 04. 회고 : 
    for문을 꼭 고차함수 forEach로만 진행해야하는 것은 아니다. 고차함수는 문제를 푼 나중에 리펙토링을 해도 되니 처음에는 문제를 푸는 것에만 집중해서 풀기.
    indexOfLast가 해당되는 모든 인덱스를 return 하는 줄 알았는데 가장 마지막 index를 return 하는 거였음.
    요소를 탐색하는 함수들의 return 범위에 대해서 제대로 숙지하고 있을 것

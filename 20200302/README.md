
## 1. 이해: 
    1번 수포자 - 1 2 3 4 5 ...
    2번 수포자 - 2 1 2 3 2 4 2 5 ...
    3번 수포자 - 3 3 1 1 2 2 4 4 5 5 ...
    1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지     return할 것
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 출력


## 2. 계획:
    1. 1~3 수포자의 패턴에 맞는 각각의 패턴을 만든 후 answers size에 해당하는 배열을 새로 만든다 (5로 나눈 몫이 반복 횟수, 나머지가 마지막 index)
    answers와 비교
    2. matching 된 value를 count하여 더 많은 값을 가지고 있는 값 부터 정렬
    3. count가 같으면 오름차순 정렬
    4. count가 0일 경우 answer배열에서 빠진다
    
    
    ---
    
    answer값이 들어오면 size를 구해서 1번은 5, 2번은 8, 3번은 10으로 나누어 각각의 몫과 나머지를 구한다.
    몫만큼 for문을 돌리고, +1번 돌 때 나머지값에 해당하는 index에서 멈춘다.
    
    
 ## 3. 회고:
    [fail] answer에 맞춰 배열을 만드는게 비효율적인 것 같아 각각의 수포자들의 답에서 반복되는 부분만큼 answer 배열을 잘라 배교하려함. 
    각 배열의 인자를 비교하는 문법이 있는 것 같았는데 못찾음. 그래서 3중 for문을 돌게생김..... 그냥 answer 배열에 맞춰 수포자들의 답변을 반복시키는게 나을듯.
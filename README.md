# Algorithm
> 꾸준히 실력을 키워가자
---

## 개요
* 언어 : **Kotlin**
* 문제 사이트 : Programmars(_PRO_), Baekjun(_BOJ_), LeetCode
* 비고
  * ✅ -> 추천 문제  
  * ✏️ -> 다시 풀기
  * ‼️ -> 고난도 문제    
* LeetCode 문제는 ReadMe 문서 목록에 포함하지 않습니다.
* _[코틀린 coding guide](https://kotlinlang.org/docs/coding-conventions.html)_ 를 준수 합니다.

---

## 📚 학습 주제

|순서|유형|비고|
|--|--|--|
|01|누적합| |
|02|투포인터 & 슬라이딩 윈도우| |
|03|정렬| |
|04|완전 탐색| |
|05|이분 탐색| |
|06|그래프| |
|07|DFS & BFS| |
|08|그리디| |
|09|구현| |
|10|유니온 파인드 & 최소 신장 트리| |
|11|최단경로| |
|12|동적 계획법| |

---

## 누적합
### [🗂 누적합](./Baekjun_Programmars/PrefixSum)
|사이트|문제|난도|비고|
|--|--|--|--|
|BOJ|[구간 합 구하기5](https://www.acmicpc.net/problem/11660)|S1||
|BOJ|[슈퍼 마리오](https://www.acmicpc.net/problem/2851)|B1| |
|BOJ|[주지수](https://www.acmicpc.net/problem/15724)|S1| |
|BOJ|[이건 꼭 풀어야 해!](https://www.acmicpc.net/problem/17390)|S3| |
|BOJ|[🎵니가 싫어 싫어 너무 싫어 싫어 오지 마 내게 찝쩍대지마🎵 - 1](https://www.acmicpc.net/problem/20440)|G3| |

---

## 투포인터 & 슬라이딩 윈도우
### [🗂 투 포인터 & 슬라이딩 윈도우](./Baekjun_Programmars/TwoPointer)
|사이트|문제|난도|비고|
|--|--|--|--|
|BOJ|[수들의 합5](https://www.acmicpc.net/problem/2018)|Sliver 5| |
|BOJ|[블로그](https://www.acmicpc.net/problem/21921)|Sliver 3| |
|BOJ|[겹치는 건 싫어](https://www.acmicpc.net/problem/20922)|Sliver 1| |
|BOJ|[같이 눈사람 만들래?](https://www.acmicpc.net/problem/20366)|Gold 3| |

---

## 정렬
### [🗂 정렬](./Baekjun_Programmars/Sort)
|사이트|문제|난도|비고|
|--|--|--|--|
|PRO|[K번째 수](https://school.programmers.co.kr/learn/courses/30/lessons/42748)|LV.1| |
|PRO|[가장 큰 수](https://school.programmers.co.kr/learn/courses/30/lessons/42746)|LV.2| |
|PRO|[H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/42747)|LV.2| |
|BOJ|[센서](https://www.acmicpc.net/problem/2212)|Gold 5| |



---

## 완전 탐색
### [🗂 완전 탐색](./Baekjun_Programmars/BruteForce/)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 이분 탐색
### [🗂 이분 탐색](./Baekjun_Programmars/BinarySearch/)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 그래프
### [🗂 그래프](./Baekjun_Programmars/Graph)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## DFS & BFS
### [🗂 DFS & BFS](./Baekjun_Programmars/DFSBFS/)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 그리디
### [🗂 그리디](./Baekjun_Programmars/Greedy)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 구현
### [🗂 구현](./Baekjun_Programmars/Avatar/)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 유니온 파인드 & 최소 신장 트리
### [🗂 유니온 파인드](./Baekjun_Programmars/UnionFind/)
|사이트|문제|난도|비고|
|--|--|--|--|

---


## 최단경로
### [🗂 최단 경로](./Baekjun_Programmars/ShortestPath/)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 동적 계획법
### [🗂 동적 계획법](./Baekjun_Programmars/DP)
|사이트|문제|난도|비고|
|--|--|--|--|

---

## 기출 문제
### [🗂 기출 문제](./Baekjun_Programmars/Past)
|사이트|문제|난도|비고|
|--|--|--|--|

---

# ⏱️ 시간 복잡도별 알고리즘 정리

| 시간 복잡도     | 가능한 최대 N (1초 기준) | 대표 알고리즘 및 설명                                                  |
|------------------|---------------------------|-------------------------------------------------------------------------|
| **O(1)**         | 거의 무제한               | - 배열 접근<br>- 해시 조회 (`HashMap.get()` 등)                        |
| **O(log n)**     | 약 10¹⁸까지 가능          | - 이진 탐색 (`Binary Search`)                                          |
| **O(n)**         | ≤ 100,000,000             | - 배열 순회<br>- 누적합<br>- 투 포인터<br>- 카운팅 정렬                |
| **O(n log n)**   | ≤ 5,000,000 ~ 10,000,000  | - 정렬: Merge Sort, Quick Sort, Heap Sort<br>- 세그먼트 트리, 이진 힙 |
| **O(n²)**        | ≤ 10,000 ~ 20,000         | - 이중 for문<br>- 간단한 DP<br>- 삽입/선택/버블 정렬                   |
| **O(n³)**        | ≤ 500 ~ 1,000             | - 플로이드 와샬 (모든 정점쌍 최단 경로)<br>- 3중 중첩 루프             |
| **O(2ⁿ)**        | ≤ 20 ~ 25                 | - 백트래킹<br>- DFS로 부분집합/순열 탐색<br>- 비트마스크               |
| **O(n!)**        | ≤ 8 ~ 10                  | - 모든 순열 탐색<br>- 외판원 문제 (TSP)<br>- 완전탐색                  |

---

## 🧠 입력 크기별 권장 알고리즘

| 입력 크기 N     | 사용 가능한 시간 복잡도 | 추천 알고리즘 예시                         |
|------------------|--------------------------|---------------------------------------------|
| ≤ 10             | O(n!), O(2ⁿ)             | 완전탐색, 순열, 조합, 백트래킹             |
| ≤ 20             | O(2ⁿ)                    | 비트마스크, 부분집합 탐색                  |
| ≤ 100            | O(n³)                    | 플로이드 와샬, 완전탐색                     |
| ≤ 1,000          | O(n²)                    | 간단한 DP, 브루트포스                       |
| ≤ 100,000        | O(n log n), O(n)         | 정렬, 누적합, 투 포인터                    |
| ≤ 1,000,000      | O(n log n), O(n)         | 고속 정렬, 세그먼트 트리, 힙                |
| ≤ 100,000,000    | O(n), O(1)               | 슬라이딩 윈도우, 카운팅 정렬               |

---

## 📌 알고리즘 유형별 복잡도 요약

- **정렬**  
  - O(n log n): Merge Sort, Quick Sort, Heap Sort  
  - O(n): Counting Sort, Radix Sort (특수 상황)

- **탐색**  
  - O(log n): 이진 탐색  
  - O(n): 선형 탐색

- **그래프**  
  - O(V + E): DFS, BFS  
  - O(E log V): 다익스트라 (우선순위 큐)  
  - O(n³): 플로이드-워셜

- **DP**  
  - O(n): 피보나치 (Bottom-up)  
  - O(n²): LCS, 2차원 DP  
  - O(n log n): LIS (이진 탐색 기반)

---



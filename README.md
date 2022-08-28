# 2022 Hanium Project
# 자연어처리를 활용한 일기 감정 분석 및 컨텐츠 추천 프로그램
#### Project title : Gom-Gom
#### Project period : 2022.05 ~
#### Git Lab : https://lab.hanium.or.kr/22_HF252/22_hf252
-----------------------
## Description
- 본 프로젝트에서 개발한 프로그램(앱)은 사용자가 작성한 일기를 자연어 분석 모델을 통해 분석하여 매일 감정 상태를 기록함.
- 분석된 감정에 따라 사용자 맞춤 칭찬 및 위로를 제공함.
- 사용자는 자신의 감정을 인지하며 마음 건강을 확인할 수 있고, 사용자의 심리 상태에 따라 영화, 음악 등과 같은 컨텐츠를 추천함.
- 이를 통해 사용자의 삶의 질을 향상시키고 우울감 해소에 도움을 주고자 함.

<br>

### 서비스 시나리오
![image](https://user-images.githubusercontent.com/95534831/187061369-fad4878a-1059-4244-9299-0735262232f5.png)

<br>

### 주요 기능 및 실행 화면
| 기능 | 설명 | 실행 화면 | 
| --- | --- | --- |
| 카카오톡 로그인 | Kakao SDK for Android를 사용해 카카오톡 로그인 기능 구현 |![image](https://user-images.githubusercontent.com/95534831/187061742-be5c1bab-79c2-442b-9190-d0d79a03aa44.png)
| 감정 일기 달력 | 사용자가 특정 날짜에 일기를 작성했는지 일기 작성 여부를 판단하고, 해당 날짜의 감정을 달력에 표시, 일기가 작성된 날에는 해당 일기를 서버에 요청 |![image](https://user-images.githubusercontent.com/95534831/187061818-78b1fc56-6b42-4c37-b88d-0412bd9afbcc.png)|
| 일기 작성 | 일기 작성 및 작성완료 버튼을 통한 서버로 일기 데이터 전송 | ![image](https://user-images.githubusercontent.com/95534831/187061893-2ac7b734-670b-4ad8-883c-cfe40e9365d6.png) 
| 사용자 작성 일기 기반 감정분석 | 전송된 일기 데이터를 서버에서 자연어 처리를 통해 문장별 감정분석 을 실행, MPAndroidChart 라이브러리를 이용한 시각화 | ![image](https://user-images.githubusercontent.com/95534831/187061931-532f5230-1d91-47ff-a981-39c18994f5dd.png)
| 사용자 작성 일기 기반 콘텐츠 추천 | -사용자가 작성한 일기를 기반한 유사도 분석과 감정 분석 결과를 이용한 음악 및 영화 콘텐츠 추천 | ![image](https://user-images.githubusercontent.com/95534831/187061974-d45ae27b-d662-4045-8cce-34a4ec5ec5ec.png)



## Run
현재 계속 개발중인 프로젝트로 서버를 배포하고 있지 않아 실행 할 수 없습니다.

### Environment
> Client - Java11(Android Studio)
>
> Server - Java11(Spring boot)
>
> Cloud Server OS - ubuntu
>
> AI Model and NLP algorithm - Python 3.7.9

from fastapi import FastAPI # fastapi 클래스를 불러옵니다. 

app = FastAPI() # FastAPI 클래스를 바탕으로 app이란 인스턴스를 만듭니다. 


@app.get("/") # GET 메소드로 가장 루트 url로 접속할 경우
async def root(): # root() 함수를 실행하고
    return {"message": "Hello World"} # Hello World란 메시지 반환합니다.
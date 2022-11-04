from enum import Enum
from fastapi import FastAPI # fastapi 클래스를 불러옵니다. 

class ModelName(str, Enum):
    alexnet = "alexnet"
    resnet = "resnet"
    lenet = "lenet"

fake_items_db = [{"item_name": "Foo"}, {"item_name": "Bar"}, {"item_name": "Baz"}]


app = FastAPI() # FastAPI 클래스를 바탕으로 app이란 인스턴스를 만듭니다. 


@app.get("/") # GET 메소드로 가장 루트 url로 접속할 경우
async def root(): # root() 함수를 실행하고
    return {"message": "Hello World"} # Hello World란 메시지 반환합니다.


@app.get("/items/{item_id}") #경로 매개변수
async def read_item(item_id:int):  #타입이 있는 매개변수(타입이 없을 경우도 가능)
    return {"item_id": item_id} 

@app.get("/models/{model_name}")
async def get_model(model_name: ModelName):
    if model_name is ModelName.alexnet:
        return {"model_name": model_name, "message": "Deep Learning FTW!"}

    if model_name.value == "lenet":
        return {"model_name": model_name, "message": "LeCNN all the images"}

    return {"model_name": model_name, "message": "Have some residuals"}

@app.get("/items/")
async def read_item(skip: int = 0, limit: int = 10):
    return fake_items_db[skip : skip + limit]
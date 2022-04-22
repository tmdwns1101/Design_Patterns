## 싱글톤 패턴이란?

- 오직 객체 하나만 생성시키고, 생성된 객체를 어디에서든 참조하도록 하는 패턴.
- 하나의 인스턴스만 메모리에 생성되기 때문에 여러 쓰레드가 동시에 해당 인스턴스만 공유함으로써  효율적.

## 싱글톤 생성

**가장 간단한 방법**

```java
class Settings {
    private static Settings instance; //클래스 변수로 선언
    private Settings() {} //.. (1)
    
    public static Settings getInstance() {
        if(instance == null) {   //..(2)
            instance = new Settings(); 
        }
        return instance;
    }
}
```

(1) 싱글톤 패턴은 외부에서 new 키워드로 인스턴스를 생성하는 것을 막아야한다. (new 키워드로 인스턴스 생성시, 서로 다른 인스턴스 이기 때문)

(2) getInstance() static 메서드로만 해당 인스턴스를 가져올 수 있도록 한다.


### 문제점

- 위와 같이 할 경우 멀티 쓰레드 환경에서 문제가 생길 수 있음.
- 여러 쓰레드가 동시에 (2) 조건을 만족한 경우, 각각의 쓰레드는 서로 다른 인스턴스를 생성 될 수 있음.



### 해결책


**1. 이른 초기화(eager initialization) 사용**

```java
class Settings {
    private static final Settings INSTANCE = new Settings(); 
    private Settings() {} 
    
    public static Settings getInstance() {
        return INSTANCE;
    }
}
```

- 클래스 변수를 바로 초기화를 통해 멀티 쓰레드 환경에서도 안전한게 하나의 인스턴스만 참조하게 할 수 있다.
- But!!!,  getInstance() 메서드가 사용되지 않아도 Settings 클래스가 사용된다며, 무조건 INSTANCE 변수가 초기화 되기 때문에 자원이 낭비 될 수 있다.


**2. static inner 클래스 사용**

```java
class Settings {
  
    private Settings() {} 

    private static class SettingsHolder {
        static final Settings INSTANCE = new Settings();
    }
    
    public static Settings getInstance() {
        return SettingsHolder.Instance;
    }
}
```

- 멀티 쓰레드 환경에서도 안전하고, getInstance()를 사용할 때만 인스터스를 생성하기 때문에 자원 낭비를 줄일 수 있다.

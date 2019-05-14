#Servlet/Jsp
***
####EL(Expresion Language)
#####표현식
````
${cnt}
위의 식에서 cnt는 Java의 변수가 아닌 Attribute의 이름으로 해석됩니다.
request.setAttribute("cnt",new Integer(num))저장하면
${cnt}로 호출
````
- - -
+ ``${RESULT}``

정적메서드를 호출하는 식

+ ``${RESULT + 101}``

연산자를 포함하는 식

+ ``${m:sqrt(100)}``

자바의 정적 메서드를 호출하는 식

- - -
해당 영역의 Attribute를 출력할 때
--

+ ``${pageScope.RESULT}``

page이외에 request,session,application이 올 수 있다.

- - -
HTTP헤더 객체
--

+ ``${header["HTTP헤더 이름"]}``

방식으로 헤더 값을 불러 올 수 있다.
- - -
initParam 내장객체
--
+ ${initParam}
web.xml에
```
<param-name> name <param-name/>
<param-value> malldb <param-value/>
```

초기화해준 값(malldb)을 불러온다.
- - -

#표준 액션
##jsp:include와 include의 차이
>실행결과는 같지만 두 문법의 내부 작동방식은 서로 다릅니다.

+ jsp:include
  + 출력 결과를 jsp:include해서 넘겨준다
  + Jsp:include되는 페이지와 변수공유를 하지 않는다.
+ include
  + jsp페이지가 서블릿 클래스로 변환될 때 해당 웹 자원을 읽어 서블릿 클래스 코드의 일부로 만든다
  + 변수 공유 가능.

###jsp:forward 표준액션
**forward** 와 같은 기능
>jsp 페이지 내에서 다른 jsp 페이지를 호출할때 사용하는 메서드
jsp페이지가 할 일을 모두 마치고 난 다음에 다른 jsp 페이지를 호출하고자 할 때 사용하는 것이 좋다.

사용법
```html
<jsp:forward page="~.jsp"/>
```
````
forward와 sendRedirect의 차이점
1. sendRedirect 메서드는 URL을 웹 브라우저로 보내서 간접적으로 웹 자원을 호출,
   forward 메서드는 웹 서버쪽에서 직접 호출합니다.

2. sendRedirect 메서드를 이용하면 다른 웹 서버에 있는 자원도 호출 가능합니다,
   forward 메서드를 이용하면 같은 웹 서버,같은 웹 애플리케이션 디렉터리 내에있는 웹 자원만 호출 가능합니다.

3. sendRedirect 메서드를 이용하면 텍스트 데이터만 전달할 수 있지만, forward메서드를 이용하면
   객체 형태의 모든 데이터를 전달할 수 있습니다.

4. sendRedirect 메서드를 통해 한글 데이터를 전달하기 위해서는 URL을 인코딩해야 합니다.
   forward 메서드에서는 그런 작업이 필요하지 않습니다.
````

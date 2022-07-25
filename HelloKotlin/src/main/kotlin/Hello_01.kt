fun main() {
    var num1 = 10; //선언과 초기화 동시 진행
    var num2 = 20;
    var sum = num1 + num2;
    //문자열 Templete : 문자열 내 변수를 직접 사용
    println("$sum = $num1 + $num2");

    var num3 : Int = 0; //자바에서 사용하는 변수 명은 반드시 대문자로 시작해야 한다.
    var num4 : String = "1이"
    println(num3);
    println(num4);
    
    var ppuni = "뿌니" // final값으로, const와 같이 다시 값을 지정할 수 없는 역할을 가진다.
    println(ppuni);
    println("$num4 없다."); //중괄호는 쓰지 말자.

    for(i in 0..10){  //부등호 표시는 점 두개 찍어주면 된다. ..
        print("반복문으로 $i 만들기 ");
    }
    println();
    for(i in 0..10 step(2)){
        print("반복문으로 $i 만들기 ");
    }
    println();
    for(i in 100 downTo 10){
        print("반복문으로 $i 만들기 ");
    }
    println();
    for(i in 100 downTo 10 step(10)){
        print("반복문으로 $i 만들기 ");
    }
    println();
    var bYes = true
    if(bYes) {
        println("$bYes 는 참");
    } else {
        println("$bYes 는 거짓");
    }
    var array = intArrayOf(10,10,11,12,15,17); //정수형 요소를 포함하는 배열 선언
    for(ar in array){
        println("$ar");
    }
    for(ar in array.reversed()){ //배열 거꾸로 나열하기
        println("$ar");
    }
    for(i in 0 until array.count()){ // 0부터 배열 갯수 -1 : until
        println("${array[i]}");
    }
    var num5 = 1;
    while(num5 < 10){
        print("${num5++}, ");
    }





}//end main

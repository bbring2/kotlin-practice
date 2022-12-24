package lecture.type

fun printAgeIfPerson(obj: Any?) {
    if(obj is Person) {
        //is == instanceof !is == not is
        //as Person -> obj라는 변수를 Person 타입으로 간주한다.
        val person = obj as Person
        println(person.age)
        println(obj.age) //smartCast!
    }

    val person = obj  as? Person
    println(person?.age)
}

fun makeString() {
    val person = Person("최희정", 28)
    val log = "사람의 이름은 ${person.name} 이고 나이는 ${person.age}살 입니다."

}
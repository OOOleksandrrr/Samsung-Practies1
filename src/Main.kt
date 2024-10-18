fun main(){
    val student:Student? = Student()

    val unit =  student?.let{ st ->  // не возыращает обратного зн-ния
                                    // работаем с объектом через ключевое слово
        st.hi()
        st.bye()
        st.name = "Masha"

    }
    println(student?.name)
    val student2 = student?.apply{ // возврвщвет измененный объект
                                    // работаем с содержимым объекта
        hi()
        bye()
        name = "Vova"

    }
    println(student?.name)
    println(student2?.name)
    val count = Student().run{  // возвращает обратное зн-ние с последней строки
                                // работаем с содержимым объекта
        hi()
        bye()
        countOfDebts = 15
        countOfDebts
    }
    println(count)

    val str = with(Student()){ // возвращает обратное зн-ние с последней строки
                                // работаем с содержимым объекта
        hi()
        bye()
        name = "Georgy"
        name
    }
    println(str)

    val student3 = Student().also{st->     // возвращает изменненый объект
                                            // работаем с объектом через ключевое слово
        st.hi()
        st.bye()
        st.countOfDebts = 20
    }
    println(student3.countOfDebts)
    val student5 = student?.copy() as Student


}
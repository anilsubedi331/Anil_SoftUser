package com.anil.anilsoftuser.`object`

import com.anil.anilsoftuser.model.student

object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent= arrayListOf();
        lstStudent.add(student(
            studentName ="Robert downy jr",studentAge = "45",studentGender = "Male",
                studentAddress ="london", imageLink = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Robert_Downey%2C_Jr._2012.jpg/669px-Robert_Downey%2C_Jr._2012.jpg" ))

        lstStudent.add(student(
                studentName ="keanu reeves",studentAge = "56",studentGender = "Male",
                studentAddress ="lodon", imageLink = "https://i.insider.com/5d66d21e6f24eb396b6c8192?width=1000&format=jpeg&auto=webp"
        ))
    }
}
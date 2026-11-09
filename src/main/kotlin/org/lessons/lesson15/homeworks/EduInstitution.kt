package org.lessons.org.lessons.lesson15.homeworks


open class EduInstitution(val eduName: String, val id: Int, val location: String) {
}

open class School(eduName: String, id: Int, location: String) : EduInstitution(eduName, id, location) {
}

class PrimarySchool() : School("Super Primary School", 1, "Moscow") {
}

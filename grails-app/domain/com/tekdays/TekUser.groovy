package com.tekdays

class TekUser {
    String fullName
    String userName
    String password
    String email
    String website
    String bio

    // TekEvent tekEvent
    // static belongsTo = [TekEvent]

    String toString() { fullName }

    static constraints = {
        fullName()
        userName()
        email()
        website()
        bio maxSize:5000
    }
}

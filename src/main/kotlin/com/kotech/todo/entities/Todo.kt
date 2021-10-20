package com.kotech.todo.entities

import javax.persistence.*

@Table(name = "todo")
@Entity
open class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "title")
    open var title: String? = null

    @Column(name = "completed")
    open var completed: Boolean? = null
}

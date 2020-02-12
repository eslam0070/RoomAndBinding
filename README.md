## RoomDatabase and DataBinding with RecyclerView Android Example

## Now let's talk about Room
Room is a persistence library, part of the Android Jetpack.

Here is the video from Android Developers Channel:

[![Little red ridning hood](http://i3.ytimg.com/vi/SKWh4ckvFPM/maxresdefault.jpg)](https://www.youtube.com/watch?time_continue=100&v=SKWh4ckvFPM&feature=emb_logo "Little red riding hood - Click to Watch!")

Room provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.

Room is now considered as a better approach for data persistence than SQLiteDatabase. It makes it easier to work with SQLiteDatabase objects in your app, decreasing the amount of boilerplate code and verifying SQL queries at compile time.

## Why use Room?
* Compile-time verification of SQL queries. each @Query and @Entity is checked at the compile time, that preserves your app from crash issues at runtime and not only it checks the only syntax, but also missing tables.

* Boilerplate code

* Easily integrated with other Architecture components (like LiveData)

## Major problems with SQLite usage are
* There is no compile-time verification of raw SQL queries. For example, if you write a SQL query with a wrong column name that does not exist in real database then it will give exception during run time and you can not capture this issue during compile time.

* As your schema changes, you need to update the affected SQL queries manually. This process can be time-consuming and error-prone.

* You need to use lots of boilerplate code to convert between SQL queries and Java data objects (POJO).

## Room vs SQLite
Room is an ORM, Object Relational Mapping library. In other words, Room will map our database objects to Java objects. Room provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.

Difference between SQLite and Room persistence library:-
* In the case of SQLite, There is no compile-time verification of raw SQLite queries. But in Room, there is SQL validation at compile time.

* You need to use lots of boilerplate code to convert between SQL queries and Java data objects. But, Room maps our database objects to Java Object without boilerplate code.

* As your schema changes, you need to update the affected SQL queries manually. Room solves this problem.

* Room is built to work with LiveData and RxJava for data observation, while SQLite does not.

## Components of Room DB

![Little red ridning hood](https://miro.medium.com/proxy/1*nPLp8XsB7e529f82XgddyA.png)

Room has three main components of Room DB :
* Entity

* Dao

* Database

## DataBinding

Android DataBinding provides a way to tie the UI with business logic allowing the UI values to update automatically without manual intervention. This reduces lot of boilerplate code in your business logic that you usually write to sync the UI when new data is available. DataBinding is one of the android architecture components suggested by android.

In this article we are going to learn the basics of DataBinding and in the next article, a simple profile screen is built using the RecyclerView with DataBinding.

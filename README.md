# Bus Scheduler App

This folder contains the source code for the Bus Scheduler app.

# Introduction
The Bus Scheduler app displays a list of bus stops and arrival times. Tapping a bus stop on the first screen will display a list of all arrival times for that particular stop.

The bus stops are stored in a Room database. Schedule items are represented by the `Schedule` class and queries on the data table are made by the `ScheduleDao` class. The app includes a view model to access the `ScheduleDao` and format data to be display in a list, using `Flow` to send data to a recycler view adapter.



**Images**
=================================

<img src="https://user-images.githubusercontent.com/97167390/164260183-aa98c40f-1048-496e-ab40-453b8b3e4fd0.jpg" width="200" hight="150"> <img src="https://user-images.githubusercontent.com/97167390/164260390-eb388850-95a4-4e3e-8fb0-ba5cea30fb49.jpg" width="200" hight="150">

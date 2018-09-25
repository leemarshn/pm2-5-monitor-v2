I will assume there are four anchors at the time the stove is being put on.
1. When the stove is lit the anchors are able to detect the PM2.5 value.
2. The user tag(UWB) tag, send its location to the sensors/anchors.
3. An evaluation is done and the sensor the has the highest PM2.5 is sent to the RTLS and is stored in the database.
4. The PM Value = (the distance between the user location to the sensor with the highest PM)m3 * (the number of PM2.5 per m3)
5. Every time the the user location changes the evaluation is recalculated and stored in the database.

6. When the user add a new anchor/sensor the sensor with the lowest PM2.5 value is deactivated and the new anchor is activated.

In this I have to create a class that calculates the PM value it will have a methods that returns 
LowestPMValue
highestPMValue
uwbTagLocator
userDistance

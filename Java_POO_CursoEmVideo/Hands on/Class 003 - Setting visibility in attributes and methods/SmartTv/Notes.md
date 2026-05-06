Create a class SmartTV

Attributes

public String brand;
private int volume;
private boolean turnedOn;
private int channel;

Methods
Turn TV on/off
public void turnOn()
public void turnOff()
Change volume
public void increaseVolume()
public void decreaseVolume()

Rules:

volume cannot exceed 100
volume cannot go below 0
Change channel
public void nextChannel()
public void previousChannel()

Rules:

channels only work if TV is ON
Status
public void status()

Show:

brand
volume
current channel
if TV is on/off
Extra Challenge

Try preventing:

changing volume while TV is OFF
changing channels while TV is OFF
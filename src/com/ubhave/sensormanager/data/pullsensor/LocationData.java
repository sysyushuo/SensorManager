package com.ubhave.sensormanager.data.pullsensor;

import com.ubhave.sensormanager.data.SensorData;

import android.location.Location;

public class LocationData extends SensorData
{

	Location location;

	public LocationData(long senseStartTimestamp, Location location)
	{
		super(senseStartTimestamp);
		this.location = location;
	}

	public Location getLocation()
	{
		return location;
	}

	public String getDataString()
	{
		StringBuilder sb = new StringBuilder();

		if (location != null)
		{
			sb.append(location.getLatitude());
			sb.append(",");
			sb.append(location.getLongitude());
			sb.append(",");
			sb.append(location.getAccuracy());
			sb.append(",");
			sb.append(location.getSpeed());
			sb.append(",");
			sb.append(location.getBearing());
			sb.append(",");
			sb.append(location.getProvider());
			sb.append(",");
			sb.append(location.getSpeed());
			sb.append(",");
			sb.append(location.getTime());
			sb.append(";");
		}
		else
		{
			sb.append("NO_LOCATION_DATA");
		}

		return sb.toString();
	}

}

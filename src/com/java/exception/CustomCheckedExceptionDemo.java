package com.java.exception;

public class CustomCheckedExceptionDemo {
	public static void main(String[] args) {
		RailwayStation rs=new RailwayStation();
		try {
			rs.trainArrival();
		} catch (TrackException te) {
			// TODO: handle exception
			System.out.println(te);
		}

	}

}

class RailwayStation {
	boolean isTrackExist = false;

	void trainArrival() throws TrackException {
		if (isTrackExist) {
			System.out.println("train departed");
		} else {
			TrackException te = new TrackException();
			throw te;

		}

	}
}

class TrackException extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "track not found Exception";
	}

}

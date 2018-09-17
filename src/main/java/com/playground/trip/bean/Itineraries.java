package com.playground.trip.bean;

public class Itineraries {
	private Outbound outbound;
	private Inbound inbound;

	public Inbound getInbound() {
		return inbound;
	}

	public Outbound getOutbound() {
		return outbound;
	}

	public void setInbound(Inbound inbound) {
		this.inbound = inbound;
	}

	public void setOutbound(Outbound outbound) {
		this.outbound = outbound;
	}

	@Override
	public String toString() {
		return "Itineraries [outbound=" + outbound + ", inbound=" + inbound + "]";
	}
}

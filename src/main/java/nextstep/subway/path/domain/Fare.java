package nextstep.subway.path.domain;

import java.util.List;

import nextstep.subway.line.domain.Line;

public class Fare {
	private int fare;

	public Fare(int distance, List<Line> lines) {
		this.fare = DistanceFarePolicy.calculateFare(distance) + LineFarePolicy.calculateOverFare(lines);
	}

	public int value() {
		return fare;
	}
}

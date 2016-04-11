package graphics;

public class Sun {
	public Double mass = (double) 0;;
	public Double horizontalPosition = (double) 0;;
	public Double verticalPosition = (double) 0;;
	public Double horizontalSpeed = (double) 0;;
	public Double verticalSpeed = (double) 0;;
	public Double horizontalAcceleration = (double) 0;
	public Double verticalAcceleration = (double) 0;

	public Double getHorizontalAcceleration() {
		return horizontalAcceleration;
	}

	public void setHorizontalAcceleration(Double horizontalAcceleration) {
		this.horizontalAcceleration = horizontalAcceleration;
	}

	public Double getVerticalAcceleration() {
		return verticalAcceleration;
	}

	public void setVerticalAcceleration(Double verticalAcceleration) {
		this.verticalAcceleration = verticalAcceleration;
	}


	public Sun(Double theMass,
		Double theHorizontalPosition,
		Double theVerticalPosition,
		Double theHorizontalSpeed,
		Double theVverticalSpeed) {
		mass = theMass;
		horizontalPosition = theHorizontalPosition;
		verticalPosition = theVerticalPosition;
		horizontalSpeed = theHorizontalSpeed;
		verticalSpeed = theVverticalSpeed;
	}

	public Double getMass() {
		return mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}

	public Double getHorizontalPosition() {
		return horizontalPosition;
	}

	public void setHorizontalPosition(Double horizontalPosition) {
		this.horizontalPosition = horizontalPosition;
	}

	public Double getVerticalPosition() {
		return verticalPosition;
	}

	public void setVerticalPosition(Double verticalPosition) {
		this.verticalPosition = verticalPosition;
	}

	public Double getHorizontalSpeed() {
		return horizontalSpeed;
	}

	public void setHorizontalSpeed(Double horizontalSpeed) {
		this.horizontalSpeed = horizontalSpeed;
	}

	public Double getVerticalSpeed() {
		return verticalSpeed;
	}

	public void setVerticalSpeed(Double verticalSpeed) {
		this.verticalSpeed = verticalSpeed;
	}

}

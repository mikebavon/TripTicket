package tripticket.trip.dao;

import java.util.List;

import javax.persistence.EntityManager;

import tripticket.trip.model.Trip;

public interface TripDaoI {
	
	Trip add(Trip trip);
	
	Trip load(Trip trip);
	
	List<Trip> list(Trip filter);
	
	void delete(Long tripId);
	
	void setEm(EntityManager em);

}

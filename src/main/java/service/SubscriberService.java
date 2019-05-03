package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.atos.entities.Subscriber;

import repositories.SubscriberRepository;

@Service
public class SubscriberService {
	@Autowired 
	SubscriberRepository subscriberRepository;
	public Collection<Subscriber> getAll(){
		return subscriberRepository.getAllSubscribers();
	}
}

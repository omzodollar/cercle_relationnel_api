package ressource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.atos.entities.Subscriber;

import service.SubscriberService;

@RestController
@RequestMapping("/rest/neo4j/subscriber")
public class SubscriberResource {
	
	@Autowired
	SubscriberService subscriberService; 
	@GetMapping
	public Collection<Subscriber> getSubscriber(){
		return subscriberService.getAll();
	}

}

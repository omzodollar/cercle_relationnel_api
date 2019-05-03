package repositories;
import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.sn.atos.entities.Subscriber;
public interface SubscriberRepository extends Neo4jRepository <Subscriber,Long>{
	
	@Query("MATCH p=(:MSSIDN)-[:Nombre_Appel]->(:MSSIDN) RETURN p")
	public Collection<Subscriber> getAllSubscribers();

}

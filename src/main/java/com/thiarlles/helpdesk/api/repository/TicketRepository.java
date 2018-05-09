package com.thiarlles.helpdesk.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.thiarlles.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityIgnoreCaseContainingOrderByDateDesc(
			String title, String status, String priority, Pageable pageable);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusContainingAndPriorityAndUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pageable);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserAssignedIdOrderByDateDesc(
			String title, String status, String priority, Pageable pageable);
	
	Page<Ticket>findByNumber(Integer number, Pageable pages);

}

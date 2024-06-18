package com.jts.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.movie.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}

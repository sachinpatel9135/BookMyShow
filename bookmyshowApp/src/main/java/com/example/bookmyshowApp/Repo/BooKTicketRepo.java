package com.example.bookmyshowApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmyshowApp.beans.Ticket;


public interface BooKTicketRepo extends JpaRepository<Ticket, Integer> {

}

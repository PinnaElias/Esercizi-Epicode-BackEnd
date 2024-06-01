package it.epicode.progettoweekend.services;

import it.epicode.progettoweekend.DAO.EventsDAO;
import it.epicode.progettoweekend.DTO.EventDTO;
import it.epicode.progettoweekend.entities.Events;
import it.epicode.progettoweekend.entities.User;
import it.epicode.progettoweekend.exception.BadRequestException;
import it.epicode.progettoweekend.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventsService {

        @Autowired
        private EventsDAO eventsDAO;


        public Page<Events> getEvents(int pageNumber, int size, String orderBy) {
            if (size > 100) size = 100;
            Pageable pageable = PageRequest.of(pageNumber, size, Sort.by(orderBy));
            return eventsDAO.findAll(pageable);
        }


        public Events findById(UUID eventId) {
            return eventsDAO.findById(eventId).orElseThrow(() -> new NotFoundException(eventId));
        }

        public Events findByIdAndUpdate(UUID EventsId, Events updateEvents) {
            Events found = this.findById(EventsId);

            return eventsDAO.save(found);
        }
        public Events save(EventDTO newevent) {

            Events event = new Events();
            event.setDate(newevent.date());
            event.setDescription(newevent.description());
            event.setTitle(newevent.title());
            event.setPlace(newevent.place());
            event.setMaxPosti(newevent.maxPosti());
            return eventsDAO.save(event);

        }

        public void findByIdAndDelete(UUID EventsId) {
            Events found = this.findById(EventsId);
            eventsDAO.delete(found);
        }

}
